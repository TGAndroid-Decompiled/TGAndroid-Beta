package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f16683b = new Object();
    public Object f16684a;

    public t(Object obj) {
        this.f16684a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f16684a != f16683b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f16684a;
        Object obj2 = f16683b;
        if (obj != obj2) {
            this.f16684a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
