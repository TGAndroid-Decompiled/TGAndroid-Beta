package org.scilab.forge.jlatexmath;

import java.util.LinkedList;

public class MultlineAtom extends Atom {
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
        ArrayOfAtoms arrayOfAtoms;
        int i;
        float textwidth = teXEnvironment.getTextwidth();
        if (textwidth != Float.POSITIVE_INFINITY) {
            if (this.type != 2) {
                VerticalBox verticalBox = new VerticalBox();
                Atom atom = (Atom) ((LinkedList) this.column.array.get(0)).get(0);
                int i2 = this.type == 1 ? 2 : 0;
                int i3 = atom.alignment;
                if (i3 != -1) {
                    i2 = i3;
                }
                verticalBox.add(new HorizontalBox(atom.createBox(teXEnvironment), textwidth, i2));
                Box boxCreateBox = vsep_in.createBox(teXEnvironment);
                int i4 = 1;
                while (true) {
                    arrayOfAtoms = this.column;
                    i = arrayOfAtoms.row;
                    if (i4 >= i - 1) {
                        break;
                    }
                    Atom atom2 = (Atom) ((LinkedList) arrayOfAtoms.array.get(i4)).get(0);
                    int i5 = atom2.alignment;
                    if (i5 == -1) {
                        i5 = 2;
                    }
                    verticalBox.add(boxCreateBox);
                    verticalBox.add(new HorizontalBox(atom2.createBox(teXEnvironment), textwidth, i5));
                    i4++;
                }
                if (i > 1) {
                    Atom atom3 = (Atom) ((LinkedList) arrayOfAtoms.array.get(i - 1)).get(0);
                    int i6 = this.type != 1 ? 1 : 2;
                    int i7 = atom3.alignment;
                    if (i7 != -1) {
                        i6 = i7;
                    }
                    verticalBox.add(boxCreateBox);
                    verticalBox.add(new HorizontalBox(atom3.createBox(teXEnvironment), textwidth, i6));
                }
                float height = (verticalBox.getHeight() + verticalBox.getDepth()) / 2.0f;
                verticalBox.setHeight(height);
                verticalBox.setDepth(height);
                return verticalBox;
            }
        }
        return new MatrixAtom(this.isPartial, this.column, "").createBox(teXEnvironment);
    }
}
