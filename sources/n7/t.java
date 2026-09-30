package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f15408b = new Object();
    public Object f15409a;

    public t(Object obj) {
        this.f15409a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15409a != f15408b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f15409a;
        Object obj2 = f15408b;
        if (obj != obj2) {
            this.f15409a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
