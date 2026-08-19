package org.scilab.forge.jlatexmath;

public class ScriptsAtom extends Atom {
    private static final int MAX_WRAP_DEPTH = 64;
    private static final SpaceAtom SCRIPT_SPACE = new SpaceAtom(3, 0.5f, 0.0f, 0.0f);
    private static int boxWrapDepth;
    private int align;
    private final Atom base;
    private final Atom subscript;
    private final Atom superscript;
    private final int wrapDepth;

    public ScriptsAtom(Atom atom, Atom atom2, Atom atom3) {
        this.align = 0;
        this.base = atom;
        this.subscript = atom2;
        this.superscript = atom3;
        int i = atom instanceof ScriptsAtom ? 1 + ((ScriptsAtom) atom).wrapDepth : 1;
        this.wrapDepth = i;
        if (i > 64) {
            throw new DepthLimitExceededException();
        }
    }

    public ScriptsAtom(Atom atom, Atom atom2, Atom atom3, boolean z) {
        this(atom, atom2, atom3);
        if (z) {
            return;
        }
        this.align = 1;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) throws Throwable {
        float height;
        float depth;
        float subDrop;
        HorizontalBox horizontalBox;
        float f;
        Box box;
        float f2;
        float depth2;
        Atom atom;
        Box boxCreateBox;
        float width;
        Atom atom2;
        float f3;
        HorizontalBox horizontalBox2;
        SpaceAtom spaceAtom;
        float sup2;
        float fMax;
        Atom atom3;
        float fMax2;
        float depth3;
        float f4;
        float f5;
        float fAbs;
        int i;
        int i2 = boxWrapDepth;
        int i3 = i2 + 1;
        boxWrapDepth = i3;
        if (i3 > 64) {
            boxWrapDepth = i2;
            throw new DepthLimitExceededException();
        }
        try {
            Atom atom4 = this.base;
            Box strutBox = atom4 == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom4.createBox(teXEnvironment);
            StrutBox strutBox2 = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
            if (this.subscript == null && this.superscript == null) {
                boxWrapDepth--;
                return strutBox;
            }
            TeXFont teXFont = teXEnvironment.getTeXFont();
            int style = teXEnvironment.getStyle();
            Atom atom5 = this.base;
            int i4 = atom5.type_limits;
            try {
                if (i4 == 2 || (i4 == 0 && style == 0)) {
                    Box boxCreateBox2 = new UnderOverAtom(new UnderOverAtom(atom5, this.subscript, 3, 0.3f, true, false), this.superscript, 3, 3.0f, true, true).createBox(teXEnvironment);
                    boxWrapDepth--;
                    return boxCreateBox2;
                }
                HorizontalBox horizontalBox3 = new HorizontalBox(strutBox);
                int lastFontId = strutBox.getLastFontId();
                if (lastFontId == -1) {
                    lastFontId = teXFont.getMuFontId();
                }
                TeXEnvironment teXEnvironmentSubStyle = teXEnvironment.subStyle();
                TeXEnvironment teXEnvironmentSupStyle = teXEnvironment.supStyle();
                Atom atom6 = this.base;
                if (!(atom6 instanceof AccentedAtom)) {
                    if ((atom6 instanceof SymbolAtom) && atom6.type == 1) {
                        Char nextLarger = teXFont.getChar(((SymbolAtom) atom6).getName(), style);
                        if (style < 2 && teXFont.hasNextLarger(nextLarger)) {
                            nextLarger = teXFont.getNextLarger(nextLarger, style);
                        }
                        CharBox charBox = new CharBox(nextLarger);
                        charBox.setShift(((-(charBox.getHeight() + charBox.getDepth())) / 2.0f) - teXEnvironment.getTeXFont().getAxisHeight(teXEnvironment.getStyle()));
                        HorizontalBox horizontalBox4 = new HorizontalBox(charBox);
                        float italic = nextLarger.getItalic();
                        Box boxCreateBox3 = new SpaceAtom(2).createBox(teXEnvironment);
                        if (italic > 1.0E-7f && this.subscript == null) {
                            horizontalBox4.add(new StrutBox(italic, 0.0f, 0.0f, 0.0f));
                        }
                        float height2 = horizontalBox4.getHeight() - teXFont.getSupDrop(teXEnvironmentSupStyle.getStyle());
                        f2 = italic;
                        depth2 = horizontalBox4.getDepth() + teXFont.getSubDrop(teXEnvironmentSubStyle.getStyle());
                        f = height2;
                        horizontalBox = horizontalBox4;
                        box = boxCreateBox3;
                    } else if (atom6 instanceof CharSymbol) {
                        CharFont charFont = ((CharSymbol) atom6).getCharFont(teXFont);
                        float italic2 = (((CharSymbol) this.base).isMarkedAsTextSymbol() && teXFont.hasSpace(charFont.fontId)) ? 0.0f : teXFont.getChar(charFont, style).getItalic();
                        if (italic2 > 1.0E-7f && this.subscript == null) {
                            horizontalBox3.add(new StrutBox(italic2, 0.0f, 0.0f, 0.0f));
                            italic2 = 0.0f;
                        }
                        horizontalBox = horizontalBox3;
                        f = 0.0f;
                        box = strutBox2;
                        f2 = italic2;
                        depth2 = 0.0f;
                    } else {
                        height = strutBox.getHeight() - teXFont.getSupDrop(teXEnvironmentSupStyle.getStyle());
                        depth = strutBox.getDepth();
                        subDrop = teXFont.getSubDrop(teXEnvironmentSubStyle.getStyle());
                    }
                    atom = this.superscript;
                    if (atom == null) {
                        Box boxCreateBox4 = this.subscript.createBox(teXEnvironmentSubStyle);
                        boxCreateBox4.setShift(Math.max(Math.max(depth2, teXFont.getSub1(style)), boxCreateBox4.getHeight() - ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f)));
                        horizontalBox.add(boxCreateBox4);
                        horizontalBox.add(box);
                        i = boxWrapDepth - 1;
                    } else {
                        boxCreateBox = atom.createBox(teXEnvironmentSupStyle);
                        width = boxCreateBox.getWidth();
                        atom2 = this.subscript;
                        if (atom2 != null) {
                            f3 = 0.0f;
                            if (this.align == 1) {
                                width = Math.max(width, atom2.createBox(teXEnvironmentSubStyle).getWidth());
                            }
                        } else {
                            f3 = 0.0f;
                        }
                        horizontalBox2 = new HorizontalBox(boxCreateBox, width, this.align);
                        spaceAtom = SCRIPT_SPACE;
                        horizontalBox2.add(spaceAtom.createBox(teXEnvironment));
                        if (style == 0) {
                            sup2 = teXFont.getSup1(style);
                        } else if (teXEnvironment.crampStyle().getStyle() == style) {
                            sup2 = teXFont.getSup3(style);
                        } else {
                            sup2 = teXFont.getSup2(style);
                        }
                        fMax = Math.max(Math.max(f, sup2), boxCreateBox.getDepth() + (Math.abs(teXFont.getXHeight(style, lastFontId)) / 4.0f));
                        atom3 = this.subscript;
                        if (atom3 == null) {
                            horizontalBox2.setShift(-fMax);
                            horizontalBox.add(horizontalBox2);
                        } else {
                            Box boxCreateBox5 = atom3.createBox(teXEnvironmentSubStyle);
                            HorizontalBox horizontalBox5 = new HorizontalBox(boxCreateBox5, width, this.align);
                            horizontalBox5.add(spaceAtom.createBox(teXEnvironment));
                            fMax2 = Math.max(depth2, teXFont.getSub2(style));
                            float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
                            depth3 = ((fMax - boxCreateBox.getDepth()) + fMax2) - boxCreateBox5.getHeight();
                            f4 = defaultRuleThickness * 4.0f;
                            if (depth3 < f4) {
                                f5 = fMax + (f4 - depth3);
                                fAbs = ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f) - (f5 - boxCreateBox.getDepth());
                                if (fAbs > f3) {
                                    f5 += fAbs;
                                    fMax2 -= fAbs;
                                }
                            } else {
                                f5 = fMax;
                            }
                            VerticalBox verticalBox = new VerticalBox();
                            horizontalBox2.setShift(f2);
                            verticalBox.add(horizontalBox2);
                            verticalBox.add(new StrutBox(0.0f, ((f5 - boxCreateBox.getDepth()) + fMax2) - boxCreateBox5.getHeight(), 0.0f, 0.0f));
                            verticalBox.add(horizontalBox5);
                            verticalBox.setHeight(f5 + boxCreateBox.getHeight());
                            verticalBox.setDepth(fMax2 + boxCreateBox5.getDepth());
                            horizontalBox.add(verticalBox);
                        }
                        horizontalBox.add(box);
                        i = boxWrapDepth - 1;
                    }
                    boxWrapDepth = i;
                    return horizontalBox;
                }
                Box boxCreateBox6 = ((AccentedAtom) atom6).base.createBox(teXEnvironment.crampStyle());
                height = boxCreateBox6.getHeight() - teXFont.getSupDrop(teXEnvironmentSupStyle.getStyle());
                depth = boxCreateBox6.getDepth();
                subDrop = teXFont.getSubDrop(teXEnvironmentSubStyle.getStyle());
                depth2 = depth + subDrop;
                f = height;
                horizontalBox = horizontalBox3;
                box = strutBox2;
                f2 = 0.0f;
                atom = this.superscript;
                if (atom == null) {
                    Box boxCreateBox7 = this.subscript.createBox(teXEnvironmentSubStyle);
                    boxCreateBox7.setShift(Math.max(Math.max(depth2, teXFont.getSub1(style)), boxCreateBox7.getHeight() - ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f)));
                    horizontalBox.add(boxCreateBox7);
                    horizontalBox.add(box);
                    i = boxWrapDepth - 1;
                } else {
                    boxCreateBox = atom.createBox(teXEnvironmentSupStyle);
                    width = boxCreateBox.getWidth();
                    atom2 = this.subscript;
                    if (atom2 != null) {
                        f3 = 0.0f;
                        if (this.align == 1) {
                            width = Math.max(width, atom2.createBox(teXEnvironmentSubStyle).getWidth());
                        }
                    } else {
                        f3 = 0.0f;
                    }
                    horizontalBox2 = new HorizontalBox(boxCreateBox, width, this.align);
                    spaceAtom = SCRIPT_SPACE;
                    horizontalBox2.add(spaceAtom.createBox(teXEnvironment));
                    if (style == 0) {
                        sup2 = teXFont.getSup1(style);
                    } else if (teXEnvironment.crampStyle().getStyle() == style) {
                        sup2 = teXFont.getSup3(style);
                    } else {
                        sup2 = teXFont.getSup2(style);
                    }
                    fMax = Math.max(Math.max(f, sup2), boxCreateBox.getDepth() + (Math.abs(teXFont.getXHeight(style, lastFontId)) / 4.0f));
                    atom3 = this.subscript;
                    if (atom3 == null) {
                        horizontalBox2.setShift(-fMax);
                        horizontalBox.add(horizontalBox2);
                    } else {
                        Box boxCreateBox8 = atom3.createBox(teXEnvironmentSubStyle);
                        HorizontalBox horizontalBox6 = new HorizontalBox(boxCreateBox8, width, this.align);
                        horizontalBox6.add(spaceAtom.createBox(teXEnvironment));
                        fMax2 = Math.max(depth2, teXFont.getSub2(style));
                        float defaultRuleThickness2 = teXFont.getDefaultRuleThickness(style);
                        depth3 = ((fMax - boxCreateBox.getDepth()) + fMax2) - boxCreateBox8.getHeight();
                        f4 = defaultRuleThickness2 * 4.0f;
                        if (depth3 < f4) {
                            f5 = fMax + (f4 - depth3);
                            fAbs = ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f) - (f5 - boxCreateBox.getDepth());
                            if (fAbs > f3) {
                                f5 += fAbs;
                                fMax2 -= fAbs;
                            }
                        } else {
                            f5 = fMax;
                        }
                        VerticalBox verticalBox2 = new VerticalBox();
                        horizontalBox2.setShift(f2);
                        verticalBox2.add(horizontalBox2);
                        verticalBox2.add(new StrutBox(0.0f, ((f5 - boxCreateBox.getDepth()) + fMax2) - boxCreateBox8.getHeight(), 0.0f, 0.0f));
                        verticalBox2.add(horizontalBox6);
                        verticalBox2.setHeight(f5 + boxCreateBox.getHeight());
                        verticalBox2.setDepth(fMax2 + boxCreateBox8.getDepth());
                        horizontalBox.add(verticalBox2);
                    }
                    horizontalBox.add(box);
                    i = boxWrapDepth - 1;
                }
                boxWrapDepth = i;
                return horizontalBox;
            } catch (Throwable th) {
                th = th;
                boxWrapDepth--;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override
    public int getLeftType() {
        return this.base.getLeftType();
    }

    @Override
    public int getRightType() {
        return this.base.getRightType();
    }
}
