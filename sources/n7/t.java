package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f13713b = new Object();
    public Object f13714a;

    public t(Object obj) {
        this.f13714a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f13714a != f13713b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f13714a;
        Object obj2 = f13713b;
        if (obj != obj2) {
            this.f13714a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
