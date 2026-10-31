package od;

import java.util.Iterator;
import v7.q7;
public abstract class d implements Iterable {
    public final int f14147a;
    public final int f14148b;
    public final int f14149c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f14147a = i10;
                this.f14148b = q7.a(i10, i11, i12);
                this.f14149c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f14147a, this.f14148b, this.f14149c);
    }
}
