package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f15385b = new Object();
    public Object f15386a;

    public t(Object obj) {
        this.f15386a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15386a != f15385b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f15386a;
        Object obj2 = f15385b;
        if (obj != obj2) {
            this.f15386a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
