package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f17375b = new Object();
    public Object f17376a;

    public t(Object obj) {
        this.f17376a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f17376a != f17375b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f17376a;
        Object obj2 = f17375b;
        if (obj != obj2) {
            this.f17376a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
