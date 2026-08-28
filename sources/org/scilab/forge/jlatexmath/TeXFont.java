package org.scilab.forge.jlatexmath;
public interface TeXFont {
    public static final int NO_FONT = -1;

    TeXFont copy();

    TeXFont deriveFont(float f10);

    float getAxisHeight(int i9);

    float getBigOpSpacing1(int i9);

    float getBigOpSpacing2(int i9);

    float getBigOpSpacing3(int i9);

    float getBigOpSpacing4(int i9);

    float getBigOpSpacing5(int i9);

    boolean getBold();

    Char getChar(char c10, String str, int i9);

    Char getChar(String str, int i9);

    Char getChar(CharFont charFont, int i9);

    Char getDefaultChar(char c10, int i9);

    float getDefaultRuleThickness(int i9);

    float getDenom1(int i9);

    float getDenom2(int i9);

    float getEM(int i9);

    Extension getExtension(Char r12, int i9);

    boolean getIt();

    float getKern(CharFont charFont, CharFont charFont2, int i9);

    CharFont getLigature(CharFont charFont, CharFont charFont2);

    int getMuFontId();

    Char getNextLarger(Char r12, int i9);

    float getNum1(int i9);

    float getNum2(int i9);

    float getNum3(int i9);

    float getQuad(int i9, int i10);

    boolean getRoman();

    float getScaleFactor();

    float getSize();

    float getSkew(CharFont charFont, int i9);

    float getSpace(int i9);

    boolean getSs();

    float getSub1(int i9);

    float getSub2(int i9);

    float getSubDrop(int i9);

    float getSup1(int i9);

    float getSup2(int i9);

    float getSup3(int i9);

    float getSupDrop(int i9);

    boolean getTt();

    float getXHeight(int i9, int i10);

    boolean hasNextLarger(Char r12);

    boolean hasSpace(int i9);

    boolean isExtensionChar(Char r12);

    TeXFont scaleFont(float f10);

    void setBold(boolean z10);

    void setIt(boolean z10);

    void setRoman(boolean z10);

    void setSs(boolean z10);

    void setTt(boolean z10);
}
