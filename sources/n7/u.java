package n7;

import java.util.NoSuchElementException;
public final class u extends e0 {
    public static final Object f15169b = new Object();
    public Object f15170a;

    public u(Object obj) {
        this.f15170a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15170a != f15169b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f15170a;
        Object obj2 = f15169b;
        if (obj != obj2) {
            this.f15170a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
