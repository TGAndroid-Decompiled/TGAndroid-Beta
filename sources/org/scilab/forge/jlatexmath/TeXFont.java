package org.scilab.forge.jlatexmath;
public interface TeXFont {
    public static final int NO_FONT = -1;

    TeXFont copy();

    TeXFont deriveFont(float f10);

    float getAxisHeight(int i3);

    float getBigOpSpacing1(int i3);

    float getBigOpSpacing2(int i3);

    float getBigOpSpacing3(int i3);

    float getBigOpSpacing4(int i3);

    float getBigOpSpacing5(int i3);

    boolean getBold();

    Char getChar(char c2, String str, int i3);

    Char getChar(String str, int i3);

    Char getChar(CharFont charFont, int i3);

    Char getDefaultChar(char c2, int i3);

    float getDefaultRuleThickness(int i3);

    float getDenom1(int i3);

    float getDenom2(int i3);

    float getEM(int i3);

    Extension getExtension(Char r12, int i3);

    boolean getIt();

    float getKern(CharFont charFont, CharFont charFont2, int i3);

    CharFont getLigature(CharFont charFont, CharFont charFont2);

    int getMuFontId();

    Char getNextLarger(Char r12, int i3);

    float getNum1(int i3);

    float getNum2(int i3);

    float getNum3(int i3);

    float getQuad(int i3, int i10);

    boolean getRoman();

    float getScaleFactor();

    float getSize();

    float getSkew(CharFont charFont, int i3);

    float getSpace(int i3);

    boolean getSs();

    float getSub1(int i3);

    float getSub2(int i3);

    float getSubDrop(int i3);

    float getSup1(int i3);

    float getSup2(int i3);

    float getSup3(int i3);

    float getSupDrop(int i3);

    boolean getTt();

    float getXHeight(int i3, int i10);

    boolean hasNextLarger(Char r12);

    boolean hasSpace(int i3);

    boolean isExtensionChar(Char r12);

    TeXFont scaleFont(float f10);

    void setBold(boolean z10);

    void setIt(boolean z10);

    void setRoman(boolean z10);

    void setSs(boolean z10);

    void setTt(boolean z10);
}
