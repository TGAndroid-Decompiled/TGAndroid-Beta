package ie;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import le.s;
public final class p implements oe.a {
    public final char f8960a;
    public int f8961b = 0;
    public final LinkedList f8962c = new LinkedList();

    public p(char c3) {
        this.f8960a = c3;
    }

    @Override
    public final void a(s sVar, s sVar2, int i10) {
        oe.a aVar;
        LinkedList linkedList = this.f8962c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (oe.a) it.next();
                if (aVar.d() <= i10) {
                    break;
                }
            } else {
                aVar = (oe.a) linkedList.getFirst();
                break;
            }
        }
        aVar.a(sVar, sVar2, i10);
    }

    @Override
    public final char b() {
        return this.f8960a;
    }

    @Override
    public final int c(c cVar, c cVar2) {
        oe.a aVar;
        int i10 = cVar.f8894g;
        LinkedList linkedList = this.f8962c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (oe.a) it.next();
                if (aVar.d() <= i10) {
                    break;
                }
            } else {
                aVar = (oe.a) linkedList.getFirst();
                break;
            }
        }
        return aVar.c(cVar, cVar2);
    }

    @Override
    public final int d() {
        return this.f8961b;
    }

    @Override
    public final char e() {
        return this.f8960a;
    }

    public final void f(oe.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.f8962c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d10 = ((oe.a) listIterator.next()).d();
            if (d > d10) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (d == d10) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f8960a + "' and minimum length " + d);
            }
        }
        linkedList.add(aVar);
        this.f8961b = d;
    }
}
