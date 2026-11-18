package h9;

import java.util.NoSuchElementException;
public final class z0 extends h2 {
    public final Object f14097a;
    public boolean f14098b;

    public z0(Object obj) {
        this.f14097a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f14098b;
    }

    @Override
    public final Object next() {
        if (!this.f14098b) {
            this.f14098b = true;
            return this.f14097a;
        }
        throw new NoSuchElementException();
    }
}
