package gd;

import java.util.Iterator;
import k7.u8;
public abstract class d implements Iterable {
    public final int f7022a;
    public final int f7023b;
    public final int f7024c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f7022a = i10;
                this.f7023b = u8.a(i10, i11, i12);
                this.f7024c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f7022a, this.f7023b, this.f7024c);
    }
}
