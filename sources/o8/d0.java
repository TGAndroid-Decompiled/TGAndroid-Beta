package o8;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class d0 extends x0 {
    public int f19036a;
    public Object f19037b;
    public final int f19038c;
    public final Iterator d;
    public final Object f19039e;

    public d0() {
        this.f19036a = 2;
    }

    @Override
    public final boolean hasNext() {
        Object next;
        int i9 = this.f19036a;
        if (i9 != 4) {
            int b10 = m1.j.b(i9);
            if (b10 == 0) {
                return true;
            }
            if (b10 != 2) {
                this.f19036a = 4;
                switch (this.f19038c) {
                    case 0:
                        do {
                            Iterator it = this.d;
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                this.f19036a = 3;
                                next = null;
                                break;
                            }
                        } while (!((n8.f) this.f19039e).apply(next));
                        break;
                    default:
                        do {
                            Iterator it2 = this.d;
                            if (it2.hasNext()) {
                                next = it2.next();
                            } else {
                                this.f19036a = 3;
                                next = null;
                                break;
                            }
                        } while (!((t0) this.f19039e).f19091b.contains(next));
                        break;
                }
                this.f19037b = next;
                if (this.f19036a != 3) {
                    this.f19036a = 1;
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
            this.f19036a = 2;
            Object obj = this.f19037b;
            this.f19037b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public d0(Iterator it, n8.f fVar) {
        this();
        this.f19038c = 0;
        this.d = it;
        this.f19039e = fVar;
    }

    public d0(t0 t0Var) {
        this();
        this.f19038c = 1;
        this.f19039e = t0Var;
        this.d = t0Var.f19090a.iterator();
    }
}
