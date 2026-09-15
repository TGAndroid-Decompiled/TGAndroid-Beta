package e9;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class n0 extends o1 {
    public int f8099a;
    public Object f8100b;
    public final int f8101c;
    public final Iterator d;
    public final Object e;

    public n0() {
        this.f8099a = 2;
    }

    @Override
    public final boolean hasNext() {
        Object next;
        int i10 = this.f8099a;
        if (i10 != 4) {
            int c10 = m1.j.c(i10);
            if (c10 == 0) {
                return true;
            }
            if (c10 != 2) {
                this.f8099a = 4;
                switch (this.f8101c) {
                    case 0:
                        do {
                            Iterator it = this.d;
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                this.f8099a = 3;
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
                                this.f8099a = 3;
                                next = null;
                                break;
                            }
                        } while (!((i1) this.e).f8081b.contains(next));
                        break;
                }
                this.f8100b = next;
                if (this.f8099a != 3) {
                    this.f8099a = 1;
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
            this.f8099a = 2;
            Object obj = this.f8100b;
            this.f8100b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public n0(Iterator it, d9.f fVar) {
        this();
        this.f8101c = 0;
        this.d = it;
        this.e = fVar;
    }

    public n0(i1 i1Var) {
        this();
        this.f8101c = 1;
        this.e = i1Var;
        this.d = i1Var.f8080a.iterator();
    }
}
