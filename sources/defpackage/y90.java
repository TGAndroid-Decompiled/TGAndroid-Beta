package defpackage;

import java.util.List;
public final class y90 extends f03 {
    public final String a;
    public final int b;
    public final List c;

    public y90(String str, int i, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f03) {
            y90 y90Var = (y90) ((f03) obj);
            if (this.a.equals(y90Var.a) && this.b == y90Var.b && this.c.equals(y90Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}
