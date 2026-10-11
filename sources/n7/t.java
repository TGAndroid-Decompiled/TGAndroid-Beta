package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f16885b = new Object();
    public Object f16886a;

    public t(Object obj) {
        this.f16886a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f16886a != f16885b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f16886a;
        Object obj2 = f16885b;
        if (obj != obj2) {
            this.f16886a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
