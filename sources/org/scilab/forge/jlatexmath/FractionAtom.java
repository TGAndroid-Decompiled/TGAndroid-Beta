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

    public FractionAtom(Atom atom, Atom atom2, boolean z, int i, float f) {
        this.noDefault = false;
        this.numAlign = 2;
        this.denomAlign = 2;
        this.defFactorSet = false;
        SpaceAtom.checkUnit(i);
        this.numerator = atom;
        this.denominator = atom2;
        this.noDefault = z;
        this.thickness = f;
        this.unit = i;
        this.type = 7;
    }

    private int checkAlignment(int i) {
        if (i != 0 && i != 1) {
            return 2;
        }
        return i;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float f;
        HorizontalBox createBox;
        HorizontalBox createBox2;
        float denom2;
        float num3;
        float f2;
        float f3;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
        if (this.noDefault) {
            this.thickness = SpaceAtom.getFactor(this.unit, teXEnvironment) * this.thickness;
        } else {
            if (this.defFactorSet) {
                f = this.defFactor * defaultRuleThickness;
            } else {
                f = defaultRuleThickness;
            }
            this.thickness = f;
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
        float f4 = this.thickness;
        if (f4 > 0.0f) {
            if (style < 2) {
                f3 = 3.0f * f4;
            } else {
                f3 = f4;
            }
            float f5 = f4 / 2.0f;
            float depth = (num3 - createBox.getDepth()) - (axisHeight + f5);
            float height = (axisHeight - f5) - (createBox2.getHeight() - denom2);
            float f6 = f3 - depth;
            float f7 = f3 - height;
            if (f6 > 0.0f) {
                num3 += f6;
                depth += f6;
            }
            if (f7 > 0.0f) {
                denom2 += f7;
                height += f7;
            }
            verticalBox.add(new StrutBox(0.0f, depth, 0.0f, 0.0f));
            verticalBox.add(new HorizontalRule(this.thickness, createBox.getWidth(), 0.0f));
            verticalBox.add(new StrutBox(0.0f, height, 0.0f, 0.0f));
        } else {
            if (style < 2) {
                f2 = defaultRuleThickness * 7.0f;
            } else {
                f2 = defaultRuleThickness * 3.0f;
            }
            float depth2 = (num3 - createBox.getDepth()) - (createBox2.getHeight() - denom2);
            float f8 = (f2 - depth2) / 2.0f;
            if (f8 > 0.0f) {
                num3 += f8;
                denom2 += f8;
                depth2 += f8 * 2.0f;
            }
            verticalBox.add(new StrutBox(0.0f, depth2, 0.0f, 0.0f));
        }
        verticalBox.add(createBox2);
        verticalBox.setHeight(createBox.getHeight() + num3);
        verticalBox.setDepth(createBox2.getDepth() + denom2);
        return new HorizontalBox(verticalBox, (new SpaceAtom(0, 0.12f, 0.0f, 0.0f).createBox(teXEnvironment).getWidth() * 2.0f) + verticalBox.getWidth(), 2);
    }

    public FractionAtom(Atom atom, Atom atom2, boolean z) {
        this(atom, atom2, !z, 2, 0.0f);
    }

    public FractionAtom(Atom atom, Atom atom2) {
        this(atom, atom2, true);
    }

    public FractionAtom(Atom atom, Atom atom2, boolean z, int i, int i2) {
        this(atom, atom2, z);
        this.numAlign = checkAlignment(i);
        this.denomAlign = checkAlignment(i2);
    }

    public FractionAtom(Atom atom, Atom atom2, float f, int i, int i2) {
        this(atom, atom2, true, i, i2);
        this.defFactor = f;
        this.defFactorSet = true;
    }

    public FractionAtom(Atom atom, Atom atom2, int i, float f, int i2, int i3) {
        this(atom, atom2, i, f);
        this.numAlign = checkAlignment(i2);
        this.denomAlign = checkAlignment(i3);
    }

    public FractionAtom(Atom atom, Atom atom2, int i, float f) {
        this(atom, atom2, true, i, f);
    }
}
