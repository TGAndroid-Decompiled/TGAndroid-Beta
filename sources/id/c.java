package id;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k7.p7;
import kotlin.jvm.internal.j;
import uc.i;
import wc.h;
public final class c implements Iterator, uc.c {
    public int f7461a;
    public Object f7462b;
    public uc.c f7463c;

    public final RuntimeException a() {
        int i10 = this.f7461a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f7461a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void c(Object obj, h hVar) {
        this.f7462b = obj;
        this.f7461a = 3;
        this.f7463c = hVar;
        vc.a aVar = vc.a.f45727a;
    }

    @Override
    public final uc.h getContext() {
        return i.f45281a;
    }

    @Override
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f7461a;
            if (i10 != 0) {
                break;
            }
            this.f7461a = 5;
            uc.c cVar = this.f7463c;
            j.b(cVar);
            this.f7463c = null;
            cVar.resumeWith(sc.i.f44318a);
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
        int i10 = this.f7461a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f7461a = 0;
                    Object obj = this.f7462b;
                    this.f7462b = null;
                    return obj;
                }
                throw a();
            }
            this.f7461a = 1;
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
        p7.b(obj);
        this.f7461a = 4;
    }
}
