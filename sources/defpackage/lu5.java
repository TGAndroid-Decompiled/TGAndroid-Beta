package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class lu5 implements Iterator {
    public static final lu5 a;
    public static final lu5[] b;

    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new lu5[]{r0};
    }

    public static lu5 valueOf(String str) {
        return (lu5) Enum.valueOf(lu5.class, str);
    }

    public static lu5[] values() {
        return (lu5[]) b.clone();
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
        jte.o("no calls to next() since the last call to remove()", false);
    }
}
