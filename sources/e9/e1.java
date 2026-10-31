package e9;

import java.util.NoSuchElementException;
public final class e1 extends m2 {
    public final Object f6351a;
    public boolean f6352b;

    public e1(Object obj) {
        this.f6351a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f6352b;
    }

    @Override
    public final Object next() {
        if (!this.f6352b) {
            this.f6352b = true;
            return this.f6351a;
        }
        throw new NoSuchElementException();
    }
}
