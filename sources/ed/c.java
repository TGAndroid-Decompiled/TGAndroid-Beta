package ed;

import g7.y5;
import java.util.Iterator;
import java.util.NoSuchElementException;
import qc.i;
import sc.h;
public final class c implements Iterator, qc.c {
    public int f5109a;
    public Object f5110b;
    public qc.c f5111c;

    public final RuntimeException a() {
        int i9 = this.f5109a;
        if (i9 != 4) {
            if (i9 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f5109a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void c(Object obj, h hVar) {
        this.f5110b = obj;
        this.f5109a = 3;
        this.f5111c = hVar;
        rc.a aVar = rc.a.f47127a;
    }

    @Override
    public final qc.h getContext() {
        return i.f46140a;
    }

    @Override
    public final boolean hasNext() {
        int i9;
        while (true) {
            i9 = this.f5109a;
            if (i9 != 0) {
                break;
            }
            this.f5109a = 5;
            qc.c cVar = this.f5111c;
            kotlin.jvm.internal.i.b(cVar);
            this.f5111c = null;
            cVar.resumeWith(oc.i.f19197a);
        }
        if (i9 != 1) {
            if (i9 == 2 || i9 == 3) {
                return true;
            }
            if (i9 == 4) {
                return false;
            }
            throw a();
        }
        kotlin.jvm.internal.i.b(null);
        throw null;
    }

    @Override
    public final Object next() {
        int i9 = this.f5109a;
        if (i9 != 0 && i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    this.f5109a = 0;
                    Object obj = this.f5110b;
                    this.f5110b = null;
                    return obj;
                }
                throw a();
            }
            this.f5109a = 1;
            kotlin.jvm.internal.i.b(null);
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
        y5.b(obj);
        this.f5109a = 4;
    }
}
