package n7;

import java.util.NoSuchElementException;
public final class t extends d0 {
    public static final Object f15398b = new Object();
    public Object f15399a;

    public t(Object obj) {
        this.f15399a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15399a != f15398b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f15399a;
        Object obj2 = f15398b;
        if (obj != obj2) {
            this.f15399a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
