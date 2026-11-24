package defpackage;

import java.util.Iterator;
public final class fr5 implements Iterable {
    public static final fr5 d = new fr5(1, 0, 1);
    public final int a;
    public final int b;
    public final int c;

    public fr5(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i;
                this.b = rte.a(i, i2, i3);
                this.c = i3;
                return;
            }
            u36.j("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        u36.j("Step must be non-zero.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fr5) {
            if (!isEmpty() || !((fr5) obj).isEmpty()) {
                fr5 fr5Var = (fr5) obj;
                if (this.a == fr5Var.a && this.b == fr5Var.b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    public final boolean isEmpty() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return new er5(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
