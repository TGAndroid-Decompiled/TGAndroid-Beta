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
        if (i10 == 0 || i10 == 1) {
            return i10;
        }
        return 2;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float denom2;
        float num2;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
        if (this.noDefault) {
            this.thickness = SpaceAtom.getFactor(this.unit, teXEnvironment) * this.thickness;
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
            num2 = teXFont.getNum1(style);
            denom2 = teXFont.getDenom1(style);
        } else {
            denom2 = teXFont.getDenom2(style);
            num2 = this.thickness > 0.0f ? teXFont.getNum2(style) : teXFont.getNum3(style);
        }
        VerticalBox verticalBox = new VerticalBox();
        verticalBox.add(strutBox);
        float axisHeight = teXFont.getAxisHeight(style);
        float f10 = this.thickness;
        if (f10 > 0.0f) {
            float f11 = style < 2 ? 3.0f * f10 : f10;
            float f12 = f10 / 2.0f;
            float depth = (num2 - strutBox.getDepth()) - (axisHeight + f12);
            float height = (axisHeight - f12) - (strutBox2.getHeight() - denom2);
            float f13 = f11 - depth;
            float f14 = f11 - height;
            if (f13 > 0.0f) {
                num2 += f13;
                depth += f13;
            }
            if (f14 > 0.0f) {
                denom2 += f14;
                height += f14;
            }
            verticalBox.add(new StrutBox(0.0f, depth, 0.0f, 0.0f));
            verticalBox.add(new HorizontalRule(this.thickness, strutBox.getWidth(), 0.0f));
            verticalBox.add(new StrutBox(0.0f, height, 0.0f, 0.0f));
        } else {
            float f15 = style < 2 ? defaultRuleThickness * 7.0f : defaultRuleThickness * 3.0f;
            float depth2 = (num2 - strutBox.getDepth()) - (strutBox2.getHeight() - denom2);
            float f16 = (f15 - depth2) / 2.0f;
            if (f16 > 0.0f) {
                num2 += f16;
                denom2 += f16;
                depth2 += f16 * 2.0f;
            }
            verticalBox.add(new StrutBox(0.0f, depth2, 0.0f, 0.0f));
        }
        verticalBox.add(strutBox2);
        verticalBox.setHeight(strutBox.getHeight() + num2);
        verticalBox.setDepth(strutBox2.getDepth() + denom2);
        return new HorizontalBox(verticalBox, (new SpaceAtom(0, 0.12f, 0.0f, 0.0f).createBox(teXEnvironment).getWidth() * 2.0f) + verticalBox.getWidth(), 2);
    }

    public FractionAtom(Atom atom, Atom atom2, boolean z10) {
        this(atom, atom2, !z10, 2, 0.0f);
    }

    public FractionAtom(Atom atom, Atom atom2, boolean z10, int i10, float f10) {
        this.noDefault = false;
        this.numAlign = 2;
        this.denomAlign = 2;
        this.defFactorSet = false;
        SpaceAtom.checkUnit(i10);
        this.numerator = atom;
        this.denominator = atom2;
        this.noDefault = z10;
        this.thickness = f10;
        this.unit = i10;
        this.type = 7;
    }

    public FractionAtom(Atom atom, Atom atom2, boolean z10, int i10, int i11) {
        this(atom, atom2, z10);
        this.numAlign = checkAlignment(i10);
        this.denomAlign = checkAlignment(i11);
    }

    public FractionAtom(Atom atom, Atom atom2, float f10, int i10, int i11) {
        this(atom, atom2, true, i10, i11);
        this.defFactor = f10;
        this.defFactorSet = true;
    }

    public FractionAtom(Atom atom, Atom atom2, int i10, float f10, int i11, int i12) {
        this(atom, atom2, i10, f10);
        this.numAlign = checkAlignment(i11);
        this.denomAlign = checkAlignment(i12);
    }

    public FractionAtom(Atom atom, Atom atom2, int i10, float f10) {
        this(atom, atom2, true, i10, f10);
    }
}
