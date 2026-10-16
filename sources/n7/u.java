package n7;

import java.util.NoSuchElementException;
public final class u extends e0 {
    public static final Object f15935b = new Object();
    public Object f15936a;

    public u(Object obj) {
        this.f15936a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15936a != f15935b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f15936a;
        Object obj2 = f15935b;
        if (obj != obj2) {
            this.f15936a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
