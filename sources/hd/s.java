package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f14477a;
    public Object f14478b;
    public int f14479c;
    public int d;
    public final t f14480e;

    public s(t tVar) {
        this.f14480e = tVar;
        this.f14479c = tVar.d;
        this.d = tVar.f14483c;
    }

    public final boolean a() {
        this.f14477a = 3;
        int i7 = this.f14479c;
        if (i7 == 0) {
            this.f14477a = 2;
        } else {
            t tVar = this.f14480e;
            Object[] objArr = tVar.f14481a;
            int i10 = this.d;
            this.f14478b = objArr[i10];
            this.f14477a = 1;
            this.d = (i10 + 1) % tVar.f14482b;
            this.f14479c = i7 - 1;
        }
        if (this.f14477a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i7 = this.f14477a;
        if (i7 != 0) {
            if (i7 == 1) {
                return true;
            }
            if (i7 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return a();
    }

    @Override
    public final Object next() {
        int i7 = this.f14477a;
        if (i7 == 1) {
            this.f14477a = 0;
            return this.f14478b;
        } else if (i7 != 2 && a()) {
            this.f14477a = 0;
            return this.f14478b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
