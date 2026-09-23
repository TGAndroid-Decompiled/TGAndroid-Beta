package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8098a;
    public boolean f8099b;

    public p0(Object obj) {
        this.f8098a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8099b;
    }

    @Override
    public final Object next() {
        if (!this.f8099b) {
            this.f8099b = true;
            return this.f8098a;
        }
        throw new NoSuchElementException();
    }
}
