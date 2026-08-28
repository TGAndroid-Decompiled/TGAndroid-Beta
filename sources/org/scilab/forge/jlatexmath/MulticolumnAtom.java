package org.scilab.forge.jlatexmath;
public class MulticolumnAtom extends Atom {
    protected int afterVlines;
    protected int align;
    protected int beforeVlines;
    protected int col;
    protected Atom cols;
    protected int f19620n;
    protected int row;
    protected float f19621w = 0.0f;

    public MulticolumnAtom(int i9, String str, Atom atom) {
        this.f19620n = i9 < 1 ? 1 : i9;
        this.cols = atom;
        this.align = parseAlign(str);
    }

    private int parseAlign(String str) {
        int length = str.length();
        int i9 = 0;
        int i10 = 2;
        boolean z10 = true;
        while (i9 < length) {
            char charAt = str.charAt(i9);
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
                                int i11 = i9 + 1;
                                if (i11 < length) {
                                    if (str.charAt(i11) != '|') {
                                        break;
                                    }
                                    if (z10) {
                                        this.beforeVlines++;
                                    } else {
                                        this.afterVlines++;
                                    }
                                    i9 = i11;
                                } else {
                                    i9 = i11;
                                    break;
                                }
                            }
                        }
                        i9++;
                    } else {
                        i10 = 1;
                    }
                } else {
                    i10 = 0;
                }
            } else {
                i10 = 2;
            }
            z10 = false;
            i9++;
        }
        return i10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box horizontalBox;
        if (this.f19621w == 0.0f) {
            horizontalBox = this.cols.createBox(teXEnvironment);
        } else {
            horizontalBox = new HorizontalBox(this.cols.createBox(teXEnvironment), this.f19621w, this.align);
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
        return this.f19620n;
    }

    public boolean hasRightVline() {
        if (this.afterVlines != 0) {
            return true;
        }
        return false;
    }

    public void setRowColumn(int i9, int i10) {
        this.row = i9;
        this.col = i10;
    }

    public void setWidth(float f10) {
        this.f19621w = f10;
    }
}
