package f9;

import java.util.NoSuchElementException;
public final class z0 extends g2 {
    public final Object f10364a;
    public boolean f10365b;

    public z0(Object obj) {
        this.f10364a = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f10365b;
    }

    @Override
    public final Object next() {
        if (!this.f10365b) {
            this.f10365b = true;
            return this.f10364a;
        }
        throw new NoSuchElementException();
    }
}
