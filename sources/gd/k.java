package gd;

import df.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public final class k implements gf.a {
    public final char f11027a;
    public int f11028b = 0;
    public final LinkedList f11029c = new LinkedList();

    public k(char c10) {
        this.f11027a = c10;
    }

    @Override
    public final char a() {
        return this.f11027a;
    }

    @Override
    public final void b(s sVar, s sVar2, int i10) {
        gf.a aVar;
        LinkedList linkedList = this.f11029c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (gf.a) it.next();
                if (aVar.c() <= i10) {
                    break;
                }
            } else {
                aVar = (gf.a) linkedList.getFirst();
                break;
            }
        }
        aVar.b(sVar, sVar2, i10);
    }

    @Override
    public final int c() {
        return this.f11028b;
    }

    @Override
    public final int d(af.f fVar, af.f fVar2) {
        gf.a aVar;
        int i10 = fVar.f566g;
        LinkedList linkedList = this.f11029c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (gf.a) it.next();
                if (aVar.c() <= i10) {
                    break;
                }
            } else {
                aVar = (gf.a) linkedList.getFirst();
                break;
            }
        }
        return aVar.d(fVar, fVar2);
    }

    @Override
    public final char e() {
        return this.f11027a;
    }

    public final void f(gf.a aVar) {
        int c10 = aVar.c();
        LinkedList linkedList = this.f11029c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int c11 = ((gf.a) listIterator.next()).c();
            if (c10 > c11) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (c10 == c11) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f11027a + "' and minimum length " + c10);
            }
        }
        linkedList.add(aVar);
        this.f11028b = c10;
    }
}
