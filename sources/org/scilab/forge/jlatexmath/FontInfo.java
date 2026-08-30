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

    public class CharCouple {
        private final char left;
        private final char right;

        public CharCouple(char c3, char c10) {
            this.left = c3;
            this.right = c10;
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

    public FontInfo(int i10, Object obj, String str, String str2, int i11, float f10, float f11, float f12, String str3, String str4, String str5, String str6, String str7) {
        this.unicode = null;
        this.fontId = i10;
        this.base = obj;
        this.path = str;
        this.fontName = str2;
        this.xHeight = f10;
        this.space = f11;
        this.quad = f12;
        this.boldVersion = str3;
        this.romanVersion = str4;
        this.ssVersion = str5;
        this.ttVersion = str6;
        this.itVersion = str7;
        if (i11 != 0) {
            this.unicode = new HashMap<>(i11);
        } else {
            i11 = 256;
        }
        this.metrics = new float[i11];
        this.nextLarger = new CharFont[i11];
        this.extensions = new int[i11];
        fonts.put(Integer.valueOf(i10), this);
    }

    public void addKern(char c3, char c10, float f10) {
        this.kern.put(new CharCouple(c3, c10), new Float(f10));
    }

    public void addLigature(char c3, char c10, char c11) {
        this.lig.put(new CharCouple(c3, c10), new Character(c11));
    }

    public int getBoldId() {
        return this.boldId;
    }

    public int[] getExtension(char c3) {
        HashMap<Character, Character> hashMap = this.unicode;
        if (hashMap == null) {
            return this.extensions[c3];
        }
        return this.extensions[hashMap.get(Character.valueOf(c3)).charValue()];
    }

    public Font getFont() {
        if (this.font == null) {
            if (this.base == null) {
                this.font = DefaultTeXFontParser.createFont(this.path);
            } else {
                this.font = DefaultTeXFontParser.createFont(this.path);
            }
        }
        return this.font;
    }

    public int getId() {
        return this.fontId;
    }

    public int getItId() {
        return this.itId;
    }

    public float getKern(char c3, char c10, float f10) {
        Float f11 = this.kern.get(new CharCouple(c3, c10));
        if (f11 == null) {
            return 0.0f;
        }
        return f11.floatValue() * f10;
    }

    public CharFont getLigature(char c3, char c10) {
        Character ch2 = this.lig.get(new CharCouple(c3, c10));
        if (ch2 == null) {
            return null;
        }
        return new CharFont(ch2.charValue(), this.fontId);
    }

    public float[] getMetrics(char c3) {
        HashMap<Character, Character> hashMap = this.unicode;
        if (hashMap == null) {
            return this.metrics[c3];
        }
        return this.metrics[hashMap.get(Character.valueOf(c3)).charValue()];
    }

    public CharFont getNextLarger(char c3) {
        HashMap<Character, Character> hashMap = this.unicode;
        if (hashMap == null) {
            return this.nextLarger[c3];
        }
        return this.nextLarger[hashMap.get(Character.valueOf(c3)).charValue()];
    }

    public float getQuad(float f10) {
        return this.quad * f10;
    }

    public int getRomanId() {
        return this.romanId;
    }

    public char getSkewChar() {
        return this.skewChar;
    }

    public float getSpace(float f10) {
        return this.space * f10;
    }

    public int getSsId() {
        return this.ssId;
    }

    public int getTtId() {
        return this.ttId;
    }

    public float getXHeight(float f10) {
        return this.xHeight * f10;
    }

    public boolean hasSpace() {
        if (this.space > 1.0E-7f) {
            return true;
        }
        return false;
    }

    public void setBoldId(int i10) {
        if (i10 == -1) {
            i10 = this.fontId;
        }
        this.boldId = i10;
    }

    public void setExtension(char c3, int[] iArr) {
        HashMap<Character, Character> hashMap = this.unicode;
        if (hashMap == null) {
            this.extensions[c3] = iArr;
        } else if (!hashMap.containsKey(Character.valueOf(c3))) {
            char size = (char) this.unicode.size();
            this.unicode.put(Character.valueOf(c3), Character.valueOf(size));
            this.extensions[size] = iArr;
        } else {
            this.extensions[this.unicode.get(Character.valueOf(c3)).charValue()] = iArr;
        }
    }

    public void setItId(int i10) {
        if (i10 == -1) {
            i10 = this.fontId;
        }
        this.itId = i10;
    }

    public void setMetrics(char c3, float[] fArr) {
        HashMap<Character, Character> hashMap = this.unicode;
        if (hashMap == null) {
            this.metrics[c3] = fArr;
        } else if (!hashMap.containsKey(Character.valueOf(c3))) {
            char size = (char) this.unicode.size();
            this.unicode.put(Character.valueOf(c3), Character.valueOf(size));
            this.metrics[size] = fArr;
        } else {
            this.metrics[this.unicode.get(Character.valueOf(c3)).charValue()] = fArr;
        }
    }

    public void setNextLarger(char c3, char c10, int i10) {
        HashMap<Character, Character> hashMap = this.unicode;
        if (hashMap == null) {
            this.nextLarger[c3] = new CharFont(c10, i10);
        } else if (!hashMap.containsKey(Character.valueOf(c3))) {
            char size = (char) this.unicode.size();
            this.unicode.put(Character.valueOf(c3), Character.valueOf(size));
            this.nextLarger[size] = new CharFont(c10, i10);
        } else {
            this.nextLarger[this.unicode.get(Character.valueOf(c3)).charValue()] = new CharFont(c10, i10);
        }
    }

    public void setRomanId(int i10) {
        if (i10 == -1) {
            i10 = this.fontId;
        }
        this.romanId = i10;
    }

    public void setSkewChar(char c3) {
        this.skewChar = c3;
    }

    public void setSsId(int i10) {
        if (i10 == -1) {
            i10 = this.fontId;
        }
        this.ssId = i10;
    }

    public void setTtId(int i10) {
        if (i10 == -1) {
            i10 = this.fontId;
        }
        this.ttId = i10;
    }

    public static Font getFont(int i10) {
        return fonts.get(Integer.valueOf(i10)).getFont();
    }
}
