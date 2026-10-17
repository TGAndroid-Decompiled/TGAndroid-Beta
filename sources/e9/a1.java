package e9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.u6;
public final class a1 extends m2 {
    public int f8410a;
    public Object f8411b;
    public final int f8412c;
    public final Iterator d;
    public final Object e;

    public a1() {
        this.f8410a = 2;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        Object next;
        if (this.f8410a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        int c10 = m1.j.c(this.f8410a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f8410a = 4;
            switch (this.f8412c) {
                case 0:
                    do {
                        Iterator it = this.d;
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            this.f8410a = 3;
                            next = null;
                            break;
                        }
                    } while (!((d9.m) this.e).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.d;
                        if (it2.hasNext()) {
                            next = it2.next();
                        } else {
                            this.f8410a = 3;
                            next = null;
                            break;
                        }
                    } while (!((g2) this.e).f8453b.contains(next));
                    break;
            }
            this.f8411b = next;
            if (this.f8410a != 3) {
                this.f8410a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f8410a = 2;
            Object obj = this.f8411b;
            this.f8411b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public a1(Iterator it, d9.m mVar) {
        this();
        this.f8412c = 0;
        this.d = it;
        this.e = mVar;
    }

    public a1(g2 g2Var) {
        this();
        this.f8412c = 1;
        this.e = g2Var;
        this.d = g2Var.f8452a.iterator();
    }
}
