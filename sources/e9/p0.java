package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f7415a;
    public boolean f7416b;

    public p0(Object obj) {
        this.f7415a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f7416b;
    }

    @Override
    public final Object next() {
        if (!this.f7416b) {
            this.f7416b = true;
            return this.f7415a;
        }
        throw new NoSuchElementException();
    }
}
