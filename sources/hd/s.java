package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f9311a;
    public Object f9312b;
    public int f9313c;
    public int d;
    public final t e;

    public s(t tVar) {
        this.e = tVar;
        this.f9313c = tVar.d;
        this.d = tVar.f9316c;
    }

    public final boolean a() {
        this.f9311a = 3;
        int i10 = this.f9313c;
        if (i10 == 0) {
            this.f9311a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.f9314a;
            int i11 = this.d;
            this.f9312b = objArr[i11];
            this.f9311a = 1;
            this.d = (i11 + 1) % tVar.f9315b;
            this.f9313c = i10 - 1;
        }
        if (this.f9311a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f9311a;
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
        int i10 = this.f9311a;
        if (i10 == 1) {
            this.f9311a = 0;
            return this.f9312b;
        } else if (i10 != 2 && a()) {
            this.f9311a = 0;
            return this.f9312b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
