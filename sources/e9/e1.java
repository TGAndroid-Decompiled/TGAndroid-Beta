package e9;

import java.util.NoSuchElementException;
public final class e1 extends m2 {
    public final Object f8442a;
    public boolean f8443b;

    public e1(Object obj) {
        this.f8442a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8443b;
    }

    @Override
    public final Object next() {
        if (!this.f8443b) {
            this.f8443b = true;
            return this.f8442a;
        }
        throw new NoSuchElementException();
    }
}
