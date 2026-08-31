package gd;

import java.util.Iterator;
import k7.u8;
public abstract class a implements Iterable {
    public final char f7015a;
    public final char f7016b;
    public final int f7017c = 1;

    public a(char c3, char c10) {
        this.f7015a = c3;
        this.f7016b = (char) u8.a(c3, c10, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f7015a, this.f7016b, this.f7017c);
    }
}
