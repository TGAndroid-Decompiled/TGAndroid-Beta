package od;

import java.util.Iterator;
import v7.q7;
public abstract class d implements Iterable {
    public final int f14148a;
    public final int f14149b;
    public final int f14150c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f14148a = i10;
                this.f14149b = q7.a(i10, i11, i12);
                this.f14150c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f14148a, this.f14149b, this.f14150c);
    }
}
