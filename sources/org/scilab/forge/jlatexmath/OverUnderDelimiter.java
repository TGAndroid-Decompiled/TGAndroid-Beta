package org.scilab.forge.jlatexmath;

public class OverUnderDelimiter extends Atom {
    private final Atom base;
    private final SpaceAtom kern;
    private final boolean over;
    private Atom script;
    private final SymbolAtom symbol;

    public OverUnderDelimiter(Atom atom, Atom atom2, SymbolAtom symbolAtom, int i, float f, boolean z) {
        this.type = 7;
        this.base = atom;
        this.script = atom2;
        this.symbol = symbolAtom;
        this.kern = new SpaceAtom(i, 0.0f, f, 0.0f);
        this.over = z;
    }

    public void addScript(Atom atom) {
        this.script = atom;
    }

    public boolean isOver() {
        return this.over;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreateBox;
        Atom atom = this.base;
        Box strutBox = atom == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment);
        Box boxCreate = DelimiterFactory.create(this.symbol.getName(), teXEnvironment, strutBox.getWidth());
        Atom atom2 = this.script;
        if (atom2 != null) {
            boxCreateBox = atom2.createBox(this.over ? teXEnvironment.supStyle() : teXEnvironment.subStyle());
        } else {
            boxCreateBox = null;
        }
        float maxWidth = getMaxWidth(strutBox, boxCreate, boxCreateBox);
        return new OverUnderBox(maxWidth - strutBox.getWidth() > 1.0E-7f ? new HorizontalBox(strutBox, maxWidth, 2) : strutBox, new VerticalBox(boxCreate, maxWidth, 2), (boxCreateBox == null || maxWidth - boxCreateBox.getWidth() <= 1.0E-7f) ? boxCreateBox : new HorizontalBox(boxCreateBox, maxWidth, 2), this.kern.createBox(teXEnvironment).getHeight(), this.over);
    }

    private static float getMaxWidth(Box box, Box box2, Box box3) {
        float fMax = Math.max(box.getWidth(), box2.getHeight() + box2.getDepth());
        return box3 != null ? Math.max(fMax, box3.getWidth()) : fMax;
    }
}
