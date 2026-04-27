package org.scilab.forge.jlatexmath;

import java.util.LinkedList;
import java.util.ListIterator;

public class VRowAtom extends Atom {
    protected LinkedList elements = new LinkedList();
    private SpaceAtom raise = new SpaceAtom(1, 0.0f, 0.0f, 0.0f);
    protected boolean addInterline = false;
    protected boolean vtop = false;
    protected int halign = 5;

    public VRowAtom() {
    }

    public VRowAtom(Atom atom) {
        if (atom != null) {
            if (atom instanceof VRowAtom) {
                this.elements.addAll(((VRowAtom) atom).elements);
            } else {
                this.elements.add(atom);
            }
        }
    }

    public void setAddInterline(boolean z) {
        this.addInterline = z;
    }

    public void setHalign(int i) {
        this.halign = i;
    }

    public void setVtop(boolean z) {
        this.vtop = z;
    }

    public void setRaise(int i, float f) {
        this.raise = new SpaceAtom(i, f, 0.0f, 0.0f);
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
        float depth;
        VerticalBox verticalBox = new VerticalBox();
        if (this.halign != 5) {
            LinkedList linkedList = new LinkedList();
            ListIterator listIterator = this.elements.listIterator();
            float width = Float.NEGATIVE_INFINITY;
            while (listIterator.hasNext()) {
                Box boxCreateBox = ((Atom) listIterator.next()).createBox(teXEnvironment);
                linkedList.add(boxCreateBox);
                if (width < boxCreateBox.getWidth()) {
                    width = boxCreateBox.getWidth();
                }
            }
            StrutBox strutBox = new StrutBox(0.0f, teXEnvironment.getInterline(), 0.0f, 0.0f);
            ListIterator listIterator2 = linkedList.listIterator();
            while (listIterator2.hasNext()) {
                verticalBox.add(new HorizontalBox((Box) listIterator2.next(), width, this.halign));
                if (this.addInterline && listIterator2.hasNext()) {
                    verticalBox.add(strutBox);
                }
            }
        } else {
            StrutBox strutBox2 = new StrutBox(0.0f, teXEnvironment.getInterline(), 0.0f, 0.0f);
            ListIterator listIterator3 = this.elements.listIterator();
            while (listIterator3.hasNext()) {
                verticalBox.add(((Atom) listIterator3.next()).createBox(teXEnvironment));
                if (this.addInterline && listIterator3.hasNext()) {
                    verticalBox.add(strutBox2);
                }
            }
        }
        verticalBox.setShift(-this.raise.createBox(teXEnvironment).getWidth());
        if (this.vtop) {
            depth = verticalBox.getSize() != 0 ? ((Box) verticalBox.children.getFirst()).getHeight() : 0.0f;
            verticalBox.setHeight(depth);
            verticalBox.setDepth((verticalBox.getDepth() + verticalBox.getHeight()) - depth);
        } else {
            depth = verticalBox.getSize() != 0 ? ((Box) verticalBox.children.getLast()).getDepth() : 0.0f;
            verticalBox.setHeight((verticalBox.getDepth() + verticalBox.getHeight()) - depth);
            verticalBox.setDepth(depth);
        }
        return verticalBox;
    }
}
