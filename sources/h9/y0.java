package h9;

import a8.ma;
import java.util.Iterator;
import java.util.NoSuchElementException;
public final class y0 implements Iterator {
    public static final y0 f14082a;
    public static final y0[] f14083b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f14082a = r02;
        f14083b = new y0[]{r02};
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) f14083b.clone();
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
        ma.o("no calls to next() since the last call to remove()", false);
    }
}
