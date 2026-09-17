package e9;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class o0 implements Iterator {
    public static final o0 f8987a;
    public static final o0[] f8988b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f8987a = r02;
        f8988b = new o0[]{r02};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f8988b.clone();
    }

    @Override
    public final boolean hasNext() {
        return false;
    }

    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
