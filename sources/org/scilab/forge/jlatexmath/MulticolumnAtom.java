package org.scilab.forge.jlatexmath;

public class MulticolumnAtom extends Atom {
    protected int afterVlines;
    protected int align;
    protected int beforeVlines;
    protected int col;
    protected Atom cols;

    protected int f19593n;
    protected int row;

    protected float f19594w = 0.0f;

    public MulticolumnAtom(int i10, String str, Atom atom) {
        this.f19593n = i10 < 1 ? 1 : i10;
        this.cols = atom;
        this.align = parseAlign(str);
    }

    private int parseAlign(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 2;
        boolean z10 = true;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == 'c') {
                i11 = 2;
            } else if (cCharAt != 'l') {
                if (cCharAt == 'r') {
                    i11 = 1;
                } else if (cCharAt == '|') {
                    if (z10) {
                        this.beforeVlines = 1;
                    } else {
                        this.afterVlines = 1;
                    }
                    while (true) {
                        int i12 = i10 + 1;
                        if (i12 >= length) {
                            i10 = i12;
                            break;
                        }
                        if (str.charAt(i12) != '|') {
                            break;
                        }
                        if (z10) {
                            this.beforeVlines++;
                        } else {
                            this.afterVlines++;
                        }
                        i10 = i12;
                    }
                }
                i10++;
            } else {
                i11 = 0;
            }
            z10 = false;
            i10++;
        }
        return i11;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box boxCreateBox = this.f19594w == 0.0f ? this.cols.createBox(teXEnvironment) : new HorizontalBox(this.cols.createBox(teXEnvironment), this.f19594w, this.align);
        boxCreateBox.type = 12;
        return boxCreateBox;
    }

    public int getCol() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }

    public int getSkipped() {
        return this.f19593n;
    }

    public boolean hasRightVline() {
        return this.afterVlines != 0;
    }

    public void setRowColumn(int i10, int i11) {
        this.row = i10;
        this.col = i11;
    }

    public void setWidth(float f10) {
        this.f19594w = f10;
    }
}
