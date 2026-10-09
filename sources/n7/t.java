package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f16801b = new Object();
    public Object f16802a;

    public t(Object obj) {
        this.f16802a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f16802a != f16801b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f16802a;
        Object obj2 = f16801b;
        if (obj != obj2) {
            this.f16802a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
