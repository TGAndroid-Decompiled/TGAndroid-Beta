package org.scilab.forge.jlatexmath;

import java.util.Iterator;
import java.util.LinkedList;
public class ArrayOfAtoms extends TeXFormula {
    public LinkedList<LinkedList<Atom>> array;
    public int col;
    public int row;

    public ArrayOfAtoms() {
        LinkedList<LinkedList<Atom>> linkedList = new LinkedList<>();
        this.array = linkedList;
        linkedList.add(new LinkedList<>());
        this.row = 0;
    }

    public void addCol() {
        this.array.get(this.row).add(this.root);
        this.root = null;
    }

    public void addRow() {
        addCol();
        this.array.add(new LinkedList<>());
        this.row++;
    }

    public void checkDimensions() {
        if (this.array.getLast().size() != 0) {
            addRow();
        } else if (this.root != null) {
            addRow();
        }
        this.row = this.array.size() - 1;
        this.col = this.array.get(0).size();
        for (int i9 = 1; i9 < this.row; i9++) {
            if (this.array.get(i9).size() > this.col) {
                this.col = this.array.get(i9).size();
            }
        }
        for (int i10 = 0; i10 < this.row; i10++) {
            int size = this.array.get(i10).size();
            if (size != this.col && this.array.get(i10).get(0) != null && this.array.get(i10).get(0).type != 11) {
                LinkedList<Atom> linkedList = this.array.get(i10);
                while (size < this.col) {
                    linkedList.add(null);
                    size++;
                }
            }
        }
    }

    public VRowAtom getAsVRow() {
        VRowAtom vRowAtom = new VRowAtom();
        vRowAtom.setAddInterline(true);
        Iterator<LinkedList<Atom>> it = this.array.iterator();
        while (it.hasNext()) {
            Iterator<Atom> it2 = it.next().iterator();
            while (it2.hasNext()) {
                vRowAtom.append(it2.next());
            }
        }
        return vRowAtom;
    }

    public int getCols() {
        return this.col;
    }

    public int getRows() {
        return this.row;
    }

    public void addCol(int i9) {
        if (i9 < 1) {
            i9 = 1;
        } else if (i9 > 4096) {
            i9 = 4096;
        }
        this.array.get(this.row).add(this.root);
        for (int i10 = 1; i10 < i9 - 1; i10++) {
            this.array.get(this.row).add(null);
        }
        this.root = null;
    }
}
