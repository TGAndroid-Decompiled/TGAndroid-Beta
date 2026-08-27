package dd;

import h7.x7;
import java.util.Iterator;

public abstract class a implements Iterable {

    public final char f4907a;

    public final char f4908b;

    public final int f4909c = 1;

    public a(char c10, char c11) {
        this.f4907a = c10;
        this.f4908b = (char) x7.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f4907a, this.f4908b, this.f4909c);
    }
}
