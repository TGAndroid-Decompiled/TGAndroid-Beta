package ed;

import i7.l8;
import java.util.Iterator;
public abstract class d implements Iterable {
    public final int f5882a;
    public final int f5883b;
    public final int f5884c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f5882a = i10;
                this.f5883b = l8.a(i10, i11, i12);
                this.f5884c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f5882a, this.f5883b, this.f5884c);
    }
}
