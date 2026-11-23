package h9;

import a8.ma;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class v0 extends g2 {
    public int f14067a;
    public Object f14068b;
    public final int f14069c;
    public final Iterator d;
    public final Object f14070e;

    public v0() {
        this.f14067a = 2;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        Object next;
        if (this.f14067a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        int c10 = p1.g.c(this.f14067a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f14067a = 4;
            switch (this.f14069c) {
                case 0:
                    do {
                        Iterator it = this.d;
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            this.f14067a = 3;
                            next = null;
                            break;
                        }
                    } while (!((g9.l) this.f14070e).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.d;
                        if (it2.hasNext()) {
                            next = it2.next();
                        } else {
                            this.f14067a = 3;
                            next = null;
                            break;
                        }
                    } while (!((b2) this.f14070e).f13970b.contains(next));
                    break;
            }
            this.f14068b = next;
            if (this.f14067a != 3) {
                this.f14067a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f14067a = 2;
            Object obj = this.f14068b;
            this.f14068b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public v0(Iterator it, g9.l lVar) {
        this();
        this.f14069c = 0;
        this.d = it;
        this.f14070e = lVar;
    }

    public v0(b2 b2Var) {
        this();
        this.f14069c = 1;
        this.f14070e = b2Var;
        this.d = b2Var.f13969a.iterator();
    }
}
