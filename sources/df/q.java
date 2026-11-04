package df;

import gf.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public final class q implements kf.a {
    public final char f8920a;
    public int f8921b = 0;
    public final LinkedList f8922c = new LinkedList();

    public q(char c2) {
        this.f8920a = c2;
    }

    @Override
    public final int a(e eVar, e eVar2) {
        kf.a aVar;
        int i3 = eVar.f8857g;
        LinkedList linkedList = this.f8922c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (kf.a) it.next();
                if (aVar.d() <= i3) {
                    break;
                }
            } else {
                aVar = (kf.a) linkedList.getFirst();
                break;
            }
        }
        return aVar.a(eVar, eVar2);
    }

    @Override
    public final char b() {
        return this.f8920a;
    }

    @Override
    public final void c(s sVar, s sVar2, int i3) {
        kf.a aVar;
        LinkedList linkedList = this.f8922c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (kf.a) it.next();
                if (aVar.d() <= i3) {
                    break;
                }
            } else {
                aVar = (kf.a) linkedList.getFirst();
                break;
            }
        }
        aVar.c(sVar, sVar2, i3);
    }

    @Override
    public final int d() {
        return this.f8921b;
    }

    @Override
    public final char e() {
        return this.f8920a;
    }

    public final void f(kf.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.f8922c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d10 = ((kf.a) listIterator.next()).d();
            if (d > d10) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (d == d10) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f8920a + "' and minimum length " + d);
            }
        }
        linkedList.add(aVar);
        this.f8921b = d;
    }
}
