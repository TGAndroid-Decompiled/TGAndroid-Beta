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
    public Box createBox(TeXEnvironment teXEnvironment) {
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
        HorizontalBox horizontalBox2;
        SpaceAtom spaceAtom;
        float sup2;
        float fMax;
        Atom atom3;
        float fMax2;
        float depth3;
        float f3;
        Box box2;
        float fAbs;
        int i;
        int i2 = boxWrapDepth;
        int i3 = i2 + 1;
        boxWrapDepth = i3;
        if (i3 > 64) {
            boxWrapDepth = i2;
            throw new DepthLimitExceededException();
        }
        int i4 = 1;
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
            int i5 = atom5.type_limits;
            if (i5 != 2 && (i5 != 0 || style != 0)) {
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
                        Box boxCreateBox2 = new SpaceAtom(2).createBox(teXEnvironment);
                        if (italic > 1.0E-7f && this.subscript == null) {
                            horizontalBox4.add(new StrutBox(italic, 0.0f, 0.0f, 0.0f));
                        }
                        float height2 = horizontalBox4.getHeight() - teXFont.getSupDrop(teXEnvironmentSupStyle.getStyle());
                        f2 = italic;
                        depth2 = horizontalBox4.getDepth() + teXFont.getSubDrop(teXEnvironmentSubStyle.getStyle());
                        f = height2;
                        horizontalBox = horizontalBox4;
                        box = boxCreateBox2;
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
                        Box boxCreateBox3 = this.subscript.createBox(teXEnvironmentSubStyle);
                        boxCreateBox3.setShift(Math.max(Math.max(depth2, teXFont.getSub1(style)), boxCreateBox3.getHeight() - ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f)));
                        horizontalBox.add(boxCreateBox3);
                        horizontalBox.add(box);
                        i = boxWrapDepth;
                    } else {
                        boxCreateBox = atom.createBox(teXEnvironmentSupStyle);
                        width = boxCreateBox.getWidth();
                        atom2 = this.subscript;
                        if (atom2 != null && this.align == 1) {
                            width = Math.max(width, atom2.createBox(teXEnvironmentSubStyle).getWidth());
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
                            box2 = box;
                        } else {
                            Box boxCreateBox4 = atom3.createBox(teXEnvironmentSubStyle);
                            Box box3 = box;
                            HorizontalBox horizontalBox5 = new HorizontalBox(boxCreateBox4, width, this.align);
                            horizontalBox5.add(spaceAtom.createBox(teXEnvironment));
                            fMax2 = Math.max(depth2, teXFont.getSub2(style));
                            float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
                            depth3 = ((fMax - boxCreateBox.getDepth()) + fMax2) - boxCreateBox4.getHeight();
                            f3 = defaultRuleThickness * 4.0f;
                            if (depth3 < f3) {
                                fMax += f3 - depth3;
                                fAbs = ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f) - (fMax - boxCreateBox.getDepth());
                                if (fAbs > 0.0f) {
                                    fMax += fAbs;
                                    fMax2 -= fAbs;
                                }
                            }
                            VerticalBox verticalBox = new VerticalBox();
                            horizontalBox2.setShift(f2);
                            verticalBox.add(horizontalBox2);
                            verticalBox.add(new StrutBox(0.0f, ((fMax - boxCreateBox.getDepth()) + fMax2) - boxCreateBox4.getHeight(), 0.0f, 0.0f));
                            verticalBox.add(horizontalBox5);
                            verticalBox.setHeight(fMax + boxCreateBox.getHeight());
                            verticalBox.setDepth(fMax2 + boxCreateBox4.getDepth());
                            horizontalBox.add(verticalBox);
                            box2 = box3;
                        }
                        horizontalBox.add(box2);
                        i = boxWrapDepth;
                        i4 = 1;
                    }
                    boxWrapDepth = i - i4;
                    return horizontalBox;
                }
                Box boxCreateBox5 = ((AccentedAtom) atom6).base.createBox(teXEnvironment.crampStyle());
                height = boxCreateBox5.getHeight() - teXFont.getSupDrop(teXEnvironmentSupStyle.getStyle());
                depth = boxCreateBox5.getDepth();
                subDrop = teXFont.getSubDrop(teXEnvironmentSubStyle.getStyle());
                depth2 = depth + subDrop;
                f = height;
                horizontalBox = horizontalBox3;
                box = strutBox2;
                f2 = 0.0f;
                atom = this.superscript;
                if (atom == null) {
                    Box boxCreateBox6 = this.subscript.createBox(teXEnvironmentSubStyle);
                    boxCreateBox6.setShift(Math.max(Math.max(depth2, teXFont.getSub1(style)), boxCreateBox6.getHeight() - ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f)));
                    horizontalBox.add(boxCreateBox6);
                    horizontalBox.add(box);
                    i = boxWrapDepth;
                } else {
                    boxCreateBox = atom.createBox(teXEnvironmentSupStyle);
                    width = boxCreateBox.getWidth();
                    atom2 = this.subscript;
                    if (atom2 != null) {
                        width = Math.max(width, atom2.createBox(teXEnvironmentSubStyle).getWidth());
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
                        box2 = box;
                    } else {
                        Box boxCreateBox7 = atom3.createBox(teXEnvironmentSubStyle);
                        Box box4 = box;
                        HorizontalBox horizontalBox6 = new HorizontalBox(boxCreateBox7, width, this.align);
                        horizontalBox6.add(spaceAtom.createBox(teXEnvironment));
                        fMax2 = Math.max(depth2, teXFont.getSub2(style));
                        float defaultRuleThickness2 = teXFont.getDefaultRuleThickness(style);
                        depth3 = ((fMax - boxCreateBox.getDepth()) + fMax2) - boxCreateBox7.getHeight();
                        f3 = defaultRuleThickness2 * 4.0f;
                        if (depth3 < f3) {
                            fMax += f3 - depth3;
                            fAbs = ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f) - (fMax - boxCreateBox.getDepth());
                            if (fAbs > 0.0f) {
                                fMax += fAbs;
                                fMax2 -= fAbs;
                            }
                        }
                        VerticalBox verticalBox2 = new VerticalBox();
                        horizontalBox2.setShift(f2);
                        verticalBox2.add(horizontalBox2);
                        verticalBox2.add(new StrutBox(0.0f, ((fMax - boxCreateBox.getDepth()) + fMax2) - boxCreateBox7.getHeight(), 0.0f, 0.0f));
                        verticalBox2.add(horizontalBox6);
                        verticalBox2.setHeight(fMax + boxCreateBox.getHeight());
                        verticalBox2.setDepth(fMax2 + boxCreateBox7.getDepth());
                        horizontalBox.add(verticalBox2);
                        box2 = box4;
                    }
                    horizontalBox.add(box2);
                    i = boxWrapDepth;
                    i4 = 1;
                }
                boxWrapDepth = i - i4;
                return horizontalBox;
            }
            Box boxCreateBox8 = new UnderOverAtom(new UnderOverAtom(atom5, this.subscript, 3, 0.3f, true, false), this.superscript, 3, 3.0f, true, true).createBox(teXEnvironment);
            boxWrapDepth--;
            return boxCreateBox8;
        } catch (Throwable th) {
            boxWrapDepth--;
            throw th;
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
