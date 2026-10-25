package kd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f16528a;
    public Object f16529b;
    public int f16530c;
    public int d;
    public final t e;

    public s(t tVar) {
        this.e = tVar;
        this.f16530c = tVar.d;
        this.d = tVar.f16533c;
    }

    public final boolean a() {
        this.f16528a = 3;
        int i10 = this.f16530c;
        if (i10 == 0) {
            this.f16528a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.f16531a;
            int i11 = this.d;
            this.f16529b = objArr[i11];
            this.f16528a = 1;
            this.d = (i11 + 1) % tVar.f16532b;
            this.f16530c = i10 - 1;
        }
        if (this.f16528a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f16528a;
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
        int i10 = this.f16528a;
        if (i10 == 1) {
            this.f16528a = 0;
            return this.f16529b;
        } else if (i10 != 2 && a()) {
            this.f16528a = 0;
            return this.f16529b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
