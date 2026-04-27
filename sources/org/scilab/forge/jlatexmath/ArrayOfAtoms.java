package org.scilab.forge.jlatexmath;

import java.util.Iterator;
import java.util.LinkedList;

public class ArrayOfAtoms extends TeXFormula {
    public LinkedList array;
    public int col;
    public int row;

    public ArrayOfAtoms() {
        LinkedList linkedList = new LinkedList();
        this.array = linkedList;
        linkedList.add(new LinkedList());
        this.row = 0;
    }

    public void addCol() {
        ((LinkedList) this.array.get(this.row)).add(this.root);
        this.root = null;
    }

    public void addCol(int i) {
        ((LinkedList) this.array.get(this.row)).add(this.root);
        for (int i2 = 1; i2 < i - 1; i2++) {
            ((LinkedList) this.array.get(this.row)).add(null);
        }
        this.root = null;
    }

    public void addRow() {
        addCol();
        this.array.add(new LinkedList());
        this.row++;
    }

    public VRowAtom getAsVRow() {
        VRowAtom vRowAtom = new VRowAtom();
        vRowAtom.setAddInterline(true);
        Iterator it = this.array.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((LinkedList) it.next()).iterator();
            while (it2.hasNext()) {
                vRowAtom.append((Atom) it2.next());
            }
        }
        return vRowAtom;
    }

    public void checkDimensions() {
        if (((LinkedList) this.array.getLast()).size() != 0 || this.root != null) {
            addRow();
        }
        this.row = this.array.size() - 1;
        this.col = ((LinkedList) this.array.get(0)).size();
        for (int i = 1; i < this.row; i++) {
            if (((LinkedList) this.array.get(i)).size() > this.col) {
                this.col = ((LinkedList) this.array.get(i)).size();
            }
        }
        for (int i2 = 0; i2 < this.row; i2++) {
            int size = ((LinkedList) this.array.get(i2)).size();
            if (size != this.col && ((LinkedList) this.array.get(i2)).get(0) != null && ((Atom) ((LinkedList) this.array.get(i2)).get(0)).type != 11) {
                LinkedList linkedList = (LinkedList) this.array.get(i2);
                while (size < this.col) {
                    linkedList.add(null);
                    size++;
                }
            }
        }
    }
}
