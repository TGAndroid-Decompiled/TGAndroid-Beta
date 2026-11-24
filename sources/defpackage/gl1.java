package defpackage;

import java.util.Iterator;
public final class gl1 implements Iterable {
    public final char a;
    public final char b;

    static {
        new gl1((char) 1, (char) 0);
    }

    public gl1(char c, char c2) {
        this.a = c;
        this.b = (char) rte.a(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gl1) {
            char c = this.a;
            char c2 = this.b;
            if (rr5.b(c, c2) > 0) {
                gl1 gl1Var = (gl1) obj;
                if (rr5.b(gl1Var.a, gl1Var.b) > 0) {
                    return true;
                }
            }
            gl1 gl1Var2 = (gl1) obj;
            if (c == gl1Var2.a && c2 == gl1Var2.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        char c = this.a;
        char c2 = this.b;
        if (rr5.b(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    @Override
    public final Iterator iterator() {
        return new fl1(this.a, this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
