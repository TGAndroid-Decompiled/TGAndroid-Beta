package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f11089a;
    public Object f11090b;
    public int f11091c;
    public int d;
    public final t f11092e;

    public s(t tVar) {
        this.f11092e = tVar;
        this.f11091c = tVar.d;
        this.d = tVar.f11095c;
    }

    public final boolean a() {
        this.f11089a = 3;
        int i10 = this.f11091c;
        if (i10 == 0) {
            this.f11089a = 2;
        } else {
            t tVar = this.f11092e;
            Object[] objArr = tVar.f11093a;
            int i11 = this.d;
            this.f11090b = objArr[i11];
            this.f11089a = 1;
            this.d = (i11 + 1) % tVar.f11094b;
            this.f11091c = i10 - 1;
        }
        if (this.f11089a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f11089a;
        if (i10 != 0) {
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return a();
    }

    @Override
    public final Object next() {
        int i10 = this.f11089a;
        if (i10 == 1) {
            this.f11089a = 0;
            return this.f11090b;
        } else if (i10 != 2 && a()) {
            this.f11089a = 0;
            return this.f11090b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
