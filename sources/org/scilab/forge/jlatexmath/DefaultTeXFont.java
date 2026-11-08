package org.scilab.forge.jlatexmath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.Character;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.ui.Cells.f1;
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
        throw new XMLResourceParseException("DefaultTeXFont.xml", "GeneralSettings", "mufontid", "contains an unknown font id!");
    }

    public DefaultTeXFont(float f10) {
        this.factor = 1.0f;
        this.isBold = false;
        this.isRoman = false;
        this.isSs = false;
        this.isTt = false;
        this.isIt = false;
        this.size = f10;
    }

    public static void addAlphabet(Character.UnicodeBlock unicodeBlock, String str) {
        String m10 = f1.m("fonts/", str, "/language_", str, ".xml");
        String m11 = f1.m("fonts/", str, "/symbols_", str, ".xml");
        String m12 = f1.m("fonts/", str, "/mappings_", str, ".xml");
        try {
            addAlphabet(unicodeBlock, JLatexMathAndroid.getResourceAsStream(m10), m10, JLatexMathAndroid.getResourceAsStream(m11), m11, JLatexMathAndroid.getResourceAsStream(m12), m12);
        } catch (FontAlreadyLoadedException unused) {
        }
    }

    public static void addTeXFontDescription(String str) {
        try {
            addTeXFontDescription(new FileInputStream(str), str);
        } catch (FileNotFoundException e10) {
            throw new ResourceParseException(str, e10);
        }
    }

    public static void enableMagnification(boolean z9) {
        magnificationEnable = z9;
    }

    private Char getChar(char c10, CharFont[] charFontArr, int i7) {
        char c11;
        int i10;
        if (c10 >= '0' && c10 <= '9') {
            i10 = c10 - '0';
            c11 = 0;
        } else if (c10 >= 'a' && c10 <= 'z') {
            i10 = c10 - 'a';
            c11 = 2;
        } else if (c10 < 'A' || c10 > 'Z') {
            c11 = 3;
            i10 = c10;
        } else {
            i10 = c10 - 'A';
            c11 = 1;
        }
        CharFont charFont = charFontArr[c11];
        if (charFont == null) {
            return getDefaultChar(c10, i7);
        }
        return getChar(new CharFont((char) (charFont.f21131c + i10), charFont.fontId), i7);
    }

    private Metrics getMetrics(CharFont charFont, float f10) {
        float[] metrics = fontInfo[charFont.fontId].getMetrics(charFont.f21131c);
        return new Metrics(metrics[0], metrics[1], metrics[2], metrics[3], f10 * TeXFormula.PIXELS_PER_POINT, f10);
    }

    private static float getParameter(String str) {
        Float f10 = parameters.get(str);
        if (f10 == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    public static float getSizeFactor(int i7) {
        if (i7 < 2) {
            return 1.0f;
        }
        if (i7 < 4) {
            return generalSettings.get("textfactor").floatValue();
        }
        if (i7 < 6) {
            return generalSettings.get("scriptfactor").floatValue();
        }
        return generalSettings.get("scriptscriptfactor").floatValue();
    }

    public static void registerAlphabet(AlphabetRegistration alphabetRegistration) {
        for (Character.UnicodeBlock unicodeBlock : alphabetRegistration.getUnicodeBlock()) {
            registeredAlphabets.put(unicodeBlock, alphabetRegistration);
        }
    }

    public static void setMagnification(float f10) {
        if (magnificationEnable) {
            TeXIcon.magFactor = f10 / 1000.0f;
        }
    }

    public static void setMathSizes(float f10, float f11, float f12, float f13) {
        if (magnificationEnable) {
            generalSettings.put("scriptfactor", Float.valueOf(Math.abs(f12 / f10)));
            generalSettings.put("scriptscriptfactor", Float.valueOf(Math.abs(f13 / f10)));
            generalSettings.put("textfactor", Float.valueOf(Math.abs(f11 / f10)));
            TeXIcon.defaultSize = Math.abs(f10);
        }
    }

    @Override
    public TeXFont copy() {
        return new DefaultTeXFont(this.size, this.factor, this.isBold, this.isRoman, this.isSs, this.isTt, this.isIt);
    }

    @Override
    public TeXFont deriveFont(float f10) {
        return new DefaultTeXFont(f10, this.factor, this.isBold, this.isRoman, this.isSs, this.isTt, this.isIt);
    }

    @Override
    public float getAxisHeight(int i7) {
        return getSizeFactor(i7) * getParameter("axisheight") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing1(int i7) {
        return getSizeFactor(i7) * getParameter("bigopspacing1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing2(int i7) {
        return getSizeFactor(i7) * getParameter("bigopspacing2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing3(int i7) {
        return getSizeFactor(i7) * getParameter("bigopspacing3") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing4(int i7) {
        return getSizeFactor(i7) * getParameter("bigopspacing4") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getBigOpSpacing5(int i7) {
        return getSizeFactor(i7) * getParameter("bigopspacing5") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public boolean getBold() {
        return this.isBold;
    }

    @Override
    public Char getDefaultChar(char c10, int i7) {
        if (c10 >= '0' && c10 <= '9') {
            return getChar(c10, defaultTextStyleMappings[0], i7);
        }
        if (c10 >= 'a' && c10 <= 'z') {
            return getChar(c10, defaultTextStyleMappings[2], i7);
        }
        return getChar(c10, defaultTextStyleMappings[1], i7);
    }

    @Override
    public float getDefaultRuleThickness(int i7) {
        return getSizeFactor(i7) * getParameter("defaultrulethickness") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getDenom1(int i7) {
        return getSizeFactor(i7) * getParameter("denom1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getDenom2(int i7) {
        return getSizeFactor(i7) * getParameter("denom2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getEM(int i7) {
        return getSizeFactor(i7) * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public Extension getExtension(Char r10, int i7) {
        Font font = r10.getFont();
        int fontCode = r10.getFontCode();
        float sizeFactor = getSizeFactor(i7);
        int[] extension = fontInfo[fontCode].getExtension(r10.getChar());
        Char[] charArr = new Char[extension.length];
        for (int i10 = 0; i10 < extension.length; i10++) {
            int i11 = extension[i10];
            if (i11 == -1) {
                charArr[i10] = null;
            } else {
                charArr[i10] = new Char((char) i11, font, fontCode, getMetrics(new CharFont((char) i11, fontCode), sizeFactor));
            }
        }
        return new Extension(charArr[0], charArr[1], charArr[2], charArr[3]);
    }

    @Override
    public boolean getIt() {
        return this.isIt;
    }

    @Override
    public float getKern(CharFont charFont, CharFont charFont2, int i7) {
        int i10 = charFont.fontId;
        if (i10 == charFont2.fontId) {
            return fontInfo[i10].getKern(charFont.f21131c, charFont2.f21131c, getSizeFactor(i7) * TeXFormula.PIXELS_PER_POINT);
        }
        return 0.0f;
    }

    @Override
    public CharFont getLigature(CharFont charFont, CharFont charFont2) {
        int i7 = charFont.fontId;
        if (i7 == charFont2.fontId) {
            return fontInfo[i7].getLigature(charFont.f21131c, charFont2.f21131c);
        }
        return null;
    }

    @Override
    public int getMuFontId() {
        return generalSettings.get("mufontid").intValue();
    }

    @Override
    public Char getNextLarger(Char r52, int i7) {
        CharFont nextLarger = fontInfo[r52.getFontCode()].getNextLarger(r52.getChar());
        return new Char(nextLarger.f21131c, fontInfo[nextLarger.fontId].getFont(), nextLarger.fontId, getMetrics(nextLarger, getSizeFactor(i7)));
    }

    @Override
    public float getNum1(int i7) {
        return getSizeFactor(i7) * getParameter("num1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getNum2(int i7) {
        return getSizeFactor(i7) * getParameter("num2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getNum3(int i7) {
        return getSizeFactor(i7) * getParameter("num3") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getQuad(int i7, int i10) {
        return fontInfo[i10].getQuad(getSizeFactor(i7) * TeXFormula.PIXELS_PER_POINT);
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
    public float getSkew(CharFont charFont, int i7) {
        char skewChar = fontInfo[charFont.fontId].getSkewChar();
        if (skewChar == 65535) {
            return 0.0f;
        }
        return getKern(charFont, new CharFont(skewChar, charFont.fontId), i7);
    }

    @Override
    public float getSpace(int i7) {
        return fontInfo[generalSettings.get("spacefontid").intValue()].getSpace(getSizeFactor(i7) * TeXFormula.PIXELS_PER_POINT);
    }

    @Override
    public boolean getSs() {
        return this.isSs;
    }

    @Override
    public float getSub1(int i7) {
        return getSizeFactor(i7) * getParameter("sub1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSub2(int i7) {
        return getSizeFactor(i7) * getParameter("sub2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSubDrop(int i7) {
        return getSizeFactor(i7) * getParameter("subdrop") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSup1(int i7) {
        return getSizeFactor(i7) * getParameter("sup1") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSup2(int i7) {
        return getSizeFactor(i7) * getParameter("sup2") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSup3(int i7) {
        return getSizeFactor(i7) * getParameter("sup3") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public float getSupDrop(int i7) {
        return getSizeFactor(i7) * getParameter("supdrop") * TeXFormula.PIXELS_PER_POINT;
    }

    @Override
    public boolean getTt() {
        return this.isTt;
    }

    @Override
    public float getXHeight(int i7, int i10) {
        return fontInfo[i10].getXHeight(getSizeFactor(i7) * TeXFormula.PIXELS_PER_POINT);
    }

    @Override
    public boolean hasNextLarger(Char r32) {
        if (fontInfo[r32.getFontCode()].getNextLarger(r32.getChar()) != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean hasSpace(int i7) {
        return fontInfo[i7].hasSpace();
    }

    @Override
    public boolean isExtensionChar(Char r32) {
        if (fontInfo[r32.getFontCode()].getExtension(r32.getChar()) != null) {
            return true;
        }
        return false;
    }

    @Override
    public TeXFont scaleFont(float f10) {
        return new DefaultTeXFont(this.size, f10, this.isBold, this.isRoman, this.isSs, this.isTt, this.isIt);
    }

    @Override
    public void setBold(boolean z9) {
        this.isBold = z9;
    }

    @Override
    public void setIt(boolean z9) {
        this.isIt = z9;
    }

    @Override
    public void setRoman(boolean z9) {
        this.isRoman = z9;
    }

    @Override
    public void setSs(boolean z9) {
        this.isSs = z9;
    }

    @Override
    public void setTt(boolean z9) {
        this.isTt = z9;
    }

    public static void addTeXFontDescription(InputStream inputStream, String str) {
        DefaultTeXFontParser defaultTeXFontParser = new DefaultTeXFontParser(inputStream, str);
        fontInfo = defaultTeXFontParser.parseFontDescriptions(fontInfo);
        textStyleMappings.putAll(defaultTeXFontParser.parseTextStyleMappings());
        symbolMappings.putAll(defaultTeXFontParser.parseSymbolMappings());
    }

    @Override
    public Char getChar(char c10, String str, int i7) {
        CharFont[] charFontArr = textStyleMappings.get(str);
        if (charFontArr != null) {
            return getChar(c10, charFontArr, i7);
        }
        throw new TextStyleMappingNotFoundException(str);
    }

    @Override
    public Char getChar(CharFont charFont, int i7) {
        float sizeFactor = getSizeFactor(i7);
        boolean z9 = this.isBold;
        int i10 = z9 ? charFont.boldFontId : charFont.fontId;
        FontInfo fontInfo2 = fontInfo[i10];
        if (z9 && charFont.fontId == charFont.boldFontId) {
            i10 = fontInfo2.getBoldId();
            fontInfo2 = fontInfo[i10];
            charFont = new CharFont(charFont.f21131c, i10, i7);
        }
        if (this.isRoman) {
            i10 = fontInfo2.getRomanId();
            fontInfo2 = fontInfo[i10];
            charFont = new CharFont(charFont.f21131c, i10, i7);
        }
        if (this.isSs) {
            i10 = fontInfo2.getSsId();
            fontInfo2 = fontInfo[i10];
            charFont = new CharFont(charFont.f21131c, i10, i7);
        }
        if (this.isTt) {
            i10 = fontInfo2.getTtId();
            fontInfo2 = fontInfo[i10];
            charFont = new CharFont(charFont.f21131c, i10, i7);
        }
        if (this.isIt) {
            i10 = fontInfo2.getItId();
            fontInfo2 = fontInfo[i10];
            charFont = new CharFont(charFont.f21131c, i10, i7);
        }
        return new Char(charFont.f21131c, fontInfo2.getFont(), i10, getMetrics(charFont, this.factor * sizeFactor));
    }

    public static void addTeXFontDescription(Object obj, InputStream inputStream, String str) {
        DefaultTeXFontParser defaultTeXFontParser = new DefaultTeXFontParser(obj, inputStream, str);
        fontInfo = defaultTeXFontParser.parseFontDescriptions(fontInfo);
        defaultTeXFontParser.parseExtraPath();
        textStyleMappings.putAll(defaultTeXFontParser.parseTextStyleMappings());
        symbolMappings.putAll(defaultTeXFontParser.parseSymbolMappings());
    }

    public DefaultTeXFont(float f10, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(f10, 1.0f, z9, z10, z11, z12, z13);
    }

    public DefaultTeXFont(float f10, float f11, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.size = f10;
        this.factor = f11;
        this.isBold = z9;
        this.isRoman = z10;
        this.isSs = z11;
        this.isTt = z12;
        this.isIt = z13;
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

    @Override
    public Char getChar(String str, int i7) {
        CharFont charFont = symbolMappings.get(str);
        if (charFont != null) {
            return getChar(charFont, i7);
        }
        throw new SymbolMappingNotFoundException(str);
    }

    public static void addAlphabet(Object obj, Character.UnicodeBlock[] unicodeBlockArr, String str) {
        boolean z9 = false;
        for (int i7 = 0; !z9 && i7 < unicodeBlockArr.length; i7++) {
            z9 = loadedAlphabets.contains(unicodeBlockArr[i7]) || z9;
        }
        if (z9) {
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
            } catch (AlphabetRegistrationException e10) {
                System.err.println(e10.toString());
            } catch (FontAlreadyLoadedException unused) {
            }
        }
    }
}
