package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f16710b = new Object();
    public Object f16711a;

    public t(Object obj) {
        this.f16711a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f16711a != f16710b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f16711a;
        Object obj2 = f16710b;
        if (obj != obj2) {
            this.f16711a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
