package org.scilab.forge.jlatexmath;
public class MulticolumnAtom extends Atom {
    protected int afterVlines;
    protected int align;
    protected int beforeVlines;
    protected int col;
    protected Atom cols;
    protected int f21189n;
    protected int row;
    protected float f21190w = 0.0f;

    public MulticolumnAtom(int i3, String str, Atom atom) {
        this.f21189n = i3 < 1 ? 1 : i3;
        this.cols = atom;
        this.align = parseAlign(str);
    }

    private int parseAlign(String str) {
        int length = str.length();
        int i3 = 0;
        int i10 = 2;
        boolean z10 = true;
        while (i3 < length) {
            char charAt = str.charAt(i3);
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
                                int i11 = i3 + 1;
                                if (i11 < length) {
                                    if (str.charAt(i11) != '|') {
                                        break;
                                    }
                                    if (z10) {
                                        this.beforeVlines++;
                                    } else {
                                        this.afterVlines++;
                                    }
                                    i3 = i11;
                                } else {
                                    i3 = i11;
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
            i3++;
        }
        return i10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box horizontalBox;
        if (this.f21190w == 0.0f) {
            horizontalBox = this.cols.createBox(teXEnvironment);
        } else {
            horizontalBox = new HorizontalBox(this.cols.createBox(teXEnvironment), this.f21190w, this.align);
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
        return this.f21189n;
    }

    public boolean hasRightVline() {
        if (this.afterVlines != 0) {
            return true;
        }
        return false;
    }

    public void setRowColumn(int i3, int i10) {
        this.row = i3;
        this.col = i10;
    }

    public void setWidth(float f10) {
        this.f21190w = f10;
    }
}
