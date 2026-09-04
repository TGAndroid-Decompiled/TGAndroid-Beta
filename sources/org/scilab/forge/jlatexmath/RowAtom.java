package org.scilab.forge.jlatexmath;

import java.util.BitSet;
import java.util.LinkedList;
import java.util.ListIterator;
import org.scilab.forge.jlatexmath.dynamic.DynamicAtom;
public class RowAtom extends Atom implements Row {
    private static BitSet binSet;
    private static BitSet ligKernSet;
    protected LinkedList<Atom> elements;
    public boolean lookAtLastAtom;
    private Dummy previousAtom;

    static {
        BitSet bitSet = new BitSet(16);
        binSet = bitSet;
        bitSet.set(2);
        binSet.set(1);
        binSet.set(3);
        binSet.set(4);
        binSet.set(6);
        BitSet bitSet2 = new BitSet(16);
        ligKernSet = bitSet2;
        bitSet2.set(0);
        ligKernSet.set(1);
        ligKernSet.set(2);
        ligKernSet.set(3);
        ligKernSet.set(4);
        ligKernSet.set(5);
        ligKernSet.set(6);
    }

    public RowAtom() {
        this.elements = new LinkedList<>();
        this.lookAtLastAtom = false;
        this.previousAtom = null;
    }

    private void changeToOrd(Dummy dummy, Dummy dummy2, Atom atom) {
        if (dummy.getLeftType() == 2 && (dummy2 == null || binSet.get(dummy2.getRightType()) || atom == null)) {
            dummy.setType(0);
        } else if (atom != null && dummy.getRightType() == 2) {
            int leftType = atom.getLeftType();
            if (leftType == 3 || leftType == 5 || leftType == 6) {
                dummy.setType(0);
            }
        }
    }

    public final void add(Atom atom) {
        if (atom != null) {
            this.elements.add(atom);
        }
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float f7;
        Dummy dummy;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        HorizontalBox horizontalBox = new HorizontalBox(teXEnvironment.getColor(), teXEnvironment.getBackground());
        teXEnvironment.reset();
        ListIterator<Atom> listIterator = this.elements.listIterator();
        int i10 = 0;
        while (true) {
            Atom atom = null;
            if (listIterator.hasNext()) {
                Atom next = listIterator.next();
                i10++;
                boolean z10 = false;
                while (next instanceof BreakMarkAtom) {
                    if (!z10) {
                        z10 = true;
                    }
                    if (!listIterator.hasNext()) {
                        break;
                    }
                    next = listIterator.next();
                    i10++;
                }
                if (next instanceof DynamicAtom) {
                    DynamicAtom dynamicAtom = (DynamicAtom) next;
                    if (dynamicAtom.getInsertMode()) {
                        next = dynamicAtom.getAtom();
                        if (next instanceof RowAtom) {
                            int i11 = i10 - 1;
                            this.elements.remove(i11);
                            this.elements.addAll(i11, ((RowAtom) next).elements);
                            listIterator = this.elements.listIterator(i11);
                            next = listIterator.next();
                        }
                    }
                }
                Dummy dummy2 = new Dummy(next);
                if (listIterator.hasNext()) {
                    atom = listIterator.next();
                    listIterator.previous();
                }
                changeToOrd(dummy2, this.previousAtom, atom);
                while (listIterator.hasNext() && dummy2.getRightType() == 0 && dummy2.isCharSymbol()) {
                    Atom next2 = listIterator.next();
                    int i12 = i10 + 1;
                    if ((next2 instanceof CharSymbol) && ligKernSet.get(next2.getLeftType())) {
                        dummy2.markAsTextSymbol();
                        CharFont charFont = dummy2.getCharFont(teXFont);
                        CharFont charFont2 = ((CharSymbol) next2).getCharFont(teXFont);
                        CharFont ligature = teXFont.getLigature(charFont, charFont2);
                        if (ligature == null) {
                            f7 = teXFont.getKern(charFont, charFont2, teXEnvironment.getStyle());
                            listIterator.previous();
                            break;
                        }
                        dummy2.changeAtom(new FixedCharAtom(ligature));
                        i10 = i12;
                    } else {
                        listIterator.previous();
                        break;
                    }
                }
                f7 = 0.0f;
                if (listIterator.previousIndex() != 0 && (dummy = this.previousAtom) != null && !dummy.isKern() && !dummy2.isKern()) {
                    horizontalBox.add(Glue.get(this.previousAtom.getRightType(), dummy2.getLeftType(), teXEnvironment));
                }
                dummy2.setPreviousAtom(this.previousAtom);
                Box createBox = dummy2.createBox(teXEnvironment);
                if (dummy2.isCharInMathMode() && (createBox instanceof CharBox)) {
                    ((CharBox) createBox).addItalicCorrectionToWidth();
                }
                if (z10 || ((next instanceof CharAtom) && Character.isDigit(((CharAtom) next).getCharacter()))) {
                    horizontalBox.addBreakPosition(horizontalBox.children.size());
                }
                horizontalBox.add(createBox);
                teXEnvironment.setLastFontId(createBox.getLastFontId());
                if (Math.abs(f7) > 1.0E-7f) {
                    horizontalBox.add(new StrutBox(f7, 0.0f, 0.0f, 0.0f));
                }
                if (!dummy2.isKern()) {
                    this.previousAtom = dummy2;
                }
            } else {
                this.previousAtom = null;
                return horizontalBox;
            }
        }
    }

    public Atom getLastAtom() {
        if (this.elements.size() != 0) {
            return this.elements.removeLast();
        }
        return new SpaceAtom(3, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public int getLeftType() {
        if (this.elements.size() == 0) {
            return 0;
        }
        return this.elements.get(0).getLeftType();
    }

    @Override
    public int getRightType() {
        if (this.elements.size() == 0) {
            return 0;
        }
        LinkedList<Atom> linkedList = this.elements;
        return linkedList.get(linkedList.size() - 1).getRightType();
    }

    @Override
    public void setPreviousAtom(Dummy dummy) {
        this.previousAtom = dummy;
    }

    public RowAtom(Atom atom) {
        LinkedList<Atom> linkedList = new LinkedList<>();
        this.elements = linkedList;
        this.lookAtLastAtom = false;
        this.previousAtom = null;
        if (atom != null) {
            if (atom instanceof RowAtom) {
                linkedList.addAll(((RowAtom) atom).elements);
            } else {
                linkedList.add(atom);
            }
        }
    }
}
