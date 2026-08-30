package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Color;
public class TeXEnvironment {
    private static final int MAX_DEPTH = 64;
    private Color background;
    private Color color;
    private int depth;
    private float interline;
    private int interlineUnit;
    public boolean isColored;
    private int lastFontId;
    private float scaleFactor;
    private boolean smallCap;
    private int style;
    private String textStyle;
    private float textwidth;
    private TeXFont f16650tf;

    public TeXEnvironment(int i10, TeXFont teXFont) {
        this(i10, teXFont, (Color) null, (Color) null);
    }

    public TeXEnvironment copy() {
        int i10 = this.depth;
        if (i10 <= 64) {
            return new TeXEnvironment(this.style, this.scaleFactor, this.f16650tf, this.background, this.color, this.textStyle, this.smallCap, i10 + 1);
        }
        throw new DepthLimitExceededException();
    }

    public TeXEnvironment crampStyle() {
        TeXEnvironment copy = copy();
        int i10 = this.style;
        if (i10 % 2 != 1) {
            i10++;
        }
        copy.style = i10;
        return copy;
    }

    public TeXEnvironment denomStyle() {
        TeXEnvironment copy = copy();
        int i10 = this.style;
        copy.style = (((i10 / 2) * 2) + 3) - ((i10 / 6) * 2);
        return copy;
    }

    public Color getBackground() {
        return this.background;
    }

    public Color getColor() {
        return this.color;
    }

    public float getInterline() {
        return SpaceAtom.getFactor(this.interlineUnit, this) * this.interline;
    }

    public int getLastFontId() {
        int i10 = this.lastFontId;
        if (i10 == -1) {
            return this.f16650tf.getMuFontId();
        }
        return i10;
    }

    public float getScaleFactor() {
        return this.scaleFactor;
    }

    public float getSize() {
        return this.f16650tf.getSize();
    }

    public boolean getSmallCap() {
        return this.smallCap;
    }

    public float getSpace() {
        return this.f16650tf.getScaleFactor() * this.f16650tf.getSpace(this.style);
    }

    public int getStyle() {
        return this.style;
    }

    public TeXFont getTeXFont() {
        return this.f16650tf;
    }

    public String getTextStyle() {
        return this.textStyle;
    }

    public float getTextwidth() {
        return this.textwidth;
    }

    public TeXEnvironment numStyle() {
        TeXEnvironment copy = copy();
        int i10 = this.style;
        copy.style = (i10 + 2) - ((i10 / 6) * 2);
        return copy;
    }

    public void reset() {
        this.color = null;
        this.background = null;
    }

    public TeXEnvironment rootStyle() {
        TeXEnvironment copy = copy();
        copy.style = 6;
        return copy;
    }

    public void setBackground(Color color) {
        this.background = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setInterline(int i10, float f10) {
        this.interline = f10;
        this.interlineUnit = i10;
    }

    public void setLastFontId(int i10) {
        this.lastFontId = i10;
    }

    public void setScaleFactor(float f10) {
        this.scaleFactor = f10;
    }

    public void setSmallCap(boolean z4) {
        this.smallCap = z4;
    }

    public void setStyle(int i10) {
        this.style = i10;
    }

    public void setTextStyle(String str) {
        this.textStyle = str;
    }

    public void setTextwidth(int i10, float f10) {
        this.textwidth = SpaceAtom.getFactor(i10, this) * f10;
    }

    public TeXEnvironment subStyle() {
        TeXEnvironment copy = copy();
        copy.style = ((this.style / 4) * 2) + 5;
        return copy;
    }

    public TeXEnvironment supStyle() {
        TeXEnvironment copy = copy();
        int i10 = this.style;
        copy.style = (i10 % 2) + ((i10 / 4) * 2) + 4;
        return copy;
    }

    public TeXEnvironment(int i10, TeXFont teXFont, int i11, float f10) {
        this(i10, teXFont, (Color) null, (Color) null);
        this.textwidth = SpaceAtom.getFactor(i11, this) * f10;
    }

    private TeXEnvironment(int i10, TeXFont teXFont, Color color, Color color2) {
        this.lastFontId = -1;
        this.textwidth = Float.POSITIVE_INFINITY;
        this.scaleFactor = 1.0f;
        this.isColored = false;
        this.style = i10;
        this.f16650tf = teXFont;
        this.background = color;
        this.color = color2;
        setInterline(1, 1.0f);
    }

    public TeXEnvironment copy(TeXFont teXFont) {
        int i10 = this.depth;
        if (i10 <= 64) {
            TeXEnvironment teXEnvironment = new TeXEnvironment(this.style, this.scaleFactor, teXFont, this.background, this.color, this.textStyle, this.smallCap, i10 + 1);
            teXEnvironment.textwidth = this.textwidth;
            teXEnvironment.interline = this.interline;
            teXEnvironment.interlineUnit = this.interlineUnit;
            return teXEnvironment;
        }
        throw new DepthLimitExceededException();
    }

    private TeXEnvironment(int i10, float f10, TeXFont teXFont, Color color, Color color2, String str, boolean z4) {
        this(i10, f10, teXFont, color, color2, str, z4, 0);
    }

    private TeXEnvironment(int i10, float f10, TeXFont teXFont, Color color, Color color2, String str, boolean z4, int i11) {
        this.lastFontId = -1;
        this.textwidth = Float.POSITIVE_INFINITY;
        this.isColored = false;
        this.style = i10;
        this.scaleFactor = f10;
        this.f16650tf = teXFont;
        this.textStyle = str;
        this.smallCap = z4;
        this.depth = i11;
        this.background = color;
        this.color = color2;
        setInterline(1, 1.0f);
    }
}
