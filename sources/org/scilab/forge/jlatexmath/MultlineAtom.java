package org.scilab.forge.jlatexmath;

public class MultlineAtom extends Atom {
    public static final int GATHER = 1;
    public static final int GATHERED = 2;
    public static final int MULTLINE = 0;
    public static SpaceAtom vsep_in = new SpaceAtom(1, 0.0f, 1.0f, 0.0f);
    private ArrayOfAtoms column;
    private boolean isPartial;
    private int type;

    public MultlineAtom(boolean z10, ArrayOfAtoms arrayOfAtoms, int i10) {
        this.isPartial = z10;
        this.column = arrayOfAtoms;
        this.type = i10;
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        ArrayOfAtoms arrayOfAtoms;
        int i10;
        float textwidth = teXEnvironment.getTextwidth();
        if (textwidth != Float.POSITIVE_INFINITY) {
            if (this.type != 2) {
                VerticalBox verticalBox = new VerticalBox();
                Atom atom = this.column.array.get(0).get(0);
                int i11 = this.type == 1 ? 2 : 0;
                int i12 = atom.alignment;
                if (i12 != -1) {
                    i11 = i12;
                }
                verticalBox.add(new HorizontalBox(atom.createBox(teXEnvironment), textwidth, i11));
                Box boxCreateBox = vsep_in.createBox(teXEnvironment);
                int i13 = 1;
                while (true) {
                    arrayOfAtoms = this.column;
                    i10 = arrayOfAtoms.row;
                    if (i13 >= i10 - 1) {
                        break;
                    }
                    Atom atom2 = arrayOfAtoms.array.get(i13).get(0);
                    int i14 = atom2.alignment;
                    if (i14 == -1) {
                        i14 = 2;
                    }
                    verticalBox.add(boxCreateBox);
                    verticalBox.add(new HorizontalBox(atom2.createBox(teXEnvironment), textwidth, i14));
                    i13++;
                }
                if (i10 > 1) {
                    Atom atom3 = arrayOfAtoms.array.get(i10 - 1).get(0);
                    int i15 = this.type != 1 ? 1 : 2;
                    int i16 = atom3.alignment;
                    if (i16 != -1) {
                        i15 = i16;
                    }
                    verticalBox.add(boxCreateBox);
                    verticalBox.add(new HorizontalBox(atom3.createBox(teXEnvironment), textwidth, i15));
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
