package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f14180a;
    public Object f14181b;
    public int f14182c;
    public int d;
    public final t f14183e;

    public s(t tVar) {
        this.f14183e = tVar;
        this.f14182c = tVar.d;
        this.d = tVar.f14186c;
    }

    public final boolean a() {
        this.f14180a = 3;
        int i7 = this.f14182c;
        if (i7 == 0) {
            this.f14180a = 2;
        } else {
            t tVar = this.f14183e;
            Object[] objArr = tVar.f14184a;
            int i10 = this.d;
            this.f14181b = objArr[i10];
            this.f14180a = 1;
            this.d = (i10 + 1) % tVar.f14185b;
            this.f14182c = i7 - 1;
        }
        if (this.f14180a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i7 = this.f14180a;
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
        int i7 = this.f14180a;
        if (i7 == 1) {
            this.f14180a = 0;
            return this.f14181b;
        } else if (i7 != 2 && a()) {
            this.f14180a = 0;
            return this.f14181b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
