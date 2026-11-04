package g9;

import java.util.NoSuchElementException;
public final class z0 extends g2 {
    public final Object f12175a;
    public boolean f12176b;

    public z0(Object obj) {
        this.f12175a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f12176b;
    }

    @Override
    public final Object next() {
        if (!this.f12176b) {
            this.f12176b = true;
            return this.f12175a;
        }
        throw new NoSuchElementException();
    }
}
