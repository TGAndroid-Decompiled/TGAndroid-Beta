package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8109a;
    public boolean f8110b;

    public p0(Object obj) {
        this.f8109a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8110b;
    }

    @Override
    public final Object next() {
        if (!this.f8110b) {
            this.f8110b = true;
            return this.f8109a;
        }
        throw new NoSuchElementException();
    }
}
