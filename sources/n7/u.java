package n7;

import java.util.NoSuchElementException;
public final class u extends e0 {
    public static final Object f15167b = new Object();
    public Object f15168a;

    public u(Object obj) {
        this.f15168a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15168a != f15167b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f15168a;
        Object obj2 = f15167b;
        if (obj != obj2) {
            this.f15168a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
