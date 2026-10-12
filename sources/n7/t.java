package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f16552b = new Object();
    public Object f16553a;

    public t(Object obj) {
        this.f16553a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f16553a != f16552b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f16553a;
        Object obj2 = f16552b;
        if (obj != obj2) {
            this.f16553a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
