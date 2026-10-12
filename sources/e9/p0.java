package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8783a;
    public boolean f8784b;

    public p0(Object obj) {
        this.f8783a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8784b;
    }

    @Override
    public final Object next() {
        if (!this.f8784b) {
            this.f8784b = true;
            return this.f8783a;
        }
        throw new NoSuchElementException();
    }
}
