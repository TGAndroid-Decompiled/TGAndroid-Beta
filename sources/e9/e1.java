package e9;

import java.util.NoSuchElementException;
public final class e1 extends m2 {
    public final Object f8437a;
    public boolean f8438b;

    public e1(Object obj) {
        this.f8437a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8438b;
    }

    @Override
    public final Object next() {
        if (!this.f8438b) {
            this.f8438b = true;
            return this.f8437a;
        }
        throw new NoSuchElementException();
    }
}
