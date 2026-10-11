package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f16849b = new Object();
    public Object f16850a;

    public t(Object obj) {
        this.f16850a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f16850a != f16849b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f16850a;
        Object obj2 = f16849b;
        if (obj != obj2) {
            this.f16850a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
