package kd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f16527a;
    public Object f16528b;
    public int f16529c;
    public int d;
    public final t e;

    public s(t tVar) {
        this.e = tVar;
        this.f16529c = tVar.d;
        this.d = tVar.f16532c;
    }

    public final boolean a() {
        this.f16527a = 3;
        int i10 = this.f16529c;
        if (i10 == 0) {
            this.f16527a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.f16530a;
            int i11 = this.d;
            this.f16528b = objArr[i11];
            this.f16527a = 1;
            this.d = (i11 + 1) % tVar.f16531b;
            this.f16529c = i10 - 1;
        }
        if (this.f16527a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f16527a;
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
        int i10 = this.f16527a;
        if (i10 == 1) {
            this.f16527a = 0;
            return this.f16528b;
        } else if (i10 != 2 && a()) {
            this.f16527a = 0;
            return this.f16528b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
