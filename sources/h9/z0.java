package h9;

import java.util.NoSuchElementException;
public final class z0 extends h2 {
    public final Object f14123a;
    public boolean f14124b;

    public z0(Object obj) {
        this.f14123a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f14124b;
    }

    @Override
    public final Object next() {
        if (!this.f14124b) {
            this.f14124b = true;
            return this.f14123a;
        }
        throw new NoSuchElementException();
    }
}
