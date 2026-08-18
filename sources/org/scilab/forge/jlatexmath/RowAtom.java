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

    protected RowAtom() {
        this.elements = new LinkedList<>();
        this.lookAtLastAtom = false;
        this.previousAtom = null;
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

    public Atom getLastAtom() {
        if (this.elements.size() != 0) {
            return this.elements.removeLast();
        }
        return new SpaceAtom(3, 0.0f, 0.0f, 0.0f);
    }

    public final void add(Atom atom) {
        if (atom != null) {
            this.elements.add(atom);
        }
    }

    private void changeToOrd(Dummy dummy, Dummy dummy2, Atom atom) {
        if (dummy.getLeftType() == 2 && (dummy2 == null || binSet.get(dummy2.getRightType()) || atom == null)) {
            dummy.setType(0);
            return;
        }
        if (atom == null || dummy.getRightType() != 2) {
            return;
        }
        int leftType = atom.getLeftType();
        if (leftType == 3 || leftType == 5 || leftType == 6) {
            dummy.setType(0);
        }
    }

    @Override
    public Box createBox(TeXEnvironment teXEnvironment) {
        float kern;
        Dummy dummy;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        HorizontalBox horizontalBox = new HorizontalBox(teXEnvironment.getColor(), teXEnvironment.getBackground());
        teXEnvironment.reset();
        ListIterator<Atom> listIterator = this.elements.listIterator();
        int i = 0;
        while (true) {
            Atom next = null;
            if (listIterator.hasNext()) {
                Atom next2 = listIterator.next();
                i++;
                boolean z = false;
                while (next2 instanceof BreakMarkAtom) {
                    if (!z) {
                        z = true;
                    }
                    if (!listIterator.hasNext()) {
                        break;
                    }
                    next2 = listIterator.next();
                    i++;
                }
                if (next2 instanceof DynamicAtom) {
                    DynamicAtom dynamicAtom = (DynamicAtom) next2;
                    if (dynamicAtom.getInsertMode()) {
                        next2 = dynamicAtom.getAtom();
                        if (next2 instanceof RowAtom) {
                            int i2 = i - 1;
                            this.elements.remove(i2);
                            this.elements.addAll(i2, ((RowAtom) next2).elements);
                            listIterator = this.elements.listIterator(i2);
                            next2 = listIterator.next();
                        }
                    }
                }
                Dummy dummy2 = new Dummy(next2);
                if (listIterator.hasNext()) {
                    next = listIterator.next();
                    listIterator.previous();
                }
                changeToOrd(dummy2, this.previousAtom, next);
                while (true) {
                    if (listIterator.hasNext() && dummy2.getRightType() == 0 && dummy2.isCharSymbol()) {
                        Atom next3 = listIterator.next();
                        int i3 = i + 1;
                        if ((next3 instanceof CharSymbol) && ligKernSet.get(next3.getLeftType())) {
                            dummy2.markAsTextSymbol();
                            CharFont charFont = dummy2.getCharFont(teXFont);
                            CharFont charFont2 = ((CharSymbol) next3).getCharFont(teXFont);
                            CharFont ligature = teXFont.getLigature(charFont, charFont2);
                            if (ligature == null) {
                                kern = teXFont.getKern(charFont, charFont2, teXEnvironment.getStyle());
                                listIterator.previous();
                                break;
                            }
                            dummy2.changeAtom(new FixedCharAtom(ligature));
                            i = i3;
                        } else {
                            listIterator.previous();
                        }
                    }
                    kern = 0.0f;
                    break;
                }
                if (listIterator.previousIndex() != 0 && (dummy = this.previousAtom) != null && !dummy.isKern() && !dummy2.isKern()) {
                    horizontalBox.add(Glue.get(this.previousAtom.getRightType(), dummy2.getLeftType(), teXEnvironment));
                }
                dummy2.setPreviousAtom(this.previousAtom);
                Box boxCreateBox = dummy2.createBox(teXEnvironment);
                if (dummy2.isCharInMathMode() && (boxCreateBox instanceof CharBox)) {
                    ((CharBox) boxCreateBox).addItalicCorrectionToWidth();
                }
                if (z || ((next2 instanceof CharAtom) && Character.isDigit(((CharAtom) next2).getCharacter()))) {
                    horizontalBox.addBreakPosition(horizontalBox.children.size());
                }
                horizontalBox.add(boxCreateBox);
                teXEnvironment.setLastFontId(boxCreateBox.getLastFontId());
                if (Math.abs(kern) > 1.0E-7f) {
                    horizontalBox.add(new StrutBox(kern, 0.0f, 0.0f, 0.0f));
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

    @Override
    public void setPreviousAtom(Dummy dummy) {
        this.previousAtom = dummy;
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
}
