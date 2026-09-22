package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8114a;
    public boolean f8115b;

    public p0(Object obj) {
        this.f8114a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8115b;
    }

    @Override
    public final Object next() {
        if (!this.f8115b) {
            this.f8115b = true;
            return this.f8114a;
        }
        throw new NoSuchElementException();
    }
}
