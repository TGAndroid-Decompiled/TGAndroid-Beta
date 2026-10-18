package e9;

import java.util.NoSuchElementException;
public final class e1 extends m2 {
    public final Object f8438a;
    public boolean f8439b;

    public e1(Object obj) {
        this.f8438a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8439b;
    }

    @Override
    public final Object next() {
        if (!this.f8439b) {
            this.f8439b = true;
            return this.f8438a;
        }
        throw new NoSuchElementException();
    }
}
