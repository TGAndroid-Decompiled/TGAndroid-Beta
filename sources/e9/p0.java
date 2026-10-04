package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8792a;
    public boolean f8793b;

    public p0(Object obj) {
        this.f8792a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8793b;
    }

    @Override
    public final Object next() {
        if (!this.f8793b) {
            this.f8793b = true;
            return this.f8792a;
        }
        throw new NoSuchElementException();
    }
}
