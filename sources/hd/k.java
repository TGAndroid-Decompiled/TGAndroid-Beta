package hd;

import ef.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public final class k implements hf.a {
    public final char f12786a;
    public int f12787b = 0;
    public final LinkedList f12788c = new LinkedList();

    public k(char c10) {
        this.f12786a = c10;
    }

    @Override
    public final int a(bf.e eVar, bf.e eVar2) {
        hf.a aVar;
        int i10 = eVar.f3916g;
        LinkedList linkedList = this.f12788c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (hf.a) it.next();
                if (aVar.c() <= i10) {
                    break;
                }
            } else {
                aVar = (hf.a) linkedList.getFirst();
                break;
            }
        }
        return aVar.a(eVar, eVar2);
    }

    @Override
    public final char b() {
        return this.f12786a;
    }

    @Override
    public final int c() {
        return this.f12787b;
    }

    @Override
    public final void d(s sVar, s sVar2, int i10) {
        hf.a aVar;
        LinkedList linkedList = this.f12788c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (hf.a) it.next();
                if (aVar.c() <= i10) {
                    break;
                }
            } else {
                aVar = (hf.a) linkedList.getFirst();
                break;
            }
        }
        aVar.d(sVar, sVar2, i10);
    }

    @Override
    public final char e() {
        return this.f12786a;
    }

    public final void f(hf.a aVar) {
        int c10 = aVar.c();
        LinkedList linkedList = this.f12788c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int c11 = ((hf.a) listIterator.next()).c();
            if (c10 > c11) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (c10 == c11) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f12786a + "' and minimum length " + c10);
            }
        }
        linkedList.add(aVar);
        this.f12787b = c10;
    }
}
