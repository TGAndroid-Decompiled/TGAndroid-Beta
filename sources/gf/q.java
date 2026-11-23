package gf;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import kf.s;
public final class q implements nf.a {
    public final char f13636a;
    public int f13637b = 0;
    public final LinkedList f13638c = new LinkedList();

    public q(char c10) {
        this.f13636a = c10;
    }

    @Override
    public final void a(s sVar, s sVar2, int i7) {
        nf.a aVar;
        LinkedList linkedList = this.f13638c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (nf.a) it.next();
                if (aVar.d() <= i7) {
                    break;
                }
            } else {
                aVar = (nf.a) linkedList.getFirst();
                break;
            }
        }
        aVar.a(sVar, sVar2, i7);
    }

    @Override
    public final char b() {
        return this.f13636a;
    }

    @Override
    public final int c(e eVar, e eVar2) {
        nf.a aVar;
        int i7 = eVar.f13573g;
        LinkedList linkedList = this.f13638c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (nf.a) it.next();
                if (aVar.d() <= i7) {
                    break;
                }
            } else {
                aVar = (nf.a) linkedList.getFirst();
                break;
            }
        }
        return aVar.c(eVar, eVar2);
    }

    @Override
    public final int d() {
        return this.f13637b;
    }

    @Override
    public final char e() {
        return this.f13636a;
    }

    public final void f(nf.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.f13638c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d2 = ((nf.a) listIterator.next()).d();
            if (d > d2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (d == d2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f13636a + "' and minimum length " + d);
            }
        }
        linkedList.add(aVar);
        this.f13637b = d;
    }
}
