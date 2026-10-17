package n7;

import java.util.NoSuchElementException;
public final class u extends e0 {
    public static final Object f17311b = new Object();
    public Object f17312a;

    public u(Object obj) {
        this.f17312a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f17312a != f17311b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f17312a;
        Object obj2 = f17311b;
        if (obj != obj2) {
            this.f17312a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
