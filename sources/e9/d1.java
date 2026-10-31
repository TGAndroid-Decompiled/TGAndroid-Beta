package e9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.t6;
public final class d1 implements Iterator {
    public static final d1 f6344a;
    public static final d1[] f6345b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f6344a = r02;
        f6345b = new d1[]{r02};
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) f6345b.clone();
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
        t6.o("no calls to next() since the last call to remove()", false);
    }
}
