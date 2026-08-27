package dd;

import h7.x7;
import java.util.Iterator;

public abstract class d implements Iterable {

    public final int f4914a;

    public final int f4915b;

    public final int f4916c;

    public d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4914a = i10;
        this.f4915b = x7.a(i10, i11, i12);
        this.f4916c = i12;
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f4914a, this.f4915b, this.f4916c);
    }
}
