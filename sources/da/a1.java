package da;

import java.util.List;
public final class a1 extends h2 {
    public final String f8263a;
    public final int f8264b;
    public final List f8265c;

    public a1(String str, int i7, List list) {
        this.f8263a = str;
        this.f8264b = i7;
        this.f8265c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            a1 a1Var = (a1) ((h2) obj);
            if (this.f8263a.equals(a1Var.f8263a) && this.f8264b == a1Var.f8264b && this.f8265c.equals(a1Var.f8265c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8263a.hashCode() ^ 1000003) * 1000003) ^ this.f8264b) * 1000003) ^ this.f8265c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f8263a + ", importance=" + this.f8264b + ", frames=" + this.f8265c + "}";
    }
}
