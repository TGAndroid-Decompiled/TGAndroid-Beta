package n7;

import java.util.NoSuchElementException;
public final class u extends e0 {
    public static final Object f17318b = new Object();
    public Object f17319a;

    public u(Object obj) {
        this.f17319a = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.f17319a != f17318b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.f17319a;
        Object obj2 = f17318b;
        if (obj != obj2) {
            this.f17319a = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
