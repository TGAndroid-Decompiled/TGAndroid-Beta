package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f10198a;
    public Object f10199b;
    public int f10200c;
    public int d;
    public final t e;

    public s(t tVar) {
        this.e = tVar;
        this.f10200c = tVar.d;
        this.d = tVar.f10203c;
    }

    public final boolean a() {
        this.f10198a = 3;
        int i10 = this.f10200c;
        if (i10 == 0) {
            this.f10198a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.f10201a;
            int i11 = this.d;
            this.f10199b = objArr[i11];
            this.f10198a = 1;
            this.d = (i11 + 1) % tVar.f10202b;
            this.f10200c = i10 - 1;
        }
        if (this.f10198a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f10198a;
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
        int i10 = this.f10198a;
        if (i10 == 1) {
            this.f10198a = 0;
            return this.f10199b;
        } else if (i10 != 2 && a()) {
            this.f10198a = 0;
            return this.f10199b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
