package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f16805b = new Object();
    public Object f16806a;

    public t(Object obj) {
        this.f16806a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f16806a != f16805b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f16806a;
        Object obj2 = f16805b;
        if (obj != obj2) {
            this.f16806a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
