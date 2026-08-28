package cd;

import g7.u7;
import java.util.Iterator;
public abstract class d implements Iterable {
    public final int f2370a;
    public final int f2371b;
    public final int f2372c;

    public d(int i9, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != Integer.MIN_VALUE) {
                this.f2370a = i9;
                this.f2371b = u7.a(i9, i10, i11);
                this.f2372c = i11;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f2370a, this.f2371b, this.f2372c);
    }
}
