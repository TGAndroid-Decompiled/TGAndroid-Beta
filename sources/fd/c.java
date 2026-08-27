package fd;

import h7.k6;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
import rc.i;
import tc.h;

public final class c implements Iterator, rc.c {

    public int f6040a;

    public Object f6041b;

    public rc.c f6042c;

    public final RuntimeException a() {
        int i10 = this.f6040a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f6040a);
    }

    public final void c(Object obj, h hVar) {
        this.f6041b = obj;
        this.f6040a = 3;
        this.f6042c = hVar;
        sc.a aVar = sc.a.f47847a;
    }

    @Override
    public final rc.h getContext() {
        return i.f46899a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f6040a;
            if (i10 != 0) {
                break;
            }
            this.f6040a = 5;
            rc.c cVar = this.f6042c;
            j.b(cVar);
            this.f6042c = null;
            cVar.resumeWith(pc.i.f45696a);
        }
        if (i10 == 1) {
            j.b(null);
            throw null;
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw a();
    }

    @Override
    public final Object next() {
        int i10 = this.f6040a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f6040a = 1;
            j.b(null);
            throw null;
        }
        if (i10 != 3) {
            throw a();
        }
        this.f6040a = 0;
        Object obj = this.f6041b;
        this.f6041b = null;
        return obj;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void resumeWith(Object obj) {
        k6.b(obj);
        this.f6040a = 4;
    }
}
