package org.scilab.forge.jlatexmath;
public class MultlineAtom extends Atom {
    public static final int GATHER = 1;
    public static final int GATHERED = 2;
    public static final int MULTLINE = 0;
    public static SpaceAtom vsep_in = new SpaceAtom(1, 0.0f, 1.0f, 0.0f);
    private ArrayOfAtoms column;
    private boolean isPartial;
    private int type;

    public MultlineAtom(boolean z, ArrayOfAtoms arrayOfAtoms, int i) {
        this.isPartial = z;
        this.column = arrayOfAtoms;
        this.type = i;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        int i;
        ArrayOfAtoms arrayOfAtoms;
        int i2;
        float textwidth = teXEnvironment.getTextwidth();
        if (textwidth != Float.POSITIVE_INFINITY) {
            int i3 = 2;
            if (this.type != 2) {
                VerticalBox verticalBox = new VerticalBox();
                Atom atom = this.column.array.get(0).get(0);
                if (this.type == 1) {
                    i = 2;
                } else {
                    i = 0;
                }
                int i4 = atom.alignment;
                if (i4 != -1) {
                    i = i4;
                }
                verticalBox.add(new HorizontalBox(atom.createBox(teXEnvironment), textwidth, i));
                Box createBox = vsep_in.createBox(teXEnvironment);
                int i5 = 1;
                while (true) {
                    arrayOfAtoms = this.column;
                    i2 = arrayOfAtoms.row;
                    if (i5 >= i2 - 1) {
                        break;
                    }
                    Atom atom2 = arrayOfAtoms.array.get(i5).get(0);
                    int i6 = atom2.alignment;
                    if (i6 == -1) {
                        i6 = 2;
                    }
                    verticalBox.add(createBox);
                    verticalBox.add(new HorizontalBox(atom2.createBox(teXEnvironment), textwidth, i6));
                    i5++;
                }
                if (i2 > 1) {
                    Atom atom3 = arrayOfAtoms.array.get(i2 - 1).get(0);
                    if (this.type != 1) {
                        i3 = 1;
                    }
                    int i7 = atom3.alignment;
                    if (i7 != -1) {
                        i3 = i7;
                    }
                    verticalBox.add(createBox);
                    verticalBox.add(new HorizontalBox(atom3.createBox(teXEnvironment), textwidth, i3));
                }
                float depth = (verticalBox.getDepth() + verticalBox.getHeight()) / 2.0f;
                verticalBox.setHeight(depth);
                verticalBox.setDepth(depth);
                return verticalBox;
            }
        }
        return new MatrixAtom(this.isPartial, this.column, "").createBox(teXEnvironment);
    }

    public MultlineAtom(ArrayOfAtoms arrayOfAtoms, int i) {
        this(false, arrayOfAtoms, i);
    }
}
