package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8991a;
    public boolean f8992b;

    public p0(Object obj) {
        this.f8991a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8992b;
    }

    @Override
    public final Object next() {
        if (!this.f8992b) {
            this.f8992b = true;
            return this.f8991a;
        }
        throw new NoSuchElementException();
    }
}
