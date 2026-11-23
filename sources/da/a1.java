package da;

import java.util.List;
public final class a1 extends h2 {
    public final String f7929a;
    public final int f7930b;
    public final List f7931c;

    public a1(String str, int i7, List list) {
        this.f7929a = str;
        this.f7930b = i7;
        this.f7931c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            a1 a1Var = (a1) ((h2) obj);
            if (this.f7929a.equals(a1Var.f7929a) && this.f7930b == a1Var.f7930b && this.f7931c.equals(a1Var.f7931c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7929a.hashCode() ^ 1000003) * 1000003) ^ this.f7930b) * 1000003) ^ this.f7931c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f7929a + ", importance=" + this.f7930b + ", frames=" + this.f7931c + "}";
    }
}
