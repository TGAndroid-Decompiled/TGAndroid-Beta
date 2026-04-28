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

    private int checkAlignment(int i) {
        if (i == 0 || i == 1) {
            return i;
        }
        return 2;
    }

    public FractionAtom(Atom atom, Atom atom2) {
        this(atom, atom2, true);
    }

    public FractionAtom(Atom atom, Atom atom2, boolean z) {
        this(atom, atom2, !z, 2, 0.0f);
    }

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

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float denom2;
        float num3;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
        if (this.noDefault) {
            this.thickness *= SpaceAtom.getFactor(this.unit, teXEnvironment);
        } else {
            this.thickness = this.defFactorSet ? this.defFactor * defaultRuleThickness : defaultRuleThickness;
        }
        Atom atom = this.numerator;
        Box strutBox = atom == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment.numStyle());
        Atom atom2 = this.denominator;
        Box strutBox2 = atom2 == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom2.createBox(teXEnvironment.denomStyle());
        if (strutBox.getWidth() < strutBox2.getWidth()) {
            strutBox = new HorizontalBox(strutBox, strutBox2.getWidth(), this.numAlign);
        } else {
            strutBox2 = new HorizontalBox(strutBox2, strutBox.getWidth(), this.denomAlign);
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
        verticalBox.add(strutBox);
        float axisHeight = teXFont.getAxisHeight(style);
        float f = this.thickness;
        if (f > 0.0f) {
            float f2 = style < 2 ? 3.0f * f : f;
            float f3 = f / 2.0f;
            float depth = (num3 - strutBox.getDepth()) - (axisHeight + f3);
            float height = (axisHeight - f3) - (strutBox2.getHeight() - denom2);
            float f4 = f2 - depth;
            float f5 = f2 - height;
            if (f4 > 0.0f) {
                num3 += f4;
                depth += f4;
            }
            if (f5 > 0.0f) {
                denom2 += f5;
                height += f5;
            }
            verticalBox.add(new StrutBox(0.0f, depth, 0.0f, 0.0f));
            verticalBox.add(new HorizontalRule(this.thickness, strutBox.getWidth(), 0.0f));
            verticalBox.add(new StrutBox(0.0f, height, 0.0f, 0.0f));
        } else {
            float f6 = style < 2 ? defaultRuleThickness * 7.0f : defaultRuleThickness * 3.0f;
            float depth2 = (num3 - strutBox.getDepth()) - (strutBox2.getHeight() - denom2);
            float f7 = (f6 - depth2) / 2.0f;
            if (f7 > 0.0f) {
                num3 += f7;
                denom2 += f7;
                depth2 += f7 * 2.0f;
            }
            verticalBox.add(new StrutBox(0.0f, depth2, 0.0f, 0.0f));
        }
        verticalBox.add(strutBox2);
        verticalBox.setHeight(num3 + strutBox.getHeight());
        verticalBox.setDepth(denom2 + strutBox2.getDepth());
        return new HorizontalBox(verticalBox, verticalBox.getWidth() + (new SpaceAtom(0, 0.12f, 0.0f, 0.0f).createBox(teXEnvironment).getWidth() * 2.0f), 2);
    }
}
