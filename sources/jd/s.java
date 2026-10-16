package jd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f12981a;
    public Object f12982b;
    public int f12983c;
    public int d;
    public final t e;

    public s(t tVar) {
        this.e = tVar;
        this.f12983c = tVar.d;
        this.d = tVar.f12986c;
    }

    public final boolean a() {
        this.f12981a = 3;
        int i10 = this.f12983c;
        if (i10 == 0) {
            this.f12981a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.f12984a;
            int i11 = this.d;
            this.f12982b = objArr[i11];
            this.f12981a = 1;
            this.d = (i11 + 1) % tVar.f12985b;
            this.f12983c = i10 - 1;
        }
        if (this.f12981a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f12981a;
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
        int i10 = this.f12981a;
        if (i10 == 1) {
            this.f12981a = 0;
            return this.f12982b;
        } else if (i10 != 2 && a()) {
            this.f12981a = 0;
            return this.f12982b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
