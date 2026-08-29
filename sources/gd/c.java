package gd;

import i7.c7;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
import sc.i;
import uc.h;
public final class c implements Iterator, sc.c {
    public int f7265a;
    public Object f7266b;
    public sc.c f7267c;

    public final RuntimeException b() {
        int i10 = this.f7265a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f7265a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void c(Object obj, h hVar) {
        this.f7266b = obj;
        this.f7265a = 3;
        this.f7267c = hVar;
        tc.a aVar = tc.a.f48210a;
    }

    @Override
    public final sc.h getContext() {
        return i.f47711a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f7265a;
            if (i10 != 0) {
                break;
            }
            this.f7265a = 5;
            sc.c cVar = this.f7267c;
            j.b(cVar);
            this.f7267c = null;
            cVar.resumeWith(qc.i.f46603a);
        }
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            throw b();
        }
        j.b(null);
        throw null;
    }

    @Override
    public final Object next() {
        int i10 = this.f7265a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f7265a = 0;
                    Object obj = this.f7266b;
                    this.f7266b = null;
                    return obj;
                }
                throw b();
            }
            this.f7265a = 1;
            j.b(null);
            throw null;
        } else if (hasNext()) {
            return next();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void resumeWith(Object obj) {
        c7.b(obj);
        this.f7265a = 4;
    }
}
