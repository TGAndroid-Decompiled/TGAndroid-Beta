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

        public CharCouple(char c, char c2) {
            this.left = c;
            this.right = c2;
        }

        public boolean equals(Object obj) {
            CharCouple charCouple = (CharCouple) obj;
            return this.left == charCouple.left && this.right == charCouple.right;
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
        this.metrics = new float[i2][];
        this.nextLarger = new CharFont[i2];
        this.extensions = new int[i2][];
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
        HashMap<Character, Character> map = this.unicode;
        return map == null ? this.extensions[c] : this.extensions[map.get(Character.valueOf(c)).charValue()];
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
        HashMap<Character, Character> map = this.unicode;
        return map == null ? this.metrics[c] : this.metrics[map.get(Character.valueOf(c)).charValue()];
    }

    public CharFont getNextLarger(char c) {
        HashMap<Character, Character> map = this.unicode;
        return map == null ? this.nextLarger[c] : this.nextLarger[map.get(Character.valueOf(c)).charValue()];
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
        return this.space > 1.0E-7f;
    }

    public void setBoldId(int i) {
        if (i == -1) {
            i = this.fontId;
        }
        this.boldId = i;
    }

    public void setExtension(char c, int[] iArr) {
        HashMap<Character, Character> map = this.unicode;
        if (map == null) {
            this.extensions[c] = iArr;
        } else {
            if (map.containsKey(Character.valueOf(c))) {
                this.extensions[this.unicode.get(Character.valueOf(c)).charValue()] = iArr;
                return;
            }
            char size = (char) this.unicode.size();
            this.unicode.put(Character.valueOf(c), Character.valueOf(size));
            this.extensions[size] = iArr;
        }
    }

    public void setItId(int i) {
        if (i == -1) {
            i = this.fontId;
        }
        this.itId = i;
    }

    public void setMetrics(char c, float[] fArr) {
        HashMap<Character, Character> map = this.unicode;
        if (map == null) {
            this.metrics[c] = fArr;
        } else {
            if (map.containsKey(Character.valueOf(c))) {
                this.metrics[this.unicode.get(Character.valueOf(c)).charValue()] = fArr;
                return;
            }
            char size = (char) this.unicode.size();
            this.unicode.put(Character.valueOf(c), Character.valueOf(size));
            this.metrics[size] = fArr;
        }
    }

    public void setNextLarger(char c, char c2, int i) {
        HashMap<Character, Character> map = this.unicode;
        if (map == null) {
            this.nextLarger[c] = new CharFont(c2, i);
        } else {
            if (map.containsKey(Character.valueOf(c))) {
                this.nextLarger[this.unicode.get(Character.valueOf(c)).charValue()] = new CharFont(c2, i);
                return;
            }
            char size = (char) this.unicode.size();
            this.unicode.put(Character.valueOf(c), Character.valueOf(size));
            this.nextLarger[size] = new CharFont(c2, i);
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
