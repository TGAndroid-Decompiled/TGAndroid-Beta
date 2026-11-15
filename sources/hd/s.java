package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f13834a;
    public Object f13835b;
    public int f13836c;
    public int d;
    public final t f13837e;

    public s(t tVar) {
        this.f13837e = tVar;
        this.f13836c = tVar.d;
        this.d = tVar.f13840c;
    }

    public final boolean a() {
        this.f13834a = 3;
        int i7 = this.f13836c;
        if (i7 == 0) {
            this.f13834a = 2;
        } else {
            t tVar = this.f13837e;
            Object[] objArr = tVar.f13838a;
            int i10 = this.d;
            this.f13835b = objArr[i10];
            this.f13834a = 1;
            this.d = (i10 + 1) % tVar.f13839b;
            this.f13836c = i7 - 1;
        }
        if (this.f13834a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i7 = this.f13834a;
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
        int i7 = this.f13834a;
        if (i7 == 1) {
            this.f13834a = 0;
            return this.f13835b;
        } else if (i7 != 2 && a()) {
            this.f13834a = 0;
            return this.f13835b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
