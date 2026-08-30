package org.scilab.forge.jlatexmath;
public class MultlineAtom extends Atom {
    public static final int GATHER = 1;
    public static final int GATHERED = 2;
    public static final int MULTLINE = 0;
    public static SpaceAtom vsep_in = new SpaceAtom(1, 0.0f, 1.0f, 0.0f);
    private ArrayOfAtoms column;
    private boolean isPartial;
    private int type;

    public MultlineAtom(boolean z4, ArrayOfAtoms arrayOfAtoms, int i10) {
        this.isPartial = z4;
        this.column = arrayOfAtoms;
        this.type = i10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        int i10;
        ArrayOfAtoms arrayOfAtoms;
        int i11;
        float textwidth = teXEnvironment.getTextwidth();
        if (textwidth != Float.POSITIVE_INFINITY) {
            int i12 = 2;
            if (this.type != 2) {
                VerticalBox verticalBox = new VerticalBox();
                Atom atom = this.column.array.get(0).get(0);
                if (this.type == 1) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int i13 = atom.alignment;
                if (i13 != -1) {
                    i10 = i13;
                }
                verticalBox.add(new HorizontalBox(atom.createBox(teXEnvironment), textwidth, i10));
                Box createBox = vsep_in.createBox(teXEnvironment);
                int i14 = 1;
                while (true) {
                    arrayOfAtoms = this.column;
                    i11 = arrayOfAtoms.row;
                    if (i14 >= i11 - 1) {
                        break;
                    }
                    Atom atom2 = arrayOfAtoms.array.get(i14).get(0);
                    int i15 = atom2.alignment;
                    if (i15 == -1) {
                        i15 = 2;
                    }
                    verticalBox.add(createBox);
                    verticalBox.add(new HorizontalBox(atom2.createBox(teXEnvironment), textwidth, i15));
                    i14++;
                }
                if (i11 > 1) {
                    Atom atom3 = arrayOfAtoms.array.get(i11 - 1).get(0);
                    if (this.type != 1) {
                        i12 = 1;
                    }
                    int i16 = atom3.alignment;
                    if (i16 != -1) {
                        i12 = i16;
                    }
                    verticalBox.add(createBox);
                    verticalBox.add(new HorizontalBox(atom3.createBox(teXEnvironment), textwidth, i12));
                }
                float depth = (verticalBox.getDepth() + verticalBox.getHeight()) / 2.0f;
                verticalBox.setHeight(depth);
                verticalBox.setDepth(depth);
                return verticalBox;
            }
        }
        return new MatrixAtom(this.isPartial, this.column, "").createBox(teXEnvironment);
    }

    public MultlineAtom(ArrayOfAtoms arrayOfAtoms, int i10) {
        this(false, arrayOfAtoms, i10);
    }
}
