package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f14177a;
    public Object f14178b;
    public int f14179c;
    public int d;
    public final t f14180e;

    public s(t tVar) {
        this.f14180e = tVar;
        this.f14179c = tVar.d;
        this.d = tVar.f14183c;
    }

    public final boolean a() {
        this.f14177a = 3;
        int i7 = this.f14179c;
        if (i7 == 0) {
            this.f14177a = 2;
        } else {
            t tVar = this.f14180e;
            Object[] objArr = tVar.f14181a;
            int i10 = this.d;
            this.f14178b = objArr[i10];
            this.f14177a = 1;
            this.d = (i10 + 1) % tVar.f14182b;
            this.f14179c = i7 - 1;
        }
        if (this.f14177a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i7 = this.f14177a;
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
        int i7 = this.f14177a;
        if (i7 == 1) {
            this.f14177a = 0;
            return this.f14178b;
        } else if (i7 != 2 && a()) {
            this.f14177a = 0;
            return this.f14178b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
