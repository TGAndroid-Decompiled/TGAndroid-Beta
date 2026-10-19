package jd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f14395a;
    public Object f14396b;
    public int f14397c;
    public int d;
    public final t e;

    public s(t tVar) {
        this.e = tVar;
        this.f14397c = tVar.d;
        this.d = tVar.f14400c;
    }

    public final boolean a() {
        this.f14395a = 3;
        int i10 = this.f14397c;
        if (i10 == 0) {
            this.f14395a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.f14398a;
            int i11 = this.d;
            this.f14396b = objArr[i11];
            this.f14395a = 1;
            this.d = (i11 + 1) % tVar.f14399b;
            this.f14397c = i10 - 1;
        }
        if (this.f14395a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f14395a;
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
        int i10 = this.f14395a;
        if (i10 == 1) {
            this.f14395a = 0;
            return this.f14396b;
        } else if (i10 != 2 && a()) {
            this.f14395a = 0;
            return this.f14396b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
