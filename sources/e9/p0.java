package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8786a;
    public boolean f8787b;

    public p0(Object obj) {
        this.f8786a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8787b;
    }

    @Override
    public final Object next() {
        if (!this.f8787b) {
            this.f8787b = true;
            return this.f8786a;
        }
        throw new NoSuchElementException();
    }
}
