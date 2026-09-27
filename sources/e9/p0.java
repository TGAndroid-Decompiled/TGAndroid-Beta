package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8099a;
    public boolean f8100b;

    public p0(Object obj) {
        this.f8099a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8100b;
    }

    @Override
    public final Object next() {
        if (!this.f8100b) {
            this.f8100b = true;
            return this.f8099a;
        }
        throw new NoSuchElementException();
    }
}
