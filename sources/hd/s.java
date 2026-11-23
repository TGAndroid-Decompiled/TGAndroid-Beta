package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f14143a;
    public Object f14144b;
    public int f14145c;
    public int d;
    public final t f14146e;

    public s(t tVar) {
        this.f14146e = tVar;
        this.f14145c = tVar.d;
        this.d = tVar.f14149c;
    }

    public final boolean a() {
        this.f14143a = 3;
        int i7 = this.f14145c;
        if (i7 == 0) {
            this.f14143a = 2;
        } else {
            t tVar = this.f14146e;
            Object[] objArr = tVar.f14147a;
            int i10 = this.d;
            this.f14144b = objArr[i10];
            this.f14143a = 1;
            this.d = (i10 + 1) % tVar.f14148b;
            this.f14145c = i7 - 1;
        }
        if (this.f14143a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i7 = this.f14143a;
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
        int i7 = this.f14143a;
        if (i7 == 1) {
            this.f14143a = 0;
            return this.f14144b;
        } else if (i7 != 2 && a()) {
            this.f14143a = 0;
            return this.f14144b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
