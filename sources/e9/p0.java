package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8785a;
    public boolean f8786b;

    public p0(Object obj) {
        this.f8785a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8786b;
    }

    @Override
    public final Object next() {
        if (!this.f8786b) {
            this.f8786b = true;
            return this.f8785a;
        }
        throw new NoSuchElementException();
    }
}
