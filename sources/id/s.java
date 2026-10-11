package id;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f12116a;
    public Object f12117b;
    public int f12118c;
    public int d;
    public final t f12119e;

    public s(t tVar) {
        this.f12119e = tVar;
        this.f12118c = tVar.d;
        this.d = tVar.f12122c;
    }

    public final boolean a() {
        this.f12116a = 3;
        int i10 = this.f12118c;
        if (i10 == 0) {
            this.f12116a = 2;
        } else {
            t tVar = this.f12119e;
            Object[] objArr = tVar.f12120a;
            int i11 = this.d;
            this.f12117b = objArr[i11];
            this.f12116a = 1;
            this.d = (i11 + 1) % tVar.f12121b;
            this.f12118c = i10 - 1;
        }
        if (this.f12116a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f12116a;
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
        int i10 = this.f12116a;
        if (i10 == 1) {
            this.f12116a = 0;
            return this.f12117b;
        } else if (i10 != 2 && a()) {
            this.f12116a = 0;
            return this.f12117b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
