package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8110a;
    public boolean f8111b;

    public p0(Object obj) {
        this.f8110a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8111b;
    }

    @Override
    public final Object next() {
        if (!this.f8111b) {
            this.f8111b = true;
            return this.f8110a;
        }
        throw new NoSuchElementException();
    }
}
