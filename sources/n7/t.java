package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f15427b = new Object();
    public Object f15428a;

    public t(Object obj) {
        this.f15428a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15428a != f15427b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f15428a;
        Object obj2 = f15427b;
        if (obj != obj2) {
            this.f15428a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
