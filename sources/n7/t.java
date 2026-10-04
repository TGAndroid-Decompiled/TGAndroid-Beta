package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f16827b = new Object();
    public Object f16828a;

    public t(Object obj) {
        this.f16828a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f16828a != f16827b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f16828a;
        Object obj2 = f16827b;
        if (obj != obj2) {
            this.f16828a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
