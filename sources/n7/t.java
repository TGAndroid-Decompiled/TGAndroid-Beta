package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f15377b = new Object();
    public Object f15378a;

    public t(Object obj) {
        this.f15378a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15378a != f15377b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f15378a;
        Object obj2 = f15377b;
        if (obj != obj2) {
            this.f15378a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
