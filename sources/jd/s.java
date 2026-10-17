package jd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f14388a;
    public Object f14389b;
    public int f14390c;
    public int d;
    public final t e;

    public s(t tVar) {
        this.e = tVar;
        this.f14390c = tVar.d;
        this.d = tVar.f14393c;
    }

    public final boolean a() {
        this.f14388a = 3;
        int i10 = this.f14390c;
        if (i10 == 0) {
            this.f14388a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.f14391a;
            int i11 = this.d;
            this.f14389b = objArr[i11];
            this.f14388a = 1;
            this.d = (i11 + 1) % tVar.f14392b;
            this.f14390c = i10 - 1;
        }
        if (this.f14388a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f14388a;
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
        int i10 = this.f14388a;
        if (i10 == 1) {
            this.f14388a = 0;
            return this.f14389b;
        } else if (i10 != 2 && a()) {
            this.f14388a = 0;
            return this.f14389b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
