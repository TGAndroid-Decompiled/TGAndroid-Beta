package n7;

import java.util.NoSuchElementException;
public final class u extends e0 {
    public static final Object f15144b = new Object();
    public Object f15145a;

    public u(Object obj) {
        this.f15145a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15145a != f15144b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f15145a;
        Object obj2 = f15144b;
        if (obj != obj2) {
            this.f15145a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
