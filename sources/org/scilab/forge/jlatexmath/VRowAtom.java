package org.scilab.forge.jlatexmath;

import java.util.LinkedList;
import java.util.ListIterator;
public class VRowAtom extends Atom {
    protected LinkedList<Atom> elements = new LinkedList<>();
    private SpaceAtom raise = new SpaceAtom(1, 0.0f, 0.0f, 0.0f);
    protected boolean addInterline = false;
    protected boolean vtop = false;
    protected int halign = 5;

    public VRowAtom(Atom atom) {
        if (atom != null) {
            boolean z = atom instanceof VRowAtom;
            LinkedList<Atom> linkedList = this.elements;
            if (z) {
                linkedList.addAll(((VRowAtom) atom).elements);
            } else {
                linkedList.add(atom);
            }
        }
    }

    public final void add(Atom atom) {
        if (atom != null) {
            this.elements.add(0, atom);
        }
    }

    public final void append(Atom atom) {
        if (atom != null) {
            this.elements.add(atom);
        }
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        VerticalBox verticalBox = new VerticalBox();
        float f = 0.0f;
        if (this.halign != 5) {
            LinkedList linkedList = new LinkedList();
            ListIterator<Atom> listIterator = this.elements.listIterator();
            float f2 = Float.NEGATIVE_INFINITY;
            while (listIterator.hasNext()) {
                Box createBox = listIterator.next().createBox(teXEnvironment);
                linkedList.add(createBox);
                if (f2 < createBox.getWidth()) {
                    f2 = createBox.getWidth();
                }
            }
            StrutBox strutBox = new StrutBox(0.0f, teXEnvironment.getInterline(), 0.0f, 0.0f);
            ListIterator listIterator2 = linkedList.listIterator();
            while (listIterator2.hasNext()) {
                verticalBox.add(new HorizontalBox((Box) listIterator2.next(), f2, this.halign));
                if (this.addInterline && listIterator2.hasNext()) {
                    verticalBox.add(strutBox);
                }
            }
        } else {
            StrutBox strutBox2 = new StrutBox(0.0f, teXEnvironment.getInterline(), 0.0f, 0.0f);
            ListIterator<Atom> listIterator3 = this.elements.listIterator();
            while (listIterator3.hasNext()) {
                verticalBox.add(listIterator3.next().createBox(teXEnvironment));
                if (this.addInterline && listIterator3.hasNext()) {
                    verticalBox.add(strutBox2);
                }
            }
        }
        verticalBox.setShift(-this.raise.createBox(teXEnvironment).getWidth());
        if (this.vtop) {
            if (verticalBox.getSize() != 0) {
                f = verticalBox.children.getFirst().getHeight();
            }
            verticalBox.setHeight(f);
            verticalBox.setDepth((verticalBox.getHeight() + verticalBox.getDepth()) - f);
            return verticalBox;
        }
        if (verticalBox.getSize() != 0) {
            f = verticalBox.children.getLast().getDepth();
        }
        verticalBox.setHeight((verticalBox.getHeight() + verticalBox.getDepth()) - f);
        verticalBox.setDepth(f);
        return verticalBox;
    }

    public boolean getAddInterline() {
        return this.addInterline;
    }

    public int getHalign() {
        return this.halign;
    }

    public Atom getLastAtom() {
        return this.elements.removeLast();
    }

    public boolean getVtop() {
        return this.vtop;
    }

    public void setAddInterline(boolean z) {
        this.addInterline = z;
    }

    public void setHalign(int i) {
        this.halign = i;
    }

    public void setRaise(int i, float f) {
        this.raise = new SpaceAtom(i, f, 0.0f, 0.0f);
    }

    public void setVtop(boolean z) {
        this.vtop = z;
    }

    public VRowAtom() {
    }
}
