package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f13714b = new Object();
    public Object f13715a;

    public t(Object obj) {
        this.f13715a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f13715a != f13714b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f13715a;
        Object obj2 = f13714b;
        if (obj != obj2) {
            this.f13715a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
