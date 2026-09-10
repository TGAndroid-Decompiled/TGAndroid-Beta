package n7;

import java.util.NoSuchElementException;
public final class u extends e0 {
    public static final Object f13999b = new Object();
    public Object f14000a;

    public u(Object obj) {
        this.f14000a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f14000a != f13999b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f14000a;
        Object obj2 = f13999b;
        if (obj != obj2) {
            this.f14000a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
