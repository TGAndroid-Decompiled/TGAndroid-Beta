package org.scilab.forge.jlatexmath;
public interface TeXFont {
    public static final int NO_FONT = -1;

    TeXFont copy();

    TeXFont deriveFont(float f10);

    float getAxisHeight(int i7);

    float getBigOpSpacing1(int i7);

    float getBigOpSpacing2(int i7);

    float getBigOpSpacing3(int i7);

    float getBigOpSpacing4(int i7);

    float getBigOpSpacing5(int i7);

    boolean getBold();

    Char getChar(char c10, String str, int i7);

    Char getChar(String str, int i7);

    Char getChar(CharFont charFont, int i7);

    Char getDefaultChar(char c10, int i7);

    float getDefaultRuleThickness(int i7);

    float getDenom1(int i7);

    float getDenom2(int i7);

    float getEM(int i7);

    Extension getExtension(Char r12, int i7);

    boolean getIt();

    float getKern(CharFont charFont, CharFont charFont2, int i7);

    CharFont getLigature(CharFont charFont, CharFont charFont2);

    int getMuFontId();

    Char getNextLarger(Char r12, int i7);

    float getNum1(int i7);

    float getNum2(int i7);

    float getNum3(int i7);

    float getQuad(int i7, int i10);

    boolean getRoman();

    float getScaleFactor();

    float getSize();

    float getSkew(CharFont charFont, int i7);

    float getSpace(int i7);

    boolean getSs();

    float getSub1(int i7);

    float getSub2(int i7);

    float getSubDrop(int i7);

    float getSup1(int i7);

    float getSup2(int i7);

    float getSup3(int i7);

    float getSupDrop(int i7);

    boolean getTt();

    float getXHeight(int i7, int i10);

    boolean hasNextLarger(Char r12);

    boolean hasSpace(int i7);

    boolean isExtensionChar(Char r12);

    TeXFont scaleFont(float f10);

    void setBold(boolean z9);

    void setIt(boolean z9);

    void setRoman(boolean z9);

    void setSs(boolean z9);

    void setTt(boolean z9);
}
