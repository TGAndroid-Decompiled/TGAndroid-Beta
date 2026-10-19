package e9;

import java.util.NoSuchElementException;
public final class e1 extends m2 {
    public final Object f8435a;
    public boolean f8436b;

    public e1(Object obj) {
        this.f8435a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8436b;
    }

    @Override
    public final Object next() {
        if (!this.f8436b) {
            this.f8436b = true;
            return this.f8435a;
        }
        throw new NoSuchElementException();
    }
}
