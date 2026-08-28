package org.scilab.forge.jlatexmath;
public class Dummy {
    private Atom el;
    private boolean textSymbol = false;
    private int type = -1;

    public Dummy(Atom atom) {
        this.el = atom;
    }

    public void changeAtom(FixedCharAtom fixedCharAtom) {
        this.textSymbol = false;
        this.type = -1;
        this.el = fixedCharAtom;
    }

    public Box createBox(TeXEnvironment teXEnvironment) {
        if (this.textSymbol) {
            ((CharSymbol) this.el).markAsTextSymbol();
        }
        Box createBox = this.el.createBox(teXEnvironment);
        if (this.textSymbol) {
            ((CharSymbol) this.el).removeMark();
        }
        return createBox;
    }

    public CharFont getCharFont(TeXFont teXFont) {
        return ((CharSymbol) this.el).getCharFont(teXFont);
    }

    public int getLeftType() {
        int i9 = this.type;
        if (i9 >= 0) {
            return i9;
        }
        return this.el.getLeftType();
    }

    public int getRightType() {
        int i9 = this.type;
        if (i9 >= 0) {
            return i9;
        }
        return this.el.getRightType();
    }

    public int getType() {
        return this.type;
    }

    public boolean isCharInMathMode() {
        Atom atom = this.el;
        if ((atom instanceof CharAtom) && ((CharAtom) atom).isMathMode()) {
            return true;
        }
        return false;
    }

    public boolean isCharSymbol() {
        return this.el instanceof CharSymbol;
    }

    public boolean isKern() {
        return this.el instanceof SpaceAtom;
    }

    public void markAsTextSymbol() {
        this.textSymbol = true;
    }

    public void setPreviousAtom(Dummy dummy) {
        Atom atom = this.el;
        if (atom instanceof Row) {
            ((Row) atom).setPreviousAtom(dummy);
        }
    }

    public void setType(int i9) {
        this.type = i9;
    }
}
