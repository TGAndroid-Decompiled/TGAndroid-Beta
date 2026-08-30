package org.scilab.forge.jlatexmath;
public interface TeXFont {
    public static final int NO_FONT = -1;

    TeXFont copy();

    TeXFont deriveFont(float f10);

    float getAxisHeight(int i10);

    float getBigOpSpacing1(int i10);

    float getBigOpSpacing2(int i10);

    float getBigOpSpacing3(int i10);

    float getBigOpSpacing4(int i10);

    float getBigOpSpacing5(int i10);

    boolean getBold();

    Char getChar(char c3, String str, int i10);

    Char getChar(String str, int i10);

    Char getChar(CharFont charFont, int i10);

    Char getDefaultChar(char c3, int i10);

    float getDefaultRuleThickness(int i10);

    float getDenom1(int i10);

    float getDenom2(int i10);

    float getEM(int i10);

    Extension getExtension(Char r12, int i10);

    boolean getIt();

    float getKern(CharFont charFont, CharFont charFont2, int i10);

    CharFont getLigature(CharFont charFont, CharFont charFont2);

    int getMuFontId();

    Char getNextLarger(Char r12, int i10);

    float getNum1(int i10);

    float getNum2(int i10);

    float getNum3(int i10);

    float getQuad(int i10, int i11);

    boolean getRoman();

    float getScaleFactor();

    float getSize();

    float getSkew(CharFont charFont, int i10);

    float getSpace(int i10);

    boolean getSs();

    float getSub1(int i10);

    float getSub2(int i10);

    float getSubDrop(int i10);

    float getSup1(int i10);

    float getSup2(int i10);

    float getSup3(int i10);

    float getSupDrop(int i10);

    boolean getTt();

    float getXHeight(int i10, int i11);

    boolean hasNextLarger(Char r12);

    boolean hasSpace(int i10);

    boolean isExtensionChar(Char r12);

    TeXFont scaleFont(float f10);

    void setBold(boolean z4);

    void setIt(boolean z4);

    void setRoman(boolean z4);

    void setSs(boolean z4);

    void setTt(boolean z4);
}
