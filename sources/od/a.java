package od;

import java.util.Iterator;
import v7.q7;
public abstract class a implements Iterable {
    public final char f14141a;
    public final char f14142b;
    public final int f14143c = 1;

    public a(char c10, char c11) {
        this.f14141a = c10;
        this.f14142b = (char) q7.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f14141a, this.f14142b, this.f14143c);
    }
}
