package id;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f12117a;
    public Object f12118b;
    public int f12119c;
    public int d;
    public final t f12120e;

    public s(t tVar) {
        this.f12120e = tVar;
        this.f12119c = tVar.d;
        this.d = tVar.f12123c;
    }

    public final boolean a() {
        this.f12117a = 3;
        int i10 = this.f12119c;
        if (i10 == 0) {
            this.f12117a = 2;
        } else {
            t tVar = this.f12120e;
            Object[] objArr = tVar.f12121a;
            int i11 = this.d;
            this.f12118b = objArr[i11];
            this.f12117a = 1;
            this.d = (i11 + 1) % tVar.f12122b;
            this.f12119c = i10 - 1;
        }
        if (this.f12117a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f12117a;
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
        int i10 = this.f12117a;
        if (i10 == 1) {
            this.f12117a = 0;
            return this.f12118b;
        } else if (i10 != 2 && a()) {
            this.f12117a = 0;
            return this.f12118b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
