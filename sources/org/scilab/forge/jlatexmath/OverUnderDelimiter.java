package org.scilab.forge.jlatexmath;
public class OverUnderDelimiter extends Atom {
    private final Atom base;
    private final SpaceAtom kern;
    private final boolean over;
    private Atom script;
    private final SymbolAtom symbol;

    public OverUnderDelimiter(Atom atom, Atom atom2, SymbolAtom symbolAtom, int i9, float f10, boolean z10) {
        this.type = 7;
        this.base = atom;
        this.script = atom2;
        this.symbol = symbolAtom;
        this.kern = new SpaceAtom(i9, 0.0f, f10, 0.0f);
        this.over = z10;
    }

    private static float getMaxWidth(Box box, Box box2, Box box3) {
        float max = Math.max(box.getWidth(), box2.getDepth() + box2.getHeight());
        if (box3 != null) {
            return Math.max(max, box3.getWidth());
        }
        return max;
    }

    public void addScript(Atom atom) {
        this.script = atom;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox;
        Box box;
        HorizontalBox horizontalBox;
        HorizontalBox horizontalBox2;
        TeXEnvironment subStyle;
        Atom atom = this.base;
        if (atom == null) {
            createBox = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            createBox = atom.createBox(teXEnvironment);
        }
        Box create = DelimiterFactory.create(this.symbol.getName(), teXEnvironment, createBox.getWidth());
        Atom atom2 = this.script;
        if (atom2 != null) {
            if (this.over) {
                subStyle = teXEnvironment.supStyle();
            } else {
                subStyle = teXEnvironment.subStyle();
            }
            box = atom2.createBox(subStyle);
        } else {
            box = null;
        }
        float maxWidth = getMaxWidth(createBox, create, box);
        if (maxWidth - createBox.getWidth() > 1.0E-7f) {
            horizontalBox = new HorizontalBox(createBox, maxWidth, 2);
        } else {
            horizontalBox = createBox;
        }
        VerticalBox verticalBox = new VerticalBox(create, maxWidth, 2);
        if (box != null && maxWidth - box.getWidth() > 1.0E-7f) {
            horizontalBox2 = new HorizontalBox(box, maxWidth, 2);
        } else {
            horizontalBox2 = box;
        }
        return new OverUnderBox(horizontalBox, verticalBox, horizontalBox2, this.kern.createBox(teXEnvironment).getHeight(), this.over);
    }

    public boolean isOver() {
        return this.over;
    }
}
