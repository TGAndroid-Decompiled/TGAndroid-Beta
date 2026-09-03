package id;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k7.q7;
import kotlin.jvm.internal.j;
import uc.i;
import wc.h;
public final class c implements Iterator, uc.c {
    public int f8051a;
    public Object f8052b;
    public uc.c f8053c;

    public final RuntimeException a() {
        int i10 = this.f8051a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f8051a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void c(Object obj, h hVar) {
        this.f8052b = obj;
        this.f8051a = 3;
        this.f8053c = hVar;
        vc.a aVar = vc.a.f48998a;
    }

    @Override
    public final uc.h getContext() {
        return i.f48516a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f8051a;
            if (i10 != 0) {
                break;
            }
            this.f8051a = 5;
            uc.c cVar = this.f8053c;
            j.b(cVar);
            this.f8053c = null;
            cVar.resumeWith(sc.i.f47274a);
        }
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            throw a();
        }
        j.b(null);
        throw null;
    }

    @Override
    public final Object next() {
        int i10 = this.f8051a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f8051a = 0;
                    Object obj = this.f8052b;
                    this.f8052b = null;
                    return obj;
                }
                throw a();
            }
            this.f8051a = 1;
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
        q7.b(obj);
        this.f8051a = 4;
    }
}
