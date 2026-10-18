package e9;

import java.util.NoSuchElementException;
public final class e1 extends m2 {
    public final Object f8436a;
    public boolean f8437b;

    public e1(Object obj) {
        this.f8436a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8437b;
    }

    @Override
    public final Object next() {
        if (!this.f8437b) {
            this.f8437b = true;
            return this.f8436a;
        }
        throw new NoSuchElementException();
    }
}
