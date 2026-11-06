package a0;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class b implements Iterator {
    public int f2a;
    public int f3b;
    public boolean f4c;
    public final int d;
    public final Object f5e;

    public b(int i7) {
        this.f2a = i7;
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
        Object f10;
        if (hasNext()) {
            int i7 = this.f3b;
            switch (this.d) {
                case 0:
                    f10 = ((f) this.f5e).f(i7);
                    break;
                case 1:
                    f10 = ((f) this.f5e).i(i7);
                    break;
                default:
                    f10 = ((g) this.f5e).f15b[i7];
                    break;
            }
            this.f3b++;
            this.f4c = true;
            return f10;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        if (this.f4c) {
            int i7 = this.f3b - 1;
            this.f3b = i7;
            switch (this.d) {
                case 0:
                    ((f) this.f5e).g(i7);
                    break;
                case 1:
                    ((f) this.f5e).g(i7);
                    break;
                default:
                    ((g) this.f5e).f(i7);
                    break;
            }
            this.f2a--;
            this.f4c = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.");
    }

    public b(g gVar) {
        this(gVar.f16c);
        this.d = 2;
        this.f5e = gVar;
    }

    public b(f fVar, int i7) {
        this(fVar.f31c);
        this.d = i7;
        switch (i7) {
            case 1:
                this.f5e = fVar;
                this(fVar.f31c);
                return;
            default:
                this.f5e = fVar;
                return;
        }
    }
}
