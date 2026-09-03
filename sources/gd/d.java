package gd;

import java.util.Iterator;
import k7.t8;
public abstract class d implements Iterable {
    public final int f6525a;
    public final int f6526b;
    public final int f6527c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f6525a = i10;
                this.f6526b = t8.a(i10, i11, i12);
                this.f6527c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f6525a, this.f6526b, this.f6527c);
    }
}
