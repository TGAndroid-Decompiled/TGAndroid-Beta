package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f10959a;
    public Object f10960b;
    public int f10961c;
    public int d;
    public final t f10962e;

    public s(t tVar) {
        this.f10962e = tVar;
        this.f10961c = tVar.d;
        this.d = tVar.f10965c;
    }

    public final boolean a() {
        this.f10959a = 3;
        int i10 = this.f10961c;
        if (i10 == 0) {
            this.f10959a = 2;
        } else {
            t tVar = this.f10962e;
            Object[] objArr = tVar.f10963a;
            int i11 = this.d;
            this.f10960b = objArr[i11];
            this.f10959a = 1;
            this.d = (i11 + 1) % tVar.f10964b;
            this.f10961c = i10 - 1;
        }
        if (this.f10959a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f10959a;
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
        int i10 = this.f10959a;
        if (i10 == 1) {
            this.f10959a = 0;
            return this.f10960b;
        } else if (i10 != 2 && a()) {
            this.f10959a = 0;
            return this.f10960b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
