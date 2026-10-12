package af;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public final class s implements gf.a {
    public final char f624a;
    public int f625b = 0;
    public final LinkedList f626c = new LinkedList();

    public s(char c10) {
        this.f624a = c10;
    }

    @Override
    public final char a() {
        return this.f624a;
    }

    @Override
    public final void b(df.s sVar, df.s sVar2, int i10) {
        gf.a aVar;
        LinkedList linkedList = this.f626c;
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
        return this.f625b;
    }

    @Override
    public final int d(f fVar, f fVar2) {
        gf.a aVar;
        int i10 = fVar.f562g;
        LinkedList linkedList = this.f626c;
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
        return this.f624a;
    }

    public final void f(gf.a aVar) {
        int c10 = aVar.c();
        LinkedList linkedList = this.f626c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int c11 = ((gf.a) listIterator.next()).c();
            if (c10 > c11) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (c10 == c11) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f624a + "' and minimum length " + c10);
            }
        }
        linkedList.add(aVar);
        this.f625b = c10;
    }
}
