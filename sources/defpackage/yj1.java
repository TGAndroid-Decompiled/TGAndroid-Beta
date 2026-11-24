package defpackage;

import java.util.Iterator;
public final class yj1 implements Iterable {
    public final char a;
    public final char b;

    static {
        new yj1((char) 1, (char) 0);
    }

    public yj1(char c, char c2) {
        this.a = c;
        this.b = (char) ore.a(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yj1) {
            char c = this.a;
            char c2 = this.b;
            if (rp5.b(c, c2) > 0) {
                yj1 yj1Var = (yj1) obj;
                if (rp5.b(yj1Var.a, yj1Var.b) > 0) {
                    return true;
                }
            }
            yj1 yj1Var2 = (yj1) obj;
            if (c == yj1Var2.a && c2 == yj1Var2.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        char c = this.a;
        char c2 = this.b;
        if (rp5.b(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    @Override
    public final Iterator iterator() {
        return new xj1(this.a, this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
