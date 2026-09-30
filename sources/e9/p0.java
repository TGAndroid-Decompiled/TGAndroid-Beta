package e9;

import java.util.NoSuchElementException;
public final class p0 extends o1 {
    public final Object f8097a;
    public boolean f8098b;

    public p0(Object obj) {
        this.f8097a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8098b;
    }

    @Override
    public final Object next() {
        if (!this.f8098b) {
            this.f8098b = true;
            return this.f8097a;
        }
        throw new NoSuchElementException();
    }
}
