package h9;

import a8.la;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class v0 extends h2 {
    public int f14078a;
    public Object f14079b;
    public final int f14080c;
    public final Iterator d;
    public final Object f14081e;

    public v0() {
        this.f14078a = 2;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        Object next;
        if (this.f14078a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        int c10 = p1.g.c(this.f14078a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f14078a = 4;
            switch (this.f14080c) {
                case 0:
                    do {
                        Iterator it = this.d;
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            this.f14078a = 3;
                            next = null;
                            break;
                        }
                    } while (!((g9.l) this.f14081e).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.d;
                        if (it2.hasNext()) {
                            next = it2.next();
                        } else {
                            this.f14078a = 3;
                            next = null;
                            break;
                        }
                    } while (!((c2) this.f14081e).f13985b.contains(next));
                    break;
            }
            this.f14079b = next;
            if (this.f14078a != 3) {
                this.f14078a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f14078a = 2;
            Object obj = this.f14079b;
            this.f14079b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public v0(Iterator it, g9.l lVar) {
        this();
        this.f14080c = 0;
        this.d = it;
        this.f14081e = lVar;
    }

    public v0(c2 c2Var) {
        this();
        this.f14080c = 1;
        this.f14081e = c2Var;
        this.d = c2Var.f13984a.iterator();
    }
}
