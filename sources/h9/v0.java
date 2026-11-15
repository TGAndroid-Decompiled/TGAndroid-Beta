package h9;

import a8.ja;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class v0 extends g2 {
    public int f13758a;
    public Object f13759b;
    public final int f13760c;
    public final Iterator d;
    public final Object f13761e;

    public v0() {
        this.f13758a = 2;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        Object next;
        if (this.f13758a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z10);
        int c10 = p1.g.c(this.f13758a);
        if (c10 == 0) {
            return true;
        }
        if (c10 != 2) {
            this.f13758a = 4;
            switch (this.f13760c) {
                case 0:
                    do {
                        Iterator it = this.d;
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            this.f13758a = 3;
                            next = null;
                            break;
                        }
                    } while (!((g9.l) this.f13761e).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.d;
                        if (it2.hasNext()) {
                            next = it2.next();
                        } else {
                            this.f13758a = 3;
                            next = null;
                            break;
                        }
                    } while (!((b2) this.f13761e).f13661b.contains(next));
                    break;
            }
            this.f13759b = next;
            if (this.f13758a != 3) {
                this.f13758a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f13758a = 2;
            Object obj = this.f13759b;
            this.f13759b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public v0(Iterator it, g9.l lVar) {
        this();
        this.f13760c = 0;
        this.d = it;
        this.f13761e = lVar;
    }

    public v0(b2 b2Var) {
        this();
        this.f13760c = 1;
        this.f13761e = b2Var;
        this.d = b2Var.f13660a.iterator();
    }
}
