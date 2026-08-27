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
        if (this.array.getLast().size() != 0 || this.root != null) {
            addRow();
        }
        this.row = this.array.size() - 1;
        this.col = this.array.get(0).size();
        for (int i10 = 1; i10 < this.row; i10++) {
            if (this.array.get(i10).size() > this.col) {
                this.col = this.array.get(i10).size();
            }
        }
        for (int i11 = 0; i11 < this.row; i11++) {
            int size = this.array.get(i11).size();
            if (size != this.col && this.array.get(i11).get(0) != null && this.array.get(i11).get(0).type != 11) {
                LinkedList<Atom> linkedList = this.array.get(i11);
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

    public void addCol(int i10) {
        if (i10 < 1) {
            i10 = 1;
        } else if (i10 > 4096) {
            i10 = 4096;
        }
        this.array.get(this.row).add(this.root);
        for (int i11 = 1; i11 < i10 - 1; i11++) {
            this.array.get(this.row).add(null);
        }
        this.root = null;
    }
}
