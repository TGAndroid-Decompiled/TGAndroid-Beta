package da;

import java.util.List;
public final class a1 extends h2 {
    public final String f7934a;
    public final int f7935b;
    public final List f7936c;

    public a1(String str, int i7, List list) {
        this.f7934a = str;
        this.f7935b = i7;
        this.f7936c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            a1 a1Var = (a1) ((h2) obj);
            if (this.f7934a.equals(a1Var.f7934a) && this.f7935b == a1Var.f7935b && this.f7936c.equals(a1Var.f7936c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7934a.hashCode() ^ 1000003) * 1000003) ^ this.f7935b) * 1000003) ^ this.f7936c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f7934a + ", importance=" + this.f7935b + ", frames=" + this.f7936c + "}";
    }
}
