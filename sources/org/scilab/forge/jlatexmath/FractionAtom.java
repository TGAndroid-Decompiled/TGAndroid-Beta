package org.scilab.forge.jlatexmath;
public class FractionAtom extends Atom {
    private float defFactor;
    private boolean defFactorSet;
    private int denomAlign;
    private Atom denominator;
    private boolean noDefault;
    private int numAlign;
    private Atom numerator;
    private float thickness;
    private int unit;

    public FractionAtom(Atom atom, Atom atom2) {
        this(atom, atom2, true);
    }

    private int checkAlignment(int i10) {
        if (i10 != 0 && i10 != 1) {
            return 2;
        }
        return i10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float f9;
        HorizontalBox createBox;
        HorizontalBox createBox2;
        float denom2;
        float num3;
        float f10;
        float f11;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
        if (this.noDefault) {
            this.thickness = SpaceAtom.getFactor(this.unit, teXEnvironment) * this.thickness;
        } else {
            if (this.defFactorSet) {
                f9 = this.defFactor * defaultRuleThickness;
            } else {
                f9 = defaultRuleThickness;
            }
            this.thickness = f9;
        }
        Atom atom = this.numerator;
        if (atom == null) {
            createBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            createBox = atom.createBox(teXEnvironment.numStyle());
        }
        Atom atom2 = this.denominator;
        if (atom2 == null) {
            createBox2 = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            createBox2 = atom2.createBox(teXEnvironment.denomStyle());
        }
        if (createBox.getWidth() < createBox2.getWidth()) {
            createBox = new HorizontalBox(createBox, createBox2.getWidth(), this.numAlign);
        } else {
            createBox2 = new HorizontalBox(createBox2, createBox.getWidth(), this.denomAlign);
        }
        if (style < 2) {
            num3 = teXFont.getNum1(style);
            denom2 = teXFont.getDenom1(style);
        } else {
            denom2 = teXFont.getDenom2(style);
            if (this.thickness > 0.0f) {
                num3 = teXFont.getNum2(style);
            } else {
                num3 = teXFont.getNum3(style);
            }
        }
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(createBox);
        float axisHeight = teXFont.getAxisHeight(style);
        float f12 = this.thickness;
        if (f12 > 0.0f) {
            if (style < 2) {
                f11 = 3.0f * f12;
            } else {
                f11 = f12;
            }
            float f13 = f12 / 2.0f;
            float depth = (num3 - createBox.getDepth()) - (axisHeight + f13);
            float height = (axisHeight - f13) - (createBox2.getHeight() - denom2);
            float f14 = f11 - depth;
            float f15 = f11 - height;
            if (f14 > 0.0f) {
                num3 += f14;
                depth += f14;
            }
            if (f15 > 0.0f) {
                denom2 += f15;
                height += f15;
            }
            verticalBox.add(new StrutBox(0.0f, depth, 0.0f, 0.0f));
            verticalBox.add(new HorizontalRule(this.thickness, createBox.getWidth(), 0.0f));
            verticalBox.add(new StrutBox(0.0f, height, 0.0f, 0.0f));
        } else {
            if (style < 2) {
                f10 = defaultRuleThickness * 7.0f;
            } else {
                f10 = defaultRuleThickness * 3.0f;
            }
            float depth2 = (num3 - createBox.getDepth()) - (createBox2.getHeight() - denom2);
            float f16 = (f10 - depth2) / 2.0f;
            if (f16 > 0.0f) {
                num3 += f16;
                denom2 += f16;
                depth2 += f16 * 2.0f;
            }
            verticalBox.add(new StrutBox(0.0f, depth2, 0.0f, 0.0f));
        }
        verticalBox.add(createBox2);
        verticalBox.setHeight(createBox.getHeight() + num3);
        verticalBox.setDepth(createBox2.getDepth() + denom2);
        return new HorizontalBox(verticalBox, (new SpaceAtom(0, 0.12f, 0.0f, 0.0f).createBox(teXEnvironment).getWidth() * 2.0f) + verticalBox.getWidth(), 2);
    }

    public FractionAtom(Atom atom, Atom atom2, boolean z10) {
        this(atom, atom2, !z10, 2, 0.0f);
    }

    public FractionAtom(Atom atom, Atom atom2, boolean z10, int i10, float f9) {
        this.noDefault = false;
        this.numAlign = 2;
        this.denomAlign = 2;
        this.defFactorSet = false;
        SpaceAtom.checkUnit(i10);
        this.numerator = atom;
        this.denominator = atom2;
        this.noDefault = z10;
        this.thickness = f9;
        this.unit = i10;
        this.type = 7;
    }

    public FractionAtom(Atom atom, Atom atom2, boolean z10, int i10, int i11) {
        this(atom, atom2, z10);
        this.numAlign = checkAlignment(i10);
        this.denomAlign = checkAlignment(i11);
    }

    public FractionAtom(Atom atom, Atom atom2, float f9, int i10, int i11) {
        this(atom, atom2, true, i10, i11);
        this.defFactor = f9;
        this.defFactorSet = true;
    }

    public FractionAtom(Atom atom, Atom atom2, int i10, float f9, int i11, int i12) {
        this(atom, atom2, i10, f9);
        this.numAlign = checkAlignment(i11);
        this.denomAlign = checkAlignment(i12);
    }

    public FractionAtom(Atom atom, Atom atom2, int i10, float f9) {
        this(atom, atom2, true, i10, f9);
    }
}
