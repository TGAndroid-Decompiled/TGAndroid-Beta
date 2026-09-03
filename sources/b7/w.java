package b7;

import java.util.NoSuchElementException;
public final class w extends g0 {
    public static final Object f1745b = new Object();
    public Object f1746a;

    public w(Object obj) {
        this.f1746a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f1746a != f1745b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f1746a;
        Object obj2 = f1745b;
        if (obj != obj2) {
            this.f1746a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
