package f9;

import a8.yb;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class v0 extends g2 {
    public int f10348a;
    public Object f10349b;
    public final int f10350c;
    public final Iterator d;
    public final Object e;

    public v0() {
        this.f10348a = 2;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        Object next;
        if (this.f10348a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        int c10 = m1.j.c(this.f10348a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f10348a = 4;
            switch (this.f10350c) {
                case 0:
                    do {
                        Iterator it = this.d;
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            this.f10348a = 3;
                            next = null;
                            break;
                        }
                    } while (!((e9.l) this.e).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.d;
                        if (it2.hasNext()) {
                            next = it2.next();
                        } else {
                            this.f10348a = 3;
                            next = null;
                            break;
                        }
                    } while (!((b2) this.e).f10263b.contains(next));
                    break;
            }
            this.f10349b = next;
            if (this.f10348a != 3) {
                this.f10348a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f10348a = 2;
            Object obj = this.f10349b;
            this.f10349b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public v0(Iterator it, e9.l lVar) {
        this();
        this.f10350c = 0;
        this.d = it;
        this.e = lVar;
    }

    public v0(b2 b2Var) {
        this();
        this.f10350c = 1;
        this.e = b2Var;
        this.d = b2Var.f10262a.iterator();
    }
}
