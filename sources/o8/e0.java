package o8;

import java.util.NoSuchElementException;
public final class e0 extends x0 {
    public boolean f19041a;
    public final Object f19042b;

    public e0(Object obj) {
        this.f19042b = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f19041a;
    }

    @Override
    public final Object next() {
        if (!this.f19041a) {
            this.f19041a = true;
            return this.f19042b;
        }
        throw new NoSuchElementException();
    }
}
