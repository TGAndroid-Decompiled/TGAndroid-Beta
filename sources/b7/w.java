package b7;

import java.util.NoSuchElementException;
public final class w extends g0 {
    public static final Object f1880b = new Object();
    public Object f1881a;

    public w(Object obj) {
        this.f1881a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f1881a != f1880b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f1881a;
        Object obj2 = f1880b;
        if (obj != obj2) {
            this.f1881a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
