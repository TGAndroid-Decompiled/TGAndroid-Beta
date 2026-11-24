package org.scilab.forge.jlatexmath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.Character;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.awt.Font;
public class DefaultTeXFont implements TeXFont {
    protected static final int BOT = 3;
    protected static final int CAPITALS = 1;
    protected static final int DEPTH = 2;
    protected static final int HEIGHT = 1;
    protected static final int IT = 3;
    protected static final int MID = 1;
    protected static final int NONE = -1;
    protected static final int NUMBERS = 0;
    protected static final int REP = 2;
    protected static final int SMALL = 2;
    protected static final int TOP = 0;
    protected static final int UNICODE = 3;
    protected static final int WIDTH = 0;
    private static String[] defaultTextStyleMappings = null;
    private static FontInfo[] fontInfo = null;
    private static Map<String, Number> generalSettings = null;
    private static boolean magnificationEnable = true;
    private static Map<String, Float> parameters;
    private static Map<String, CharFont> symbolMappings;
    private static Map<String, CharFont[]> textStyleMappings;
    protected float factor;
    public boolean isBold;
    public boolean isIt;
    public boolean isRoman;
    public boolean isSs;
    public boolean isTt;
    private final float size;
    public static List<Character.UnicodeBlock> loadedAlphabets = new ArrayList();
    public static Map<Character.UnicodeBlock, AlphabetRegistration> registeredAlphabets = new HashMap();

    static {
        fontInfo = new FontInfo[0];
        DefaultTeXFontParser defaultTeXFontParser = new DefaultTeXFontParser();
        loadedAlphabets.add(Character.UnicodeBlock.of('a'));
        fontInfo = defaultTeXFontParser.parseFontDescriptions(fontInfo);
        parameters = defaultTeXFontParser.parseParameters();
        textStyleMappings = defaultTeXFontParser.parseTextStyleMappings();
        defaultTextStyleMappings = defaultTeXFontParser.parseDefaultTextStyleMappings();
        symbolMappings = defaultTeXFontParser.parseSymbolMappings();
        Map<String, Number> parseGeneralSettings = defaultTeXFontParser.parseGeneralSettings();
        generalSettings = parseGeneralSettings;
        parseGeneralSettings.put("textfactor", 1);
        int intValue = generalSettings.get("mufontid").intValue();
        if (intValue >= 0) {
            FontInfo[] fontInfoArr = fontInfo;
            if (intValue < fontInfoArr.length && fontInfoArr[intValue] != null) {
                return;
            }
        }
        k93.g("DefaultTeXFont.xml", "GeneralSettings", "mufontid", "contains an unknown font id!");
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

    public static void addAlphabet(Object obj, Character.UnicodeBlock[] unicodeBlockArr, String str) {
        boolean z = false;
        int i = 0;
        while (!z) {
            if (i < unicodeBlockArr.length) {
                if (!loadedAlphabets.contains(unicodeBlockArr[i]) && !z) {
                    z = false;
                } else {
                    z = true;
                }
                i++;
            } else {
                TeXParser.isLoading = true;
                addTeXFontDescription(obj, JLatexMathAndroid.getResourceAsStream(str), str);
                for (Character.UnicodeBlock unicodeBlock : unicodeBlockArr) {
                    loadedAlphabets.add(unicodeBlock);
                }
                TeXParser.isLoading = false;
                return;
            }
        }
    }

    public static void addTeXFontDescription(Object obj, InputStream inputStream, String str) {
        DefaultTeXFontParser defaultTeXFontParser = new DefaultTeXFontParser(obj, inputStream, str);
        fontInfo = defaultTeXFontParser.parseFontDescriptions(fontInfo);
        defaultTeXFontParser.parseExtraPath();
        textStyleMappings.putAll(defaultTeXFontParser.parseTextStyleMappings());
        symbolMappings.putAll(defaultTeXFontParser.parseSymbolMappings());
    }

    public static void enableMagnification(boolean z) {
        magnificationEnable = z;
    }

    private Metrics getMetrics(CharFont charFont, float f) {
        float[] metrics = fontInfo[charFont.fontId].getMetrics(charFont.c);
        return new Metrics(metrics[0], metrics[1], metrics[2], metrics[3], f * TeXFormula.PIXELS_PER_POINT, f);
    }

    private static float getParameter(String str) {
        Float f = parameters.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public static float getSizeFactor(int i) {
        if (i < 2) {
            return 1.0f;
        }
        if (i < 4) {
            return generalSettings.get("textfactor").floatValue();
        }
        Map<String, Number> map = generalSettings;
        if (i < 6) {
            return map.get("scriptfactor").floatValue();
        }
        return map.get("scriptscriptfactor").floatValue();
    }

    public static void registerAlphabet(AlphabetRegistration alphabetRegistration) {
        for (Character.UnicodeBlock unicodeBlock : alphabetRegistration.getUnicodeBlock()) {
            registeredAlphabets.put(unicodeBlock, alphabetRegistration);
        }
    }

    public static void setMagnification(float f) {
        if (magnificationEnable) {
            TeXIcon.magFactor = f / 1000.0f;
        }
    }

    public static void setMathSizes(float f, float f2, float f3, float f4) {
        if (magnificationEnable) {
            generalSettings.put("scriptfactor", Float.valueOf(Math.abs(f3 / f)));
            generalSettings.put("scriptscriptfactor", Float.valueOf(Math.abs(f4 / f)));
            generalSettings.put("textfactor", Float.valueOf(Math.abs(f2 / f)));
            TeXIcon.defaultSize = Math.abs(f);
        }
    }

    @Override
    public TeXFont copy() {
        return new DefaultTeXFont(this.size, this.factor, this.isBold, this.isRoman, this.isSs, this.isTt, this.isIt);
    }

    @Override
    public TeXFont deriveFont(float f) {
        return new DefaultTeXFont(f, this.factor, this.isBold, this.isRoman, this.isSs, this.isTt, this.isIt);
    }

    @Override
    public float getAxisHeight(int i) {
        return getSizeFactor(i) * getParameter("axisheight") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing1(int i) {
        return getSizeFactor(i) * getParameter("bigopspacing1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing2(int i) {
        return getSizeFactor(i) * getParameter("bigopspacing2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing3(int i) {
        return getSizeFactor(i) * getParameter("bigopspacing3") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing4(int i) {
        return getSizeFactor(i) * getParameter("bigopspacing4") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing5(int i) {
        return getSizeFactor(i) * getParameter("bigopspacing5") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public boolean getBold() {
        return this.isBold;
    }

    @Override
    public Char getChar(CharFont charFont, int i) {
        int i2;
        float sizeFactor = getSizeFactor(i);
        boolean z = this.isBold;
        if (z) {
            i2 = charFont.boldFontId;
        } else {
            i2 = charFont.fontId;
        }
        FontInfo fontInfo2 = fontInfo[i2];
        if (z && charFont.fontId == charFont.boldFontId) {
            i2 = fontInfo2.getBoldId();
            fontInfo2 = fontInfo[i2];
            charFont = new CharFont(charFont.c, i2, i);
        }
        if (this.isRoman) {
            i2 = fontInfo2.getRomanId();
            fontInfo2 = fontInfo[i2];
            charFont = new CharFont(charFont.c, i2, i);
        }
        if (this.isSs) {
            i2 = fontInfo2.getSsId();
            fontInfo2 = fontInfo[i2];
            charFont = new CharFont(charFont.c, i2, i);
        }
        if (this.isTt) {
            i2 = fontInfo2.getTtId();
            fontInfo2 = fontInfo[i2];
            charFont = new CharFont(charFont.c, i2, i);
        }
        if (this.isIt) {
            i2 = fontInfo2.getItId();
            fontInfo2 = fontInfo[i2];
            charFont = new CharFont(charFont.c, i2, i);
        }
        return new Char(charFont.c, fontInfo2.getFont(), i2, getMetrics(charFont, this.factor * sizeFactor));
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
        return getSizeFactor(i) * getParameter("defaultrulethickness") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getDenom1(int i) {
        return getSizeFactor(i) * getParameter("denom1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getDenom2(int i) {
        return getSizeFactor(i) * getParameter("denom2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getEM(int i) {
        return getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT;
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
    public boolean getIt() {
        return this.isIt;
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

    @Override
    public int getMuFontId() {
        return generalSettings.get("mufontid").intValue();
    }

    @Override
    public Char getNextLarger(Char r5, int i) {
        CharFont nextLarger = fontInfo[r5.getFontCode()].getNextLarger(r5.getChar());
        return new Char(nextLarger.c, fontInfo[nextLarger.fontId].getFont(), nextLarger.fontId, getMetrics(nextLarger, getSizeFactor(i)));
    }

    @Override
    public float getNum1(int i) {
        return getSizeFactor(i) * getParameter("num1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getNum2(int i) {
        return getSizeFactor(i) * getParameter("num2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getNum3(int i) {
        return getSizeFactor(i) * getParameter("num3") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getQuad(int i, int i2) {
        return fontInfo[i2].getQuad(getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT);
    }

    @Override
    public boolean getRoman() {
        return this.isRoman;
    }

    @Override
    public float getScaleFactor() {
        return this.factor;
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
        return fontInfo[generalSettings.get("spacefontid").intValue()].getSpace(getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT);
    }

    @Override
    public boolean getSs() {
        return this.isSs;
    }

    @Override
    public float getSub1(int i) {
        return getSizeFactor(i) * getParameter("sub1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSub2(int i) {
        return getSizeFactor(i) * getParameter("sub2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSubDrop(int i) {
        return getSizeFactor(i) * getParameter("subdrop") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSup1(int i) {
        return getSizeFactor(i) * getParameter("sup1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSup2(int i) {
        return getSizeFactor(i) * getParameter("sup2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSup3(int i) {
        return getSizeFactor(i) * getParameter("sup3") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSupDrop(int i) {
        return getSizeFactor(i) * getParameter("supdrop") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public boolean getTt() {
        return this.isTt;
    }

    @Override
    public float getXHeight(int i, int i2) {
        return fontInfo[i2].getXHeight(getSizeFactor(i) * TeXFormula.PIXELS_PER_POINT);
    }

    @Override
    public boolean hasNextLarger(Char r2) {
        if (fontInfo[r2.getFontCode()].getNextLarger(r2.getChar()) != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean hasSpace(int i) {
        return fontInfo[i].hasSpace();
    }

    @Override
    public boolean isExtensionChar(Char r2) {
        if (fontInfo[r2.getFontCode()].getExtension(r2.getChar()) != null) {
            return true;
        }
        return false;
    }

    @Override
    public TeXFont scaleFont(float f) {
        return new DefaultTeXFont(this.size, f, this.isBold, this.isRoman, this.isSs, this.isTt, this.isIt);
    }

    @Override
    public void setBold(boolean z) {
        this.isBold = z;
    }

    @Override
    public void setIt(boolean z) {
        this.isIt = z;
    }

    @Override
    public void setRoman(boolean z) {
        this.isRoman = z;
    }

    @Override
    public void setSs(boolean z) {
        this.isSs = z;
    }

    @Override
    public void setTt(boolean z) {
        this.isTt = z;
    }

    public DefaultTeXFont(float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(f, 1.0f, z, z2, z3, z4, z5);
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

    public static void addTeXFontDescription(InputStream inputStream, String str) {
        DefaultTeXFontParser defaultTeXFontParser = new DefaultTeXFontParser(inputStream, str);
        fontInfo = defaultTeXFontParser.parseFontDescriptions(fontInfo);
        textStyleMappings.putAll(defaultTeXFontParser.parseTextStyleMappings());
        symbolMappings.putAll(defaultTeXFontParser.parseSymbolMappings());
    }

    public static void addTeXFontDescription(String str) {
        try {
            addTeXFontDescription(new FileInputStream(str), str);
        } catch (FileNotFoundException e) {
            throw new ResourceParseException(str, e);
        }
    }

    public static void addAlphabet(Character.UnicodeBlock unicodeBlock, InputStream inputStream, String str, InputStream inputStream2, String str2, InputStream inputStream3, String str3) {
        if (loadedAlphabets.contains(unicodeBlock)) {
            return;
        }
        addTeXFontDescription(inputStream, str);
        SymbolAtom.addSymbolAtom(inputStream2, str2);
        TeXFormula.addSymbolMappings(inputStream3, str3);
        loadedAlphabets.add(unicodeBlock);
    }

    public static void addAlphabet(Character.UnicodeBlock unicodeBlock, String str) {
        String i = b00.i("fonts/", str, "/language_", str, ".xml");
        String i2 = b00.i("fonts/", str, "/symbols_", str, ".xml");
        String i3 = b00.i("fonts/", str, "/mappings_", str, ".xml");
        try {
            addAlphabet(unicodeBlock, JLatexMathAndroid.getResourceAsStream(i), i, JLatexMathAndroid.getResourceAsStream(i2), i2, JLatexMathAndroid.getResourceAsStream(i3), i3);
        } catch (FontAlreadyLoadedException unused) {
        }
    }

    public static void addAlphabet(AlphabetRegistration alphabetRegistration) {
        if (alphabetRegistration != null) {
            try {
                addAlphabet(alphabetRegistration.getPackage(), alphabetRegistration.getUnicodeBlock(), alphabetRegistration.getTeXFontFileName());
            } catch (AlphabetRegistrationException e) {
                System.err.println(e.toString());
            } catch (FontAlreadyLoadedException unused) {
            }
        }
    }

    @Override
    public Char getChar(char c, String str, int i) {
        CharFont[] charFontArr = textStyleMappings.get(str);
        if (charFontArr != null) {
            return getChar(c, charFontArr, i);
        }
        throw new TextStyleMappingNotFoundException(str);
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
    public Char getChar(String str, int i) {
        CharFont charFont = symbolMappings.get(str);
        if (charFont != null) {
            return getChar(charFont, i);
        }
        throw new SymbolMappingNotFoundException(str);
    }
}
