package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f17312b = new Object();
    public Object f17313a;

    public t(Object obj) {
        this.f17313a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f17313a != f17312b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f17313a;
        Object obj2 = f17312b;
        if (obj != obj2) {
            this.f17313a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
