package gf;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import kf.s;
public final class r implements nf.a {
    public final char f13952a;
    public int f13953b = 0;
    public final LinkedList f13954c = new LinkedList();

    public r(char c10) {
        this.f13952a = c10;
    }

    @Override
    public final void a(s sVar, s sVar2, int i7) {
        nf.a aVar;
        LinkedList linkedList = this.f13954c;
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
        return this.f13952a;
    }

    @Override
    public final int c(e eVar, e eVar2) {
        nf.a aVar;
        int i7 = eVar.f13887g;
        LinkedList linkedList = this.f13954c;
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
        return this.f13953b;
    }

    @Override
    public final char e() {
        return this.f13952a;
    }

    public final void f(nf.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.f13954c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d2 = ((nf.a) listIterator.next()).d();
            if (d > d2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (d == d2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f13952a + "' and minimum length " + d);
            }
        }
        linkedList.add(aVar);
        this.f13953b = d;
    }
}
