package da;

import java.util.List;
public final class a1 extends h2 {
    public final String f7652a;
    public final int f7653b;
    public final List f7654c;

    public a1(String str, int i7, List list) {
        this.f7652a = str;
        this.f7653b = i7;
        this.f7654c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            a1 a1Var = (a1) ((h2) obj);
            if (this.f7652a.equals(a1Var.f7652a) && this.f7653b == a1Var.f7653b && this.f7654c.equals(a1Var.f7654c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7652a.hashCode() ^ 1000003) * 1000003) ^ this.f7653b) * 1000003) ^ this.f7654c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f7652a + ", importance=" + this.f7653b + ", frames=" + this.f7654c + "}";
    }
}
