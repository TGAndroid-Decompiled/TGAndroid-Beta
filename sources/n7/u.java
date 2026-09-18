package n7;

import java.util.NoSuchElementException;
public final class u extends e0 {
    public static final Object f15179b = new Object();
    public Object f15180a;

    public u(Object obj) {
        this.f15180a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15180a != f15179b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f15180a;
        Object obj2 = f15179b;
        if (obj != obj2) {
            this.f15180a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
