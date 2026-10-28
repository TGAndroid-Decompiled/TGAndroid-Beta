package o7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f19254b = new Object();
    public Object f19255a;

    public t(Object obj) {
        this.f19255a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f19255a != f19254b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f19255a;
        Object obj2 = f19254b;
        if (obj != obj2) {
            this.f19255a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
