package ge;

import java.util.LinkedList;
import java.util.ListIterator;
import je.s;

public final class p implements me.a {

    public final char f6923a;

    public int f6924b = 0;

    public final LinkedList f6925c = new LinkedList();

    public p(char c10) {
        this.f6923a = c10;
    }

    @Override
    public final char a() {
        return this.f6923a;
    }

    @Override
    public final void b(s sVar, s sVar2, int i10) {
        LinkedList<me.a> linkedList = this.f6925c;
        for (me.a aVar : linkedList) {
            if (aVar.d() <= i10) {
                aVar.b(sVar, sVar2, i10);
            }
        }
        aVar = (me.a) linkedList.getFirst();
        aVar.b(sVar, sVar2, i10);
    }

    @Override
    public final int c(c cVar, c cVar2) {
        int i10 = cVar.f6857g;
        LinkedList<me.a> linkedList = this.f6925c;
        for (me.a aVar : linkedList) {
            if (aVar.d() <= i10) {
                return aVar.c(cVar, cVar2);
            }
        }
        aVar = (me.a) linkedList.getFirst();
        return aVar.c(cVar, cVar2);
    }

    @Override
    public final int d() {
        return this.f6924b;
    }

    @Override
    public final char e() {
        return this.f6923a;
    }

    public final void f(me.a aVar) {
        int iD = aVar.d();
        LinkedList linkedList = this.f6925c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int iD2 = ((me.a) listIterator.next()).d();
            if (iD > iD2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iD == iD2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f6923a + "' and minimum length " + iD);
            }
        }
        linkedList.add(aVar);
        this.f6924b = iD;
    }
}
