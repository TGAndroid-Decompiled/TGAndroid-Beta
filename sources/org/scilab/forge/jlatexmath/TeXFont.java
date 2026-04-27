package org.scilab.forge.jlatexmath;

public interface TeXFont {
    TeXFont copy();

    float getAxisHeight(int i);

    float getBigOpSpacing1(int i);

    float getBigOpSpacing2(int i);

    float getBigOpSpacing3(int i);

    float getBigOpSpacing4(int i);

    float getBigOpSpacing5(int i);

    Char getChar(char c, String str, int i);

    Char getChar(String str, int i);

    Char getChar(CharFont charFont, int i);

    Char getDefaultChar(char c, int i);

    float getDefaultRuleThickness(int i);

    float getDenom1(int i);

    float getDenom2(int i);

    float getEM(int i);

    Extension getExtension(Char r1, int i);

    float getKern(CharFont charFont, CharFont charFont2, int i);

    CharFont getLigature(CharFont charFont, CharFont charFont2);

    int getMuFontId();

    Char getNextLarger(Char r1, int i);

    float getNum1(int i);

    float getNum2(int i);

    float getNum3(int i);

    float getQuad(int i, int i2);

    float getScaleFactor();

    float getSize();

    float getSkew(CharFont charFont, int i);

    float getSpace(int i);

    float getSub1(int i);

    float getSub2(int i);

    float getSubDrop(int i);

    float getSup1(int i);

    float getSup2(int i);

    float getSup3(int i);

    float getSupDrop(int i);

    float getXHeight(int i, int i2);

    boolean hasNextLarger(Char r1);

    boolean hasSpace(int i);

    boolean isExtensionChar(Char r1);

    void setBold(boolean z);

    void setIt(boolean z);

    void setRoman(boolean z);

    void setSs(boolean z);

    void setTt(boolean z);
}
