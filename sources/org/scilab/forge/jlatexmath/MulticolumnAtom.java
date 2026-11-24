package org.scilab.forge.jlatexmath;
public class MulticolumnAtom extends Atom {
    protected int afterVlines;
    protected int align;
    protected int beforeVlines;
    protected int col;
    protected Atom cols;
    protected int n;
    protected int row;
    protected float w = 0.0f;

    public MulticolumnAtom(int i, String str, Atom atom) {
        this.n = i < 1 ? 1 : i;
        this.cols = atom;
        this.align = parseAlign(str);
    }

    private int parseAlign(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 2;
        boolean z = true;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != 'c') {
                if (charAt != 'l') {
                    if (charAt != 'r') {
                        if (charAt == '|') {
                            if (z) {
                                this.beforeVlines = 1;
                            } else {
                                this.afterVlines = 1;
                            }
                            while (true) {
                                int i3 = i + 1;
                                if (i3 < length) {
                                    if (str.charAt(i3) == '|') {
                                        if (z) {
                                            this.beforeVlines++;
                                        } else {
                                            this.afterVlines++;
                                        }
                                        i = i3;
                                    }
                                } else {
                                    i = i3;
                                    break;
                                }
                            }
                        }
                    } else {
                        z = false;
                        i2 = 1;
                    }
                } else {
                    i2 = 0;
                    z = false;
                }
            } else {
                z = false;
                i2 = 2;
            }
            i++;
        }
        return i2;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box horizontalBox;
        if (this.w == 0.0f) {
            horizontalBox = this.cols.createBox(teXEnvironment);
        } else {
            horizontalBox = new HorizontalBox(this.cols.createBox(teXEnvironment), this.w, this.align);
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
        return this.n;
    }

    public boolean hasRightVline() {
        if (this.afterVlines != 0) {
            return true;
        }
        return false;
    }

    public void setRowColumn(int i, int i2) {
        this.row = i;
        this.col = i2;
    }

    public void setWidth(float f) {
        this.w = f;
    }
}
