package h9;

import java.util.NoSuchElementException;
public final class z0 extends g2 {
    public final Object f14087a;
    public boolean f14088b;

    public z0(Object obj) {
        this.f14087a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f14088b;
    }

    @Override
    public final Object next() {
        if (!this.f14088b) {
            this.f14088b = true;
            return this.f14087a;
        }
        throw new NoSuchElementException();
    }
}
