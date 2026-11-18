package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f14151a;
    public Object f14152b;
    public int f14153c;
    public int d;
    public final t f14154e;

    public s(t tVar) {
        this.f14154e = tVar;
        this.f14153c = tVar.d;
        this.d = tVar.f14157c;
    }

    public final boolean a() {
        this.f14151a = 3;
        int i7 = this.f14153c;
        if (i7 == 0) {
            this.f14151a = 2;
        } else {
            t tVar = this.f14154e;
            Object[] objArr = tVar.f14155a;
            int i10 = this.d;
            this.f14152b = objArr[i10];
            this.f14151a = 1;
            this.d = (i10 + 1) % tVar.f14156b;
            this.f14153c = i7 - 1;
        }
        if (this.f14151a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i7 = this.f14151a;
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
        int i7 = this.f14151a;
        if (i7 == 1) {
            this.f14151a = 0;
            return this.f14152b;
        } else if (i7 != 2 && a()) {
            this.f14151a = 0;
            return this.f14152b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
