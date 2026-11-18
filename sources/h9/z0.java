package h9;

import java.util.NoSuchElementException;
public final class z0 extends h2 {
    public final Object f14094a;
    public boolean f14095b;

    public z0(Object obj) {
        this.f14094a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f14095b;
    }

    @Override
    public final Object next() {
        if (!this.f14095b) {
            this.f14095b = true;
            return this.f14094a;
        }
        throw new NoSuchElementException();
    }
}
