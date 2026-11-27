package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class pu5 implements Iterator {
    public static final pu5 a;
    public static final pu5[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new pu5[]{r0};
    }

    public static pu5 valueOf(String str) {
        return (pu5) Enum.valueOf(pu5.class, str);
    }

    public static pu5[] values() {
        return (pu5[]) b.clone();
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
        yve.o("no calls to next() since the last call to remove()", false);
    }
}
