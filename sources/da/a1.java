package da;

import java.util.List;
public final class a1 extends h2 {
    public final String f7963a;
    public final int f7964b;
    public final List f7965c;

    public a1(String str, int i7, List list) {
        this.f7963a = str;
        this.f7964b = i7;
        this.f7965c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            a1 a1Var = (a1) ((h2) obj);
            if (this.f7963a.equals(a1Var.f7963a) && this.f7964b == a1Var.f7964b && this.f7965c.equals(a1Var.f7965c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7963a.hashCode() ^ 1000003) * 1000003) ^ this.f7964b) * 1000003) ^ this.f7965c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f7963a + ", importance=" + this.f7964b + ", frames=" + this.f7965c + "}";
    }
}
