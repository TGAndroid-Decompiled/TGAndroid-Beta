package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f10985a;
    public Object f10986b;
    public int f10987c;
    public int d;
    public final t f10988e;

    public s(t tVar) {
        this.f10988e = tVar;
        this.f10987c = tVar.d;
        this.d = tVar.f10991c;
    }

    public final boolean a() {
        this.f10985a = 3;
        int i10 = this.f10987c;
        if (i10 == 0) {
            this.f10985a = 2;
        } else {
            t tVar = this.f10988e;
            Object[] objArr = tVar.f10989a;
            int i11 = this.d;
            this.f10986b = objArr[i11];
            this.f10985a = 1;
            this.d = (i11 + 1) % tVar.f10990b;
            this.f10987c = i10 - 1;
        }
        if (this.f10985a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i10 = this.f10985a;
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
        int i10 = this.f10985a;
        if (i10 == 1) {
            this.f10985a = 0;
            return this.f10986b;
        } else if (i10 != 2 && a()) {
            this.f10985a = 0;
            return this.f10986b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
