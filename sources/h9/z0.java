package h9;

import java.util.NoSuchElementException;
public final class z0 extends h2 {
    public final Object f14420a;
    public boolean f14421b;

    public z0(Object obj) {
        this.f14420a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f14421b;
    }

    @Override
    public final Object next() {
        if (!this.f14421b) {
            this.f14421b = true;
            return this.f14420a;
        }
        throw new NoSuchElementException();
    }
}
