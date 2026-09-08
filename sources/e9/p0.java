package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f9019a;
    public boolean f9020b;

    public p0(Object obj) {
        this.f9019a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f9020b;
    }

    @Override
    public final Object next() {
        if (!this.f9020b) {
            this.f9020b = true;
            return this.f9019a;
        }
        throw new NoSuchElementException();
    }
}
