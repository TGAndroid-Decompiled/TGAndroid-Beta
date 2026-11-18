package hd;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class s implements Iterator {
    public int f14148a;
    public Object f14149b;
    public int f14150c;
    public int d;
    public final t f14151e;

    public s(t tVar) {
        this.f14151e = tVar;
        this.f14150c = tVar.d;
        this.d = tVar.f14154c;
    }

    public final boolean a() {
        this.f14148a = 3;
        int i7 = this.f14150c;
        if (i7 == 0) {
            this.f14148a = 2;
        } else {
            t tVar = this.f14151e;
            Object[] objArr = tVar.f14152a;
            int i10 = this.d;
            this.f14149b = objArr[i10];
            this.f14148a = 1;
            this.d = (i10 + 1) % tVar.f14153b;
            this.f14150c = i7 - 1;
        }
        if (this.f14148a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i7 = this.f14148a;
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
        int i7 = this.f14148a;
        if (i7 == 1) {
            this.f14148a = 0;
            return this.f14149b;
        } else if (i7 != 2 && a()) {
            this.f14148a = 0;
            return this.f14149b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
