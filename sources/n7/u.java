package n7;

import java.util.NoSuchElementException;
public final class u extends e0 {
    public static final Object f17314b = new Object();
    public Object f17315a;

    public u(Object obj) {
        this.f17315a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f17315a != f17314b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f17315a;
        Object obj2 = f17314b;
        if (obj != obj2) {
            this.f17315a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
