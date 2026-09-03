package a0;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class b implements Iterator {
    public int f2a;
    public int f3b;
    public boolean f4c;
    public final int d;
    public final Object e;

    public b(int i10) {
        this.f2a = i10;
    }

    @Override
    public final boolean hasNext() {
        if (this.f3b < this.f2a) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object e;
        if (hasNext()) {
            int i10 = this.f3b;
            switch (this.d) {
                case 0:
                    e = ((f) this.e).e(i10);
                    break;
                case 1:
                    e = ((f) this.e).h(i10);
                    break;
                default:
                    e = ((g) this.e).f12b[i10];
                    break;
            }
            this.f3b++;
            this.f4c = true;
            return e;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        if (this.f4c) {
            int i10 = this.f3b - 1;
            this.f3b = i10;
            switch (this.d) {
                case 0:
                    ((f) this.e).f(i10);
                    break;
                case 1:
                    ((f) this.e).f(i10);
                    break;
                default:
                    ((g) this.e).i(i10);
                    break;
            }
            this.f2a--;
            this.f4c = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.");
    }

    public b(g gVar) {
        this(gVar.f13c);
        this.d = 2;
        this.e = gVar;
    }

    public b(f fVar, int i10) {
        this(fVar.f25c);
        this.d = i10;
        switch (i10) {
            case 1:
                this.e = fVar;
                this(fVar.f25c);
                return;
            default:
                this.e = fVar;
                return;
        }
    }
}
