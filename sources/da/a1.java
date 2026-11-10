package da;

import java.util.List;
public final class a1 extends h2 {
    public final String f8268a;
    public final int f8269b;
    public final List f8270c;

    public a1(String str, int i7, List list) {
        this.f8268a = str;
        this.f8269b = i7;
        this.f8270c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            a1 a1Var = (a1) ((h2) obj);
            if (this.f8268a.equals(a1Var.f8268a) && this.f8269b == a1Var.f8269b && this.f8270c.equals(a1Var.f8270c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8268a.hashCode() ^ 1000003) * 1000003) ^ this.f8269b) * 1000003) ^ this.f8270c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f8268a + ", importance=" + this.f8269b + ", frames=" + this.f8270c + "}";
    }
}
