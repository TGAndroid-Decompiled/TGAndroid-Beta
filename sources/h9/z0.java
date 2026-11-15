package h9;

import java.util.NoSuchElementException;
public final class z0 extends g2 {
    public final Object f13778a;
    public boolean f13779b;

    public z0(Object obj) {
        this.f13778a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f13779b;
    }

    @Override
    public final Object next() {
        if (!this.f13779b) {
            this.f13779b = true;
            return this.f13778a;
        }
        throw new NoSuchElementException();
    }
}
