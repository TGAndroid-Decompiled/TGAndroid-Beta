package org.scilab.forge.jlatexmath;
public class MulticolumnAtom extends Atom {
    protected int afterVlines;
    protected int align;
    protected int beforeVlines;
    protected int col;
    protected Atom cols;
    protected int f22679n;
    protected int row;
    protected float f22680w = 0.0f;

    public MulticolumnAtom(int i7, String str, Atom atom) {
        this.f22679n = i7 < 1 ? 1 : i7;
        this.cols = atom;
        this.align = parseAlign(str);
    }

    private int parseAlign(String str) {
        int length = str.length();
        int i7 = 0;
        int i10 = 2;
        boolean z10 = true;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt != 'c') {
                if (charAt != 'l') {
                    if (charAt != 'r') {
                        if (charAt == '|') {
                            if (z10) {
                                this.beforeVlines = 1;
                            } else {
                                this.afterVlines = 1;
                            }
                            while (true) {
                                int i11 = i7 + 1;
                                if (i11 < length) {
                                    if (str.charAt(i11) != '|') {
                                        break;
                                    }
                                    if (z10) {
                                        this.beforeVlines++;
                                    } else {
                                        this.afterVlines++;
                                    }
                                    i7 = i11;
                                } else {
                                    i7 = i11;
                                    break;
                                }
                            }
                        }
                    } else {
                        z10 = false;
                        i10 = 1;
                    }
                } else {
                    i10 = 0;
                    z10 = false;
                }
            } else {
                z10 = false;
                i10 = 2;
            }
            i7++;
        }
        return i10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box horizontalBox;
        if (this.f22680w == 0.0f) {
            horizontalBox = this.cols.createBox(teXEnvironment);
        } else {
            horizontalBox = new HorizontalBox(this.cols.createBox(teXEnvironment), this.f22680w, this.align);
        }
        horizontalBox.type = 12;
        return horizontalBox;
    }

    public int getCol() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }

    public int getSkipped() {
        return this.f22679n;
    }

    public boolean hasRightVline() {
        if (this.afterVlines != 0) {
            return true;
        }
        return false;
    }

    public void setRowColumn(int i7, int i10) {
        this.row = i7;
        this.col = i10;
    }

    public void setWidth(float f10) {
        this.f22680w = f10;
    }
}
