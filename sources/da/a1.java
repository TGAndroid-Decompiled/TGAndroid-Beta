package da;

import java.util.List;
public final class a1 extends h2 {
    public final String f7937a;
    public final int f7938b;
    public final List f7939c;

    public a1(String str, int i7, List list) {
        this.f7937a = str;
        this.f7938b = i7;
        this.f7939c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            a1 a1Var = (a1) ((h2) obj);
            if (this.f7937a.equals(a1Var.f7937a) && this.f7938b == a1Var.f7938b && this.f7939c.equals(a1Var.f7939c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7937a.hashCode() ^ 1000003) * 1000003) ^ this.f7938b) * 1000003) ^ this.f7939c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f7937a + ", importance=" + this.f7938b + ", frames=" + this.f7939c + "}";
    }
}
