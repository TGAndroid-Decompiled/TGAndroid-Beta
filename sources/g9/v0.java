package g9;

import b8.zb;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class v0 extends g2 {
    public int f12155a;
    public Object f12156b;
    public final int f12157c;
    public final Iterator d;
    public final Object f12158e;

    public v0() {
        this.f12155a = 2;
    }

    @Override
    public final boolean hasNext() {
        boolean z10;
        Object next;
        if (this.f12155a != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        int c2 = o1.g.c(this.f12155a);
        if (c2 == 0) {
            return true;
        }
        if (c2 != 2) {
            this.f12155a = 4;
            switch (this.f12157c) {
                case 0:
                    do {
                        Iterator it = this.d;
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            this.f12155a = 3;
                            next = null;
                            break;
                        }
                    } while (!((f9.l) this.f12158e).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.d;
                        if (it2.hasNext()) {
                            next = it2.next();
                        } else {
                            this.f12155a = 3;
                            next = null;
                            break;
                        }
                    } while (!((b2) this.f12158e).f12058b.contains(next));
                    break;
            }
            this.f12156b = next;
            if (this.f12155a != 3) {
                this.f12155a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f12155a = 2;
            Object obj = this.f12156b;
            this.f12156b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public v0(Iterator it, f9.l lVar) {
        this();
        this.f12157c = 0;
        this.d = it;
        this.f12158e = lVar;
    }

    public v0(b2 b2Var) {
        this();
        this.f12157c = 1;
        this.f12158e = b2Var;
        this.d = b2Var.f12057a.iterator();
    }
}
