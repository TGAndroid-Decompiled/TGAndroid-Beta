package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f16831b = new Object();
    public Object f16832a;

    public t(Object obj) {
        this.f16832a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f16832a != f16831b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f16832a;
        Object obj2 = f16831b;
        if (obj != obj2) {
            this.f16832a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
