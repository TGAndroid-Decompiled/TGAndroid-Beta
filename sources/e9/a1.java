package e9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.t6;
public final class a1 extends m2 {
    public int f6324a;
    public Object f6325b;
    public final int f6326c;
    public final Iterator d;
    public final Object e;

    public a1() {
        this.f6324a = 2;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        Object next;
        if (this.f6324a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        int c10 = m1.j.c(this.f6324a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f6324a = 4;
            switch (this.f6326c) {
                case 0:
                    do {
                        Iterator it = this.d;
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            this.f6324a = 3;
                            next = null;
                            break;
                        }
                    } while (!((d9.l) this.e).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.d;
                        if (it2.hasNext()) {
                            next = it2.next();
                        } else {
                            this.f6324a = 3;
                            next = null;
                            break;
                        }
                    } while (!((g2) this.e).f6367b.contains(next));
                    break;
            }
            this.f6325b = next;
            if (this.f6324a != 3) {
                this.f6324a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f6324a = 2;
            Object obj = this.f6325b;
            this.f6325b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public a1(Iterator it, d9.l lVar) {
        this();
        this.f6326c = 0;
        this.d = it;
        this.e = lVar;
    }

    public a1(g2 g2Var) {
        this();
        this.f6326c = 1;
        this.e = g2Var;
        this.d = g2Var.f6366a.iterator();
    }
}
