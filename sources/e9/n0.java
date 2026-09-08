package e9;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class n0 extends o1 {
    public int f9007a;
    public Object f9008b;
    public final int f9009c;
    public final Iterator d;
    public final Object f9010e;

    public n0() {
        this.f9007a = 2;
    }

    @Override
    public final boolean hasNext() {
        Object next;
        int i10 = this.f9007a;
        if (i10 != 4) {
            int c10 = m1.j.c(i10);
            if (c10 == 0) {
                return true;
            }
            if (c10 != 2) {
                this.f9007a = 4;
                switch (this.f9009c) {
                    case 0:
                        do {
                            Iterator it = this.d;
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                this.f9007a = 3;
                                next = null;
                                break;
                            }
                        } while (!((d9.g) this.f9010e).apply(next));
                        break;
                    default:
                        do {
                            Iterator it2 = this.d;
                            if (it2.hasNext()) {
                                next = it2.next();
                            } else {
                                this.f9007a = 3;
                                next = null;
                                break;
                            }
                        } while (!((i1) this.f9010e).f8987b.contains(next));
                        break;
                }
                this.f9008b = next;
                if (this.f9007a != 3) {
                    this.f9007a = 1;
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f9007a = 2;
            Object obj = this.f9008b;
            this.f9008b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public n0(Iterator it, d9.g gVar) {
        this();
        this.f9009c = 0;
        this.d = it;
        this.f9010e = gVar;
    }

    public n0(i1 i1Var) {
        this();
        this.f9009c = 1;
        this.f9010e = i1Var;
        this.d = i1Var.f8986a.iterator();
    }
}
