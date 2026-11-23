package da;

import java.util.List;
public final class a1 extends h2 {
    public final String f7966a;
    public final int f7967b;
    public final List f7968c;

    public a1(String str, int i7, List list) {
        this.f7966a = str;
        this.f7967b = i7;
        this.f7968c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            a1 a1Var = (a1) ((h2) obj);
            if (this.f7966a.equals(a1Var.f7966a) && this.f7967b == a1Var.f7967b && this.f7968c.equals(a1Var.f7968c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7966a.hashCode() ^ 1000003) * 1000003) ^ this.f7967b) * 1000003) ^ this.f7968c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f7966a + ", importance=" + this.f7967b + ", frames=" + this.f7968c + "}";
    }
}
