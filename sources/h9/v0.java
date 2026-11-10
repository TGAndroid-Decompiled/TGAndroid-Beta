package h9;

import a8.ia;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class v0 extends h2 {
    public int f14403a;
    public Object f14404b;
    public final int f14405c;
    public final Iterator d;
    public final Object f14406e;

    public v0() {
        this.f14403a = 2;
    }

    @Override
    public final boolean hasNext() {
        boolean z9;
        Object next;
        if (this.f14403a != 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        int c10 = p1.g.c(this.f14403a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f14403a = 4;
            switch (this.f14405c) {
                case 0:
                    do {
                        Iterator it = this.d;
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            this.f14403a = 3;
                            next = null;
                            break;
                        }
                    } while (!((g9.m) this.f14406e).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.d;
                        if (it2.hasNext()) {
                            next = it2.next();
                        } else {
                            this.f14403a = 3;
                            next = null;
                            break;
                        }
                    } while (!((c2) this.f14406e).f14310b.contains(next));
                    break;
            }
            this.f14404b = next;
            if (this.f14403a != 3) {
                this.f14403a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f14403a = 2;
            Object obj = this.f14404b;
            this.f14404b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public v0(Iterator it, g9.m mVar) {
        this();
        this.f14405c = 0;
        this.d = it;
        this.f14406e = mVar;
    }

    public v0(c2 c2Var) {
        this();
        this.f14405c = 1;
        this.f14406e = c2Var;
        this.d = c2Var.f14309a.iterator();
    }
}
