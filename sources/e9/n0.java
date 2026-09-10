package e9;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class n0 extends o1 {
    public int f7404a;
    public Object f7405b;
    public final int f7406c;
    public final Iterator d;
    public final Object e;

    public n0() {
        this.f7404a = 2;
    }

    @Override
    public final boolean hasNext() {
        Object next;
        int i10 = this.f7404a;
        if (i10 != 4) {
            int c10 = m1.j.c(i10);
            if (c10 == 0) {
                return true;
            }
            if (c10 != 2) {
                this.f7404a = 4;
                switch (this.f7406c) {
                    case 0:
                        do {
                            Iterator it = this.d;
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                this.f7404a = 3;
                                next = null;
                                break;
                            }
                        } while (!((d9.f) this.e).apply(next));
                        break;
                    default:
                        do {
                            Iterator it2 = this.d;
                            if (it2.hasNext()) {
                                next = it2.next();
                            } else {
                                this.f7404a = 3;
                                next = null;
                                break;
                            }
                        } while (!((i1) this.e).f7386b.contains(next));
                        break;
                }
                this.f7405b = next;
                if (this.f7404a != 3) {
                    this.f7404a = 1;
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
            this.f7404a = 2;
            Object obj = this.f7405b;
            this.f7405b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public n0(Iterator it, d9.f fVar) {
        this();
        this.f7406c = 0;
        this.d = it;
        this.e = fVar;
    }

    public n0(i1 i1Var) {
        this();
        this.f7406c = 1;
        this.e = i1Var;
        this.d = i1Var.f7385a.iterator();
    }
}
