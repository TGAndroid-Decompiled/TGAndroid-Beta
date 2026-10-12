package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f16553b = new Object();
    public Object f16554a;

    public t(Object obj) {
        this.f16554a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f16554a != f16553b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f16554a;
        Object obj2 = f16553b;
        if (obj != obj2) {
            this.f16554a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
