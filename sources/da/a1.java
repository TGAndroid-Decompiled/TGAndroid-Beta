package da;

import java.util.List;
public final class a1 extends h2 {
    public final String f7928a;
    public final int f7929b;
    public final List f7930c;

    public a1(String str, int i7, List list) {
        this.f7928a = str;
        this.f7929b = i7;
        this.f7930c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            a1 a1Var = (a1) ((h2) obj);
            if (this.f7928a.equals(a1Var.f7928a) && this.f7929b == a1Var.f7929b && this.f7930c.equals(a1Var.f7930c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7928a.hashCode() ^ 1000003) * 1000003) ^ this.f7929b) * 1000003) ^ this.f7930c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f7928a + ", importance=" + this.f7929b + ", frames=" + this.f7930c + "}";
    }
}
