package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f16826b = new Object();
    public Object f16827a;

    public t(Object obj) {
        this.f16827a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f16827a != f16826b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f16827a;
        Object obj2 = f16826b;
        if (obj != obj2) {
            this.f16827a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
