package od;

import java.util.Iterator;
import v7.q7;
public abstract class a implements Iterable {
    public final char f14142a;
    public final char f14143b;
    public final int f14144c = 1;

    public a(char c10, char c11) {
        this.f14142a = c10;
        this.f14143b = (char) q7.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f14142a, this.f14143b, this.f14144c);
    }
}
