package org.scilab.forge.jlatexmath;
public class MulticolumnAtom extends Atom {
    protected int afterVlines;
    protected int align;
    protected int beforeVlines;
    protected int col;
    protected Atom cols;
    protected int f17051n;
    protected int row;
    protected float f17052w = 0.0f;

    public MulticolumnAtom(int i10, String str, Atom atom) {
        this.f17051n = i10 < 1 ? 1 : i10;
        this.cols = atom;
        this.align = parseAlign(str);
    }

    private int parseAlign(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 2;
        boolean z10 = true;
        while (i10 < length) {
            char charAt = str.charAt(i10);
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
                                int i12 = i10 + 1;
                                if (i12 < length) {
                                    if (str.charAt(i12) != '|') {
                                        break;
                                    }
                                    if (z10) {
                                        this.beforeVlines++;
                                    } else {
                                        this.afterVlines++;
                                    }
                                    i10 = i12;
                                } else {
                                    i10 = i12;
                                    break;
                                }
                            }
                        }
                        i10++;
                    } else {
                        i11 = 1;
                    }
                } else {
                    i11 = 0;
                }
            } else {
                i11 = 2;
            }
            z10 = false;
            i10++;
        }
        return i11;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box horizontalBox;
        if (this.f17052w == 0.0f) {
            horizontalBox = this.cols.createBox(teXEnvironment);
        } else {
            horizontalBox = new HorizontalBox(this.cols.createBox(teXEnvironment), this.f17052w, this.align);
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
        return this.f17051n;
    }

    public boolean hasRightVline() {
        if (this.afterVlines != 0) {
            return true;
        }
        return false;
    }

    public void setRowColumn(int i10, int i11) {
        this.row = i10;
        this.col = i11;
    }

    public void setWidth(float f7) {
        this.f17052w = f7;
    }
}
