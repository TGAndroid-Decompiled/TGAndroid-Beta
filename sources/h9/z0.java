package h9;

import java.util.NoSuchElementException;
public final class z0 extends h2 {
    public final Object f14126a;
    public boolean f14127b;

    public z0(Object obj) {
        this.f14126a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f14127b;
    }

    @Override
    public final Object next() {
        if (!this.f14127b) {
            this.f14127b = true;
            return this.f14126a;
        }
        throw new NoSuchElementException();
    }
}
