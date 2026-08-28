package fe;

import ie.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public final class p implements le.a {
    public final char f6123a;
    public int f6124b = 0;
    public final LinkedList f6125c = new LinkedList();

    public p(char c10) {
        this.f6123a = c10;
    }

    @Override
    public final int a(c cVar, c cVar2) {
        le.a aVar;
        int i9 = cVar.f6057g;
        LinkedList linkedList = this.f6125c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (le.a) it.next();
                if (aVar.d() <= i9) {
                    break;
                }
            } else {
                aVar = (le.a) linkedList.getFirst();
                break;
            }
        }
        return aVar.a(cVar, cVar2);
    }

    @Override
    public final void b(s sVar, s sVar2, int i9) {
        le.a aVar;
        LinkedList linkedList = this.f6125c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (le.a) it.next();
                if (aVar.d() <= i9) {
                    break;
                }
            } else {
                aVar = (le.a) linkedList.getFirst();
                break;
            }
        }
        aVar.b(sVar, sVar2, i9);
    }

    @Override
    public final char c() {
        return this.f6123a;
    }

    @Override
    public final int d() {
        return this.f6124b;
    }

    @Override
    public final char e() {
        return this.f6123a;
    }

    public final void f(le.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.f6125c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d9 = ((le.a) listIterator.next()).d();
            if (d > d9) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (d == d9) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f6123a + "' and minimum length " + d);
            }
        }
        linkedList.add(aVar);
        this.f6124b = d;
    }
}
