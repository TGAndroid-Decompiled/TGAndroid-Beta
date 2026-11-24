package defpackage;

import java.util.List;
public final class y80 extends uy2 {
    public final String a;
    public final int b;
    public final List c;

    public y80(String str, int i, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uy2) {
            y80 y80Var = (y80) ((uy2) obj);
            if (this.a.equals(y80Var.a) && this.b == y80Var.b && this.c.equals(y80Var.c)) {
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
