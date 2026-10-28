package f9;

import java.util.NoSuchElementException;
public final class z0 extends g2 {
    public final Object f10363a;
    public boolean f10364b;

    public z0(Object obj) {
        this.f10363a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f10364b;
    }

    @Override
    public final Object next() {
        if (!this.f10364b) {
            this.f10364b = true;
            return this.f10363a;
        }
        throw new NoSuchElementException();
    }
}
