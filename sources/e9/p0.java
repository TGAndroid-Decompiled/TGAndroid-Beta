package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8791a;
    public boolean f8792b;

    public p0(Object obj) {
        this.f8791a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8792b;
    }

    @Override
    public final Object next() {
        if (!this.f8792b) {
            this.f8792b = true;
            return this.f8791a;
        }
        throw new NoSuchElementException();
    }
}
