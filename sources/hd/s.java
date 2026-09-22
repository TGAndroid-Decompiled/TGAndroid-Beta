package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f10194a;
    public Object f10195b;
    public int f10196c;
    public int d;
    public final t e;

    public s(t tVar) {
        this.e = tVar;
        this.f10196c = tVar.d;
        this.d = tVar.f10199c;
    }

    public final boolean a() {
        this.f10194a = 3;
        int i10 = this.f10196c;
        if (i10 == 0) {
            this.f10194a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.f10197a;
            int i11 = this.d;
            this.f10195b = objArr[i11];
            this.f10194a = 1;
            this.d = (i11 + 1) % tVar.f10198b;
            this.f10196c = i10 - 1;
        }
        if (this.f10194a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f10194a;
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
        int i10 = this.f10194a;
        if (i10 == 1) {
            this.f10194a = 0;
            return this.f10195b;
        } else if (i10 != 2 && a()) {
            this.f10194a = 0;
            return this.f10195b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
