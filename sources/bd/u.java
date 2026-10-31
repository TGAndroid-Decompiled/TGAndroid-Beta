package bd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class u implements Iterator {
    public int f2663a;
    public Object f2664b;
    public int f2665c;
    public int d;
    public final v e;

    public u(v vVar) {
        this.e = vVar;
        this.f2665c = vVar.d;
        this.d = vVar.f2668c;
    }

    public final boolean a() {
        this.f2663a = 3;
        int i10 = this.f2665c;
        if (i10 == 0) {
            this.f2663a = 2;
        } else {
            v vVar = this.e;
            Object[] objArr = vVar.f2666a;
            int i11 = this.d;
            this.f2664b = objArr[i11];
            this.f2663a = 1;
            this.d = (i11 + 1) % vVar.f2667b;
            this.f2665c = i10 - 1;
        }
        if (this.f2663a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f2663a;
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
        int i10 = this.f2663a;
        if (i10 == 1) {
            this.f2663a = 0;
            return this.f2664b;
        } else if (i10 != 2 && a()) {
            this.f2663a = 0;
            return this.f2664b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
