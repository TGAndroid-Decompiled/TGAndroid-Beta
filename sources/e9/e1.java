package e9;

import java.util.NoSuchElementException;
public final class e1 extends m2 {
    public final Object f8556a;
    public boolean f8557b;

    public e1(Object obj) {
        this.f8556a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f8557b;
    }

    @Override
    public final Object next() {
        if (!this.f8557b) {
            this.f8557b = true;
            return this.f8556a;
        }
        throw new NoSuchElementException();
    }
}
