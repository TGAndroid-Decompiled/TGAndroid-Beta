package ed;

import bf.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public final class k implements ef.a {
    public final char f8168a;
    public int f8169b = 0;
    public final LinkedList f8170c = new LinkedList();

    public k(char c10) {
        this.f8168a = c10;
    }

    @Override
    public final char a() {
        return this.f8168a;
    }

    @Override
    public final int b(ye.b bVar, ye.b bVar2) {
        ef.a aVar;
        int i10 = bVar.f46737g;
        LinkedList linkedList = this.f8170c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (ef.a) it.next();
                if (aVar.c() <= i10) {
                    break;
                }
            } else {
                aVar = (ef.a) linkedList.getFirst();
                break;
            }
        }
        return aVar.b(bVar, bVar2);
    }

    @Override
    public final int c() {
        return this.f8169b;
    }

    @Override
    public final void d(s sVar, s sVar2, int i10) {
        ef.a aVar;
        LinkedList linkedList = this.f8170c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (ef.a) it.next();
                if (aVar.c() <= i10) {
                    break;
                }
            } else {
                aVar = (ef.a) linkedList.getFirst();
                break;
            }
        }
        aVar.d(sVar, sVar2, i10);
    }

    @Override
    public final char e() {
        return this.f8168a;
    }

    public final void f(ef.a aVar) {
        int c10 = aVar.c();
        LinkedList linkedList = this.f8170c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int c11 = ((ef.a) listIterator.next()).c();
            if (c10 > c11) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (c10 == c11) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f8168a + "' and minimum length " + c10);
            }
        }
        linkedList.add(aVar);
        this.f8169b = c10;
    }
}
