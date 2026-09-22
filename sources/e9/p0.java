package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8112a;
    public boolean f8113b;

    public p0(Object obj) {
        this.f8112a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8113b;
    }

    @Override
    public final Object next() {
        if (!this.f8113b) {
            this.f8113b = true;
            return this.f8112a;
        }
        throw new NoSuchElementException();
    }
}
