package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8115a;
    public boolean f8116b;

    public p0(Object obj) {
        this.f8115a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8116b;
    }

    @Override
    public final Object next() {
        if (!this.f8116b) {
            this.f8116b = true;
            return this.f8115a;
        }
        throw new NoSuchElementException();
    }
}
