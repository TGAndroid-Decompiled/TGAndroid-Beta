package defpackage;

import java.util.List;
public final class a90 extends pz2 {
    public final String a;
    public final int b;
    public final List c;

    public a90(String str, int i, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pz2) {
            a90 a90Var = (a90) ((pz2) obj);
            if (this.a.equals(a90Var.a) && this.b == a90Var.b && this.c.equals(a90Var.c)) {
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
