package ed;

import i7.l8;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f5875a;
    public final char f5876b;
    public final int f5877c = 1;

    public a(char c3, char c6) {
        this.f5875a = c3;
        this.f5876b = (char) l8.a(c3, c6, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f5875a, this.f5876b, this.f5877c);
    }
}
