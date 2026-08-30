package ke;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import ne.s;
public final class p implements qe.a {
    public final char f10404a;
    public int f10405b = 0;
    public final LinkedList f10406c = new LinkedList();

    public p(char c3) {
        this.f10404a = c3;
    }

    @Override
    public final void a(s sVar, s sVar2, int i10) {
        qe.a aVar;
        LinkedList linkedList = this.f10406c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (qe.a) it.next();
                if (aVar.d() <= i10) {
                    break;
                }
            } else {
                aVar = (qe.a) linkedList.getFirst();
                break;
            }
        }
        aVar.a(sVar, sVar2, i10);
    }

    @Override
    public final char b() {
        return this.f10404a;
    }

    @Override
    public final int c(c cVar, c cVar2) {
        qe.a aVar;
        int i10 = cVar.f10342g;
        LinkedList linkedList = this.f10406c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (qe.a) it.next();
                if (aVar.d() <= i10) {
                    break;
                }
            } else {
                aVar = (qe.a) linkedList.getFirst();
                break;
            }
        }
        return aVar.c(cVar, cVar2);
    }

    @Override
    public final int d() {
        return this.f10405b;
    }

    @Override
    public final char e() {
        return this.f10404a;
    }

    public final void f(qe.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.f10406c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d10 = ((qe.a) listIterator.next()).d();
            if (d > d10) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (d == d10) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f10404a + "' and minimum length " + d);
            }
        }
        linkedList.add(aVar);
        this.f10405b = d;
    }
}
