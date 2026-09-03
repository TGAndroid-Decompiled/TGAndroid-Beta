package gd;

import java.util.Iterator;
import k7.t8;
public abstract class a implements Iterable {
    public final char f6519a;
    public final char f6520b;
    public final int f6521c = 1;

    public a(char c3, char c10) {
        this.f6519a = c3;
        this.f6520b = (char) t8.a(c3, c10, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f6519a, this.f6520b, this.f6521c);
    }
}
