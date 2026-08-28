package cd;

import g7.u7;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f2363a;
    public final char f2364b;
    public final int f2365c = 1;

    public a(char c10, char c11) {
        this.f2363a = c10;
        this.f2364b = (char) u7.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f2363a, this.f2364b, this.f2365c);
    }
}
