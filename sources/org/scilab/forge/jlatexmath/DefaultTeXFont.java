package org.scilab.forge.jlatexmath;

import java.io.InputStream;
import java.lang.Character;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.awt.Font;

public class DefaultTeXFont implements TeXFont {
    private static String[] defaultTextStyleMappings = null;
    private static FontInfo[] fontInfo = null;
    private static Map generalSettings = null;
    private static boolean magnificationEnable = true;
    private static Map parameters;
    private static Map symbolMappings;
    private static Map textStyleMappings;
    protected float factor;
    public boolean isBold;
    public boolean isIt;
    public boolean isRoman;
    public boolean isSs;
    public boolean isTt;
    private final float size;
    public static List loadedAlphabets = new ArrayList();
    public static Map registeredAlphabets = new HashMap();

    static {
        fontInfo = new FontInfo[0];
        DefaultTeXFontParser defaultTeXFontParser = new DefaultTeXFontParser();
        loadedAlphabets.add(Character.UnicodeBlock.of('a'));
        fontInfo = defaultTeXFontParser.parseFontDescriptions(fontInfo);
        parameters = defaultTeXFontParser.parseParameters();
        textStyleMappings = defaultTeXFontParser.parseTextStyleMappings();
        defaultTextStyleMappings = defaultTeXFontParser.parseDefaultTextStyleMappings();
        symbolMappings = defaultTeXFontParser.parseSymbolMappings();
        Map generalSettings2 = defaultTeXFontParser.parseGeneralSettings();
        generalSettings = generalSettings2;
        generalSettings2.put("textfactor", 1);
        int iIntValue = ((Number) generalSettings.get("mufontid")).intValue();
        if (iIntValue >= 0) {
            FontInfo[] fontInfoArr = fontInfo;
            if (iIntValue < fontInfoArr.length && fontInfoArr[iIntValue] != null) {
                return;
            }
        }
        throw new XMLResourceParseException("DefaultTeXFont.xml", "GeneralSettings", "mufontid", "contains an unknown font id!");
    }

    public DefaultTeXFont(float f) {
        this.factor = 1.0f;
        this.isBold = false;
        this.isRoman = false;
        this.isSs = false;
        this.isTt = false;
        this.isIt = false;
        this.size = f;
    }

    public DefaultTeXFont(float f, float f2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.size = f;
        this.factor = f2;
        this.isBold = z;
        this.isRoman = z2;
        this.isSs = z3;
        this.isTt = z4;
        this.isIt = z5;
    }

    public static void addTeXFontDescription(Object obj, InputStream inputStream, String str) {
        DefaultTeXFontParser defaultTeXFontParser = new DefaultTeXFontParser(obj, inputStream, str);
        fontInfo = defaultTeXFontParser.parseFontDescriptions(fontInfo);
        defaultTeXFontParser.parseExtraPath();
        textStyleMappings.putAll(defaultTeXFontParser.parseTextStyleMappings());
        symbolMappings.putAll(defaultTeXFontParser.parseSymbolMappings());
    }

    public static void addAlphabet(Object obj, Character.UnicodeBlock[] unicodeBlockArr, String str) {
        boolean z = false;
        for (int i = 0; !z && i < unicodeBlockArr.length; i++) {
            z = loadedAlphabets.contains(unicodeBlockArr[i]) || z;
        }
        if (z) {
            return;
        }
        TeXParser.isLoading = true;
        addTeXFontDescription(obj, JLatexMathAndroid.getResourceAsStream(str), str);
        for (Character.UnicodeBlock unicodeBlock : unicodeBlockArr) {
            loadedAlphabets.add(unicodeBlock);
        }
        TeXParser.isLoading = false;
    }

    public static void addAlphabet(AlphabetRegistration alphabetRegistration) {
        if (alphabetRegistration != null) {
            try {
                addAlphabet(alphabetRegistration.getPackage(), alphabetRegistration.getUnicodeBlock(), alphabetRegistration.getTeXFontFileName());
            } catch (FontAlreadyLoadedException unused) {
            }
        }
    }

    public static void registerAlphabet(AlphabetRegistration alphabetRegistration) {
        for (Character.UnicodeBlock unicodeBlock : alphabetRegistration.getUnicodeBlock()) {
            registeredAlphabets.put(unicodeBlock, alphabetRegistration);
        }
    }

    @Override
    public TeXFont copy() {
        return new DefaultTeXFont(this.size, this.factor, this.isBold, this.isRoman, this.isSs, this.isTt, this.isIt);
    }

    @Override
    public float getScaleFactor() {
        return this.factor;
    }

    @Override
    public float getAxisHeight(int i) {
        return getParameter("axisheight") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing1(int i) {
        return getParameter("bigopspacing1") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing2(int i) {
        return getParameter("bigopspacing2") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing3(int i) {
        return getParameter("bigopspacing3") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing4(int i) {
        return getParameter("bigopspacing4") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing5(int i) {
        return getParameter("bigopspacing5") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    private Char getChar(char c, CharFont[] charFontArr, int i) {
        char c2;
        int i2;
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
            c2 = 0;
        } else if (c >= 'a' && c <= 'z') {
            i2 = c - 'a';
            c2 = 2;
        } else if (c < 'A' || c > 'Z') {
            c2 = 3;
            i2 = c;
        } else {
            i2 = c - 'A';
            c2 = 1;
        }
        CharFont charFont = charFontArr[c2];
        if (charFont == null) {
            return getDefaultChar(c, i);
        }
        return getChar(new CharFont((char) (charFont.c + i2), charFont.fontId), i);
    }

    @Override
    public Char getChar(char c, String str, int i) {
        Object obj = textStyleMappings.get(str);
        if (obj == null) {
            throw new TextStyleMappingNotFoundException(str);
        }
        return getChar(c, (CharFont[]) obj, i);
    }

    @Override
    public Char getChar(CharFont charFont, int i) {
        float sizeFactor = getSizeFactor(i);
        boolean z = this.isBold;
        int itId = z ? charFont.boldFontId : charFont.fontId;
        FontInfo fontInfo2 = fontInfo[itId];
        if (z && charFont.fontId == charFont.boldFontId) {
            itId = fontInfo2.getBoldId();
            fontInfo2 = fontInfo[itId];
            charFont = new CharFont(charFont.c, itId, i);
        }
        if (this.isRoman) {
            itId = fontInfo2.getRomanId();
            fontInfo2 = fontInfo[itId];
            charFont = new CharFont(charFont.c, itId, i);
        }
        if (this.isSs) {
            itId = fontInfo2.getSsId();
            fontInfo2 = fontInfo[itId];
            charFont = new CharFont(charFont.c, itId, i);
        }
        if (this.isTt) {
            itId = fontInfo2.getTtId();
            fontInfo2 = fontInfo[itId];
            charFont = new CharFont(charFont.c, itId, i);
        }
        if (this.isIt) {
            itId = fontInfo2.getItId();
            fontInfo2 = fontInfo[itId];
            charFont = new CharFont(charFont.c, itId, i);
        }
        return new Char(charFont.c, fontInfo2.getFont(), itId, getMetrics(charFont, this.factor * sizeFactor));
    }

    @Override
    public Char getChar(String str, int i) {
        Object obj = symbolMappings.get(str);
        if (obj == null) {
            throw new SymbolMappingNotFoundException(str);
        }
        return getChar((CharFont) obj, i);
    }

    @Override
    public Char getDefaultChar(char c, int i) {
        if (c >= '0' && c <= '9') {
            return getChar(c, defaultTextStyleMappings[0], i);
        }
        if (c >= 'a' && c <= 'z') {
            return getChar(c, defaultTextStyleMappings[2], i);
        }
        return getChar(c, defaultTextStyleMappings[1], i);
    }

    @Override
    public float getDefaultRuleThickness(int i) {
        return getParameter("defaultrulethickness") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getDenom1(int i) {
        return getParameter("denom1") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getDenom2(int i) {
        return getParameter("denom2") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public Extension getExtension(Char r10, int i) {
        Font font = r10.getFont();
        int fontCode = r10.getFontCode();
        float sizeFactor = getSizeFactor(i);
        int[] extension = fontInfo[fontCode].getExtension(r10.getChar());
        Char[] charArr = new Char[extension.length];
        for (int i2 = 0; i2 < extension.length; i2++) {
            int i3 = extension[i2];
            if (i3 == -1) {
                charArr[i2] = null;
            } else {
                charArr[i2] = new Char((char) i3, font, fontCode, getMetrics(new CharFont((char) i3, fontCode), sizeFactor));
            }
        }
        return new Extension(charArr[0], charArr[1], charArr[2], charArr[3]);
    }

    @Override
    public float getKern(CharFont charFont, CharFont charFont2, int i) {
        int i2 = charFont.fontId;
        if (i2 == charFont2.fontId) {
            return fontInfo[i2].getKern(charFont.c, charFont2.c, getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT);
        }
        return 0.0f;
    }

    @Override
    public CharFont getLigature(CharFont charFont, CharFont charFont2) {
        int i = charFont.fontId;
        if (i == charFont2.fontId) {
            return fontInfo[i].getLigature(charFont.c, charFont2.c);
        }
        return null;
    }

    private Metrics getMetrics(CharFont charFont, float f) {
        float[] metrics = fontInfo[charFont.fontId].getMetrics(charFont.c);
        return new Metrics(metrics[0], metrics[1], metrics[2], metrics[3], f * TeXFormula.PIXELS_PER_POINT, f);
    }

    @Override
    public int getMuFontId() {
        return ((Number) generalSettings.get("mufontid")).intValue();
    }

    @Override
    public Char getNextLarger(Char r5, int i) {
        CharFont nextLarger = fontInfo[r5.getFontCode()].getNextLarger(r5.getChar());
        return new Char(nextLarger.c, fontInfo[nextLarger.fontId].getFont(), nextLarger.fontId, getMetrics(nextLarger, getSizeFactor(i)));
    }

    @Override
    public float getNum1(int i) {
        return getParameter("num1") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getNum2(int i) {
        return getParameter("num2") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getNum3(int i) {
        return getParameter("num3") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getQuad(int i, int i2) {
        return fontInfo[i2].getQuad(getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT);
    }

    @Override
    public float getSize() {
        return this.size;
    }

    @Override
    public float getSkew(CharFont charFont, int i) {
        char skewChar = fontInfo[charFont.fontId].getSkewChar();
        if (skewChar == 65535) {
            return 0.0f;
        }
        return getKern(charFont, new CharFont(skewChar, charFont.fontId), i);
    }

    @Override
    public float getSpace(int i) {
        return fontInfo[((Number) generalSettings.get("spacefontid")).intValue()].getSpace(getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT);
    }

    @Override
    public float getSub1(int i) {
        return getParameter("sub1") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSub2(int i) {
        return getParameter("sub2") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSubDrop(int i) {
        return getParameter("subdrop") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSup1(int i) {
        return getParameter("sup1") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSup2(int i) {
        return getParameter("sup2") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSup3(int i) {
        return getParameter("sup3") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSupDrop(int i) {
        return getParameter("supdrop") * getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getXHeight(int i, int i2) {
        return fontInfo[i2].getXHeight(getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT);
    }

    @Override
    public float getEM(int i) {
        return getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public boolean hasNextLarger(Char r3) {
        return fontInfo[r3.getFontCode()].getNextLarger(r3.getChar()) != null;
    }

    @Override
    public void setBold(boolean z) {
        this.isBold = z;
    }

    @Override
    public void setRoman(boolean z) {
        this.isRoman = z;
    }

    @Override
    public void setTt(boolean z) {
        this.isTt = z;
    }

    @Override
    public void setIt(boolean z) {
        this.isIt = z;
    }

    @Override
    public void setSs(boolean z) {
        this.isSs = z;
    }

    @Override
    public boolean hasSpace(int i) {
        return fontInfo[i].hasSpace();
    }

    @Override
    public boolean isExtensionChar(Char r3) {
        return fontInfo[r3.getFontCode()].getExtension(r3.getChar()) != null;
    }

    public static void setMathSizes(float f, float f2, float f3, float f4) {
        if (magnificationEnable) {
            generalSettings.put("scriptfactor", Float.valueOf(Math.abs(f3 / f)));
            generalSettings.put("scriptscriptfactor", Float.valueOf(Math.abs(f4 / f)));
            generalSettings.put("textfactor", Float.valueOf(Math.abs(f2 / f)));
            TeXIcon.defaultSize = Math.abs(f);
        }
    }

    public static void setMagnification(float f) {
        if (magnificationEnable) {
            TeXIcon.magFactor = f / 1000.0f;
        }
    }

    private static float getParameter(String str) {
        Object obj = parameters.get(str);
        if (obj == null) {
            return 0.0f;
        }
        return ((Float) obj).floatValue();
    }

    public static float getSizeFactor(int i) {
        if (i < 2) {
            return 1.0f;
        }
        if (i < 4) {
            return ((Number) generalSettings.get("textfactor")).floatValue();
        }
        if (i < 6) {
            return ((Number) generalSettings.get("scriptfactor")).floatValue();
        }
        return ((Number) generalSettings.get("scriptscriptfactor")).floatValue();
    }
}
