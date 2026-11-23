package h9;

import java.util.NoSuchElementException;
public final class z0 extends h2 {
    public final Object f14089a;
    public boolean f14090b;

    public z0(Object obj) {
        this.f14089a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f14090b;
    }

    @Override
    public final Object next() {
        if (!this.f14090b) {
            this.f14090b = true;
            return this.f14089a;
        }
        throw new NoSuchElementException();
    }
}
