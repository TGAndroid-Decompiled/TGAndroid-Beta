package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f15393b = new Object();
    public Object f15394a;

    public t(Object obj) {
        this.f15394a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15394a != f15393b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f15394a;
        Object obj2 = f15393b;
        if (obj != obj2) {
            this.f15394a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
