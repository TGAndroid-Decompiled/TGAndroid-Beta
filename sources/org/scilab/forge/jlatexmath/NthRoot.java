package org.scilab.forge.jlatexmath;

public class NthRoot extends Atom {
    private static final float FACTOR = 0.55f;
    private static final String sqrtSymbol = "sqrt";
    private final Atom base;
    private final Atom root;

    public NthRoot(Atom atom, Atom atom2) {
        this.base = atom == null ? new EmptyAtom() : atom;
        this.root = atom2 == null ? new EmptyAtom() : atom2;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
        float fAbs = (Math.abs(style < 2 ? teXFont.getXHeight(style, teXFont.getChar("sqrt", style).getFontCode()) : defaultRuleThickness) / 4.0f) + defaultRuleThickness;
        HorizontalBox horizontalBox = new HorizontalBox(this.base.createBox(teXEnvironment.crampStyle()));
        horizontalBox.add(new SpaceAtom(5, 1.0f, 0.0f, 0.0f).createBox(teXEnvironment.crampStyle()));
        float depth = horizontalBox.getDepth() + horizontalBox.getHeight() + fAbs;
        Box boxCreate = DelimiterFactory.create("sqrt", teXEnvironment, depth + defaultRuleThickness);
        float depth2 = ((boxCreate.getDepth() - depth) / 2.0f) + fAbs;
        boxCreate.setShift(-(horizontalBox.getHeight() + depth2));
        OverBar overBar = new OverBar(horizontalBox, depth2, boxCreate.getHeight());
        overBar.setShift(-(horizontalBox.getHeight() + depth2 + defaultRuleThickness));
        HorizontalBox horizontalBox2 = new HorizontalBox(boxCreate);
        horizontalBox2.add(overBar);
        Atom atom = this.root;
        if (atom == null) {
            return horizontalBox2;
        }
        Box boxCreateBox = atom.createBox(teXEnvironment.rootStyle());
        boxCreateBox.setShift((horizontalBox2.getDepth() - boxCreateBox.getDepth()) - ((horizontalBox2.getDepth() + horizontalBox2.getHeight()) * 0.55f));
        Box boxCreateBox2 = new SpaceAtom(5, -10.0f, 0.0f, 0.0f).createBox(teXEnvironment);
        HorizontalBox horizontalBox3 = new HorizontalBox();
        float width = boxCreateBox2.getWidth() + boxCreateBox.getWidth();
        if (width < 0.0f) {
            horizontalBox3.add(new StrutBox(-width, 0.0f, 0.0f, 0.0f));
        }
        horizontalBox3.add(boxCreateBox);
        horizontalBox3.add(boxCreateBox2);
        horizontalBox3.add(horizontalBox2);
        return horizontalBox3;
    }
}
