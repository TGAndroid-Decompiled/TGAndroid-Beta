package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class ms5 implements Iterator {
    public static final ms5 a;
    public static final ms5[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new ms5[]{r0};
    }

    public static ms5 valueOf(String str) {
        return (ms5) Enum.valueOf(ms5.class, str);
    }

    public static ms5[] values() {
        return (ms5[]) b.clone();
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
        gre.o("no calls to next() since the last call to remove()", false);
    }
}
