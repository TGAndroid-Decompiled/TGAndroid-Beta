package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class g8a implements Iterator, zw2 {
    public byte a;
    public Object b;
    public zw2 c;

    public final RuntimeException a() {
        byte b = this.a;
        if (b != 4) {
            if (b != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + ((int) this.a));
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void c(Object obj, fe9 fe9Var) {
        this.b = obj;
        this.a = (byte) 3;
        this.c = fe9Var;
    }

    @Override
    public final mx2 getContext() {
        return u24.a;
    }

    @Override
    public final boolean hasNext() {
        byte b;
        while (true) {
            b = this.a;
            if (b != 0) {
                break;
            }
            this.a = (byte) 5;
            zw2 zw2Var = this.c;
            zw2Var.getClass();
            this.c = null;
            zw2Var.resumeWith(g9c.a);
        }
        if (b != 1) {
            if (b == 2 || b == 3) {
                return true;
            }
            if (b == 4) {
                return false;
            }
            throw a();
        }
        throw null;
    }

    @Override
    public final Object next() {
        byte b = this.a;
        if (b != 0 && b != 1) {
            if (b != 2) {
                if (b == 3) {
                    this.a = (byte) 0;
                    Object obj = this.b;
                    this.b = null;
                    return obj;
                }
                throw a();
            }
            this.a = (byte) 1;
            throw null;
        } else if (hasNext()) {
            return next();
        } else {
            lq5.n();
            return null;
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void resumeWith(Object obj) {
        ixe.b(obj);
        this.a = (byte) 4;
    }
}
