package e9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.u6;
public final class d1 implements Iterator {
    public static final d1 f8428a;
    public static final d1[] f8429b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f8428a = r02;
        f8429b = new d1[]{r02};
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) f8429b.clone();
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
        u6.o("no calls to next() since the last call to remove()", false);
    }
}
