package defpackage;

import java.util.Iterator;
public final class fp5 implements Iterable {
    public static final fp5 d = new fp5(1, 0, 1);
    public final int a;
    public final int b;
    public final int c;

    public fp5(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i;
                this.b = ore.a(i, i2, i3);
                this.c = i3;
                return;
            }
            w26.j("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        w26.j("Step must be non-zero.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fp5) {
            if (!isEmpty() || !((fp5) obj).isEmpty()) {
                fp5 fp5Var = (fp5) obj;
                if (this.a == fp5Var.a && this.b == fp5Var.b) {
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
        return new ep5(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
