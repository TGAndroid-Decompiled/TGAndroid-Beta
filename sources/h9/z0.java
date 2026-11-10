package h9;

import java.util.NoSuchElementException;
public final class z0 extends h2 {
    public final Object f14422a;
    public boolean f14423b;

    public z0(Object obj) {
        this.f14422a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f14423b;
    }

    @Override
    public final Object next() {
        if (!this.f14423b) {
            this.f14423b = true;
            return this.f14422a;
        }
        throw new NoSuchElementException();
    }
}
