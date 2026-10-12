package e9;

import java.util.NoSuchElementException;
public final class e1 extends m2 {
    public final Object f8553a;
    public boolean f8554b;

    public e1(Object obj) {
        this.f8553a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8554b;
    }

    @Override
    public final Object next() {
        if (!this.f8554b) {
            this.f8554b = true;
            return this.f8553a;
        }
        throw new NoSuchElementException();
    }
}
