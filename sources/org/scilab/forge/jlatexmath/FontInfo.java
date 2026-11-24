package org.scilab.forge.jlatexmath;

import java.util.HashMap;
import java.util.Map;
import ru.noties.jlatexmath.awt.Font;
public class FontInfo {
    public static final int NUMBER_OF_CHAR_CODES = 256;
    private static Map<Integer, FontInfo> fonts = new HashMap();
    private final Object base;
    private int boldId;
    protected final String boldVersion;
    private int[][] extensions;
    private Font font;
    private final int fontId;
    private final String fontName;
    private int itId;
    protected final String itVersion;
    private float[][] metrics;
    private CharFont[] nextLarger;
    private final String path;
    private final float quad;
    private int romanId;
    protected final String romanVersion;
    private final float space;
    private int ssId;
    protected final String ssVersion;
    private int ttId;
    protected final String ttVersion;
    private HashMap<Character, Character> unicode;
    private final float xHeight;
    private final Map<CharCouple, Character> lig = new HashMap();
    private final Map<CharCouple, Float> kern = new HashMap();
    private char skewChar = 65535;

    private class CharCouple {
        private final char left;
        private final char right;

        public CharCouple(char c, char c2) {
            this.left = c;
            this.right = c2;
        }

        public boolean equals(Object obj) {
            CharCouple charCouple = (CharCouple) obj;
            if (this.left == charCouple.left && this.right == charCouple.right) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.left + this.right) % 128;
        }
    }

    public FontInfo(int i, Object obj, String str, String str2, int i2, float f, float f2, float f3, String str3, String str4, String str5, String str6, String str7) {
        this.unicode = null;
        this.fontId = i;
        this.base = obj;
        this.path = str;
        this.fontName = str2;
        this.xHeight = f;
        this.space = f2;
        this.quad = f3;
        this.boldVersion = str3;
        this.romanVersion = str4;
        this.ssVersion = str5;
        this.ttVersion = str6;
        this.itVersion = str7;
        if (i2 != 0) {
            this.unicode = new HashMap<>(i2);
        } else {
            i2 = 256;
        }
        this.metrics = new float[i2];
        this.nextLarger = new CharFont[i2];
        this.extensions = new int[i2];
        fonts.put(Integer.valueOf(i), this);
    }

    public void addKern(char c, char c2, float f) {
        this.kern.put(new CharCouple(c, c2), new Float(f));
    }

    public void addLigature(char c, char c2, char c3) {
        this.lig.put(new CharCouple(c, c2), new Character(c3));
    }

    public int getBoldId() {
        return this.boldId;
    }

    public int[] getExtension(char c) {
        HashMap<Character, Character> hashMap = this.unicode;
        int[][] iArr = this.extensions;
        if (hashMap == null) {
            return iArr[c];
        }
        return iArr[hashMap.get(Character.valueOf(c)).charValue()];
    }

    public Font getFont() {
        Font font = this.font;
        if (font == null) {
            Object obj = this.base;
            String str = this.path;
            if (obj == null) {
                Font createFont = DefaultTeXFontParser.createFont(str);
                this.font = createFont;
                return createFont;
            }
            Font createFont2 = DefaultTeXFontParser.createFont(str);
            this.font = createFont2;
            return createFont2;
        }
        return font;
    }

    public int getId() {
        return this.fontId;
    }

    public int getItId() {
        return this.itId;
    }

    public float getKern(char c, char c2, float f) {
        Float f2 = this.kern.get(new CharCouple(c, c2));
        if (f2 == null) {
            return 0.0f;
        }
        return f2.floatValue() * f;
    }

    public CharFont getLigature(char c, char c2) {
        Character ch = this.lig.get(new CharCouple(c, c2));
        if (ch == null) {
            return null;
        }
        return new CharFont(ch.charValue(), this.fontId);
    }

    public float[] getMetrics(char c) {
        HashMap<Character, Character> hashMap = this.unicode;
        float[][] fArr = this.metrics;
        if (hashMap == null) {
            return fArr[c];
        }
        return fArr[hashMap.get(Character.valueOf(c)).charValue()];
    }

    public CharFont getNextLarger(char c) {
        HashMap<Character, Character> hashMap = this.unicode;
        CharFont[] charFontArr = this.nextLarger;
        if (hashMap == null) {
            return charFontArr[c];
        }
        return charFontArr[hashMap.get(Character.valueOf(c)).charValue()];
    }

    public float getQuad(float f) {
        return this.quad * f;
    }

    public int getRomanId() {
        return this.romanId;
    }

    public char getSkewChar() {
        return this.skewChar;
    }

    public float getSpace(float f) {
        return this.space * f;
    }

    public int getSsId() {
        return this.ssId;
    }

    public int getTtId() {
        return this.ttId;
    }

    public float getXHeight(float f) {
        return this.xHeight * f;
    }

    public boolean hasSpace() {
        if (this.space > 1.0E-7f) {
            return true;
        }
        return false;
    }

    public void setBoldId(int i) {
        if (i == -1) {
            i = this.fontId;
        }
        this.boldId = i;
    }

    public void setExtension(char c, int[] iArr) {
        HashMap<Character, Character> hashMap = this.unicode;
        if (hashMap == null) {
            this.extensions[c] = iArr;
        } else if (!hashMap.containsKey(Character.valueOf(c))) {
            char size = (char) this.unicode.size();
            this.unicode.put(Character.valueOf(c), Character.valueOf(size));
            this.extensions[size] = iArr;
        } else {
            this.extensions[this.unicode.get(Character.valueOf(c)).charValue()] = iArr;
        }
    }

    public void setItId(int i) {
        if (i == -1) {
            i = this.fontId;
        }
        this.itId = i;
    }

    public void setMetrics(char c, float[] fArr) {
        HashMap<Character, Character> hashMap = this.unicode;
        if (hashMap == null) {
            this.metrics[c] = fArr;
        } else if (!hashMap.containsKey(Character.valueOf(c))) {
            char size = (char) this.unicode.size();
            this.unicode.put(Character.valueOf(c), Character.valueOf(size));
            this.metrics[size] = fArr;
        } else {
            this.metrics[this.unicode.get(Character.valueOf(c)).charValue()] = fArr;
        }
    }

    public void setNextLarger(char c, char c2, int i) {
        HashMap<Character, Character> hashMap = this.unicode;
        if (hashMap == null) {
            this.nextLarger[c] = new CharFont(c2, i);
        } else if (!hashMap.containsKey(Character.valueOf(c))) {
            char size = (char) this.unicode.size();
            this.unicode.put(Character.valueOf(c), Character.valueOf(size));
            this.nextLarger[size] = new CharFont(c2, i);
        } else {
            this.nextLarger[this.unicode.get(Character.valueOf(c)).charValue()] = new CharFont(c2, i);
        }
    }

    public void setRomanId(int i) {
        if (i == -1) {
            i = this.fontId;
        }
        this.romanId = i;
    }

    public void setSkewChar(char c) {
        this.skewChar = c;
    }

    public void setSsId(int i) {
        if (i == -1) {
            i = this.fontId;
        }
        this.ssId = i;
    }

    public void setTtId(int i) {
        if (i == -1) {
            i = this.fontId;
        }
        this.ttId = i;
    }

    public static Font getFont(int i) {
        return fonts.get(Integer.valueOf(i)).getFont();
    }
}
