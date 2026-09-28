package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f15392b = new Object();
    public Object f15393a;

    public t(Object obj) {
        this.f15393a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15393a != f15392b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f15393a;
        Object obj2 = f15392b;
        if (obj != obj2) {
            this.f15393a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
