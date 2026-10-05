package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f16836b = new Object();
    public Object f16837a;

    public t(Object obj) {
        this.f16837a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f16837a != f16836b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f16837a;
        Object obj2 = f16836b;
        if (obj != obj2) {
            this.f16837a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
