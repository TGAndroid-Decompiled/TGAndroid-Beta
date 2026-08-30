package b7;

import java.util.NoSuchElementException;
public final class w extends g0 {
    public static final Object f1734b = new Object();
    public Object f1735a;

    public w(Object obj) {
        this.f1735a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f1735a != f1734b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f1735a;
        Object obj2 = f1734b;
        if (obj != obj2) {
            this.f1735a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
