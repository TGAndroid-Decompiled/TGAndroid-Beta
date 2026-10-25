package o7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f19255b = new Object();
    public Object f19256a;

    public t(Object obj) {
        this.f19256a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f19256a != f19255b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f19256a;
        Object obj2 = f19255b;
        if (obj != obj2) {
            this.f19256a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
