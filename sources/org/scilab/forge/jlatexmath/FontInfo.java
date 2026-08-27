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

        public CharCouple(char c10, char c11) {
            this.left = c10;
            this.right = c11;
        }

        public boolean equals(Object obj) {
            CharCouple charCouple = (CharCouple) obj;
            return this.left == charCouple.left && this.right == charCouple.right;
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
        this.metrics = new float[i11][];
        this.nextLarger = new CharFont[i11];
        this.extensions = new int[i11][];
        fonts.put(Integer.valueOf(i10), this);
    }

    public void addKern(char c10, char c11, float f10) {
        this.kern.put(new CharCouple(c10, c11), new Float(f10));
    }

    public void addLigature(char c10, char c11, char c12) {
        this.lig.put(new CharCouple(c10, c11), new Character(c12));
    }

    public int getBoldId() {
        return this.boldId;
    }

    public int[] getExtension(char c10) {
        HashMap<Character, Character> map = this.unicode;
        return map == null ? this.extensions[c10] : this.extensions[map.get(Character.valueOf(c10)).charValue()];
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

    public float getKern(char c10, char c11, float f10) {
        Float f11 = this.kern.get(new CharCouple(c10, c11));
        if (f11 == null) {
            return 0.0f;
        }
        return f11.floatValue() * f10;
    }

    public CharFont getLigature(char c10, char c11) {
        Character ch2 = this.lig.get(new CharCouple(c10, c11));
        if (ch2 == null) {
            return null;
        }
        return new CharFont(ch2.charValue(), this.fontId);
    }

    public float[] getMetrics(char c10) {
        HashMap<Character, Character> map = this.unicode;
        return map == null ? this.metrics[c10] : this.metrics[map.get(Character.valueOf(c10)).charValue()];
    }

    public CharFont getNextLarger(char c10) {
        HashMap<Character, Character> map = this.unicode;
        return map == null ? this.nextLarger[c10] : this.nextLarger[map.get(Character.valueOf(c10)).charValue()];
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
        return this.space > 1.0E-7f;
    }

    public void setBoldId(int i10) {
        if (i10 == -1) {
            i10 = this.fontId;
        }
        this.boldId = i10;
    }

    public void setExtension(char c10, int[] iArr) {
        HashMap<Character, Character> map = this.unicode;
        if (map == null) {
            this.extensions[c10] = iArr;
        } else {
            if (map.containsKey(Character.valueOf(c10))) {
                this.extensions[this.unicode.get(Character.valueOf(c10)).charValue()] = iArr;
                return;
            }
            char size = (char) this.unicode.size();
            this.unicode.put(Character.valueOf(c10), Character.valueOf(size));
            this.extensions[size] = iArr;
        }
    }

    public void setItId(int i10) {
        if (i10 == -1) {
            i10 = this.fontId;
        }
        this.itId = i10;
    }

    public void setMetrics(char c10, float[] fArr) {
        HashMap<Character, Character> map = this.unicode;
        if (map == null) {
            this.metrics[c10] = fArr;
        } else {
            if (map.containsKey(Character.valueOf(c10))) {
                this.metrics[this.unicode.get(Character.valueOf(c10)).charValue()] = fArr;
                return;
            }
            char size = (char) this.unicode.size();
            this.unicode.put(Character.valueOf(c10), Character.valueOf(size));
            this.metrics[size] = fArr;
        }
    }

    public void setNextLarger(char c10, char c11, int i10) {
        HashMap<Character, Character> map = this.unicode;
        if (map == null) {
            this.nextLarger[c10] = new CharFont(c11, i10);
        } else {
            if (map.containsKey(Character.valueOf(c10))) {
                this.nextLarger[this.unicode.get(Character.valueOf(c10)).charValue()] = new CharFont(c11, i10);
                return;
            }
            char size = (char) this.unicode.size();
            this.unicode.put(Character.valueOf(c10), Character.valueOf(size));
            this.nextLarger[size] = new CharFont(c11, i10);
        }
    }

    public void setRomanId(int i10) {
        if (i10 == -1) {
            i10 = this.fontId;
        }
        this.romanId = i10;
    }

    public void setSkewChar(char c10) {
        this.skewChar = c10;
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
