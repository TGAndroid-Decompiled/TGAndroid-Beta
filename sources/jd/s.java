package jd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f12977a;
    public Object f12978b;
    public int f12979c;
    public int d;
    public final t e;

    public s(t tVar) {
        this.e = tVar;
        this.f12979c = tVar.d;
        this.d = tVar.f12982c;
    }

    public final boolean a() {
        this.f12977a = 3;
        int i10 = this.f12979c;
        if (i10 == 0) {
            this.f12977a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.f12980a;
            int i11 = this.d;
            this.f12978b = objArr[i11];
            this.f12977a = 1;
            this.d = (i11 + 1) % tVar.f12981b;
            this.f12979c = i10 - 1;
        }
        if (this.f12977a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f12977a;
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
        int i10 = this.f12977a;
        if (i10 == 1) {
            this.f12977a = 0;
            return this.f12978b;
        } else if (i10 != 2 && a()) {
            this.f12977a = 0;
            return this.f12978b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
