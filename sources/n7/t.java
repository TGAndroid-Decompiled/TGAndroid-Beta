package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f15349b = new Object();
    public Object f15350a;

    public t(Object obj) {
        this.f15350a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15350a != f15349b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f15350a;
        Object obj2 = f15349b;
        if (obj != obj2) {
            this.f15350a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
