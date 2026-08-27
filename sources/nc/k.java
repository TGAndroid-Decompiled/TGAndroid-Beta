package nc;

import java.util.LinkedList;
import java.util.ListIterator;
import je.s;

public final class k implements me.a {

    public final char f18471a;

    public int f18472b = 0;

    public final LinkedList f18473c = new LinkedList();

    public k(char c10) {
        this.f18471a = c10;
    }

    @Override
    public final char a() {
        return this.f18471a;
    }

    @Override
    public final void b(s sVar, s sVar2, int i10) {
        LinkedList<me.a> linkedList = this.f18473c;
        for (me.a aVar : linkedList) {
            if (aVar.d() <= i10) {
                aVar.b(sVar, sVar2, i10);
            }
        }
        aVar = (me.a) linkedList.getFirst();
        aVar.b(sVar, sVar2, i10);
    }

    @Override
    public final int c(ge.c cVar, ge.c cVar2) {
        int i10 = cVar.f6857g;
        LinkedList<me.a> linkedList = this.f18473c;
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
        return this.f18472b;
    }

    @Override
    public final char e() {
        return this.f18471a;
    }

    public final void f(me.a aVar) {
        int iD = aVar.d();
        LinkedList linkedList = this.f18473c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int iD2 = ((me.a) listIterator.next()).d();
            if (iD > iD2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iD == iD2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f18471a + "' and minimum length " + iD);
            }
        }
        linkedList.add(aVar);
        this.f18472b = iD;
    }
}
