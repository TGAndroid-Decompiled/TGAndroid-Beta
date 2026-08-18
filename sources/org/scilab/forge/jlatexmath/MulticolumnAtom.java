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

    public void setWidth(float f) {
        this.w = f;
    }

    public int getSkipped() {
        return this.n;
    }

    public boolean hasRightVline() {
        return this.afterVlines != 0;
    }

    public void setRowColumn(int i, int i2) {
        this.row = i;
        this.col = i2;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    private int parseAlign(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 2;
        boolean z = true;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 'c') {
                i2 = 2;
            } else if (cCharAt != 'l') {
                if (cCharAt == 'r') {
                    i2 = 1;
                } else if (cCharAt == '|') {
                    if (z) {
                        this.beforeVlines = 1;
                    } else {
                        this.afterVlines = 1;
                    }
                    while (true) {
                        int i3 = i + 1;
                        if (i3 >= length) {
                            i = i3;
                            break;
                        }
                        if (str.charAt(i3) != '|') {
                            break;
                        }
                        if (z) {
                            this.beforeVlines++;
                        } else {
                            this.afterVlines++;
                        }
                        i = i3;
                    }
                }
                i++;
            } else {
                i2 = 0;
            }
            z = false;
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
}
