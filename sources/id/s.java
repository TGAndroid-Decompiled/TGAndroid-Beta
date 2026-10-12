package id;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f12115a;
    public Object f12116b;
    public int f12117c;
    public int d;
    public final t f12118e;

    public s(t tVar) {
        this.f12118e = tVar;
        this.f12117c = tVar.d;
        this.d = tVar.f12121c;
    }

    public final boolean a() {
        this.f12115a = 3;
        int i10 = this.f12117c;
        if (i10 == 0) {
            this.f12115a = 2;
        } else {
            t tVar = this.f12118e;
            Object[] objArr = tVar.f12119a;
            int i11 = this.d;
            this.f12116b = objArr[i11];
            this.f12115a = 1;
            this.d = (i11 + 1) % tVar.f12120b;
            this.f12117c = i10 - 1;
        }
        if (this.f12115a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f12115a;
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
        int i10 = this.f12115a;
        if (i10 == 1) {
            this.f12115a = 0;
            return this.f12116b;
        } else if (i10 != 2 && a()) {
            this.f12115a = 0;
            return this.f12116b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
