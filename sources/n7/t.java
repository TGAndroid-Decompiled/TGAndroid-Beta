package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f16221b = new Object();
    public Object f16222a;

    public t(Object obj) {
        this.f16222a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f16222a != f16221b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f16222a;
        Object obj2 = f16221b;
        if (obj != obj2) {
            this.f16222a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
