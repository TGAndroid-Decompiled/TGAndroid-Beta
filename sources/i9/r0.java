package i9;

import java.util.List;
public final class r0 extends r1 {
    public final String f8770a;
    public final int f8771b;
    public final List f8772c;

    public r0(String str, int i10, List list) {
        this.f8770a = str;
        this.f8771b = i10;
        this.f8772c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f8770a.equals(r0Var.f8770a) && this.f8771b == r0Var.f8771b && this.f8772c.equals(r0Var.f8772c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8770a.hashCode() ^ 1000003) * 1000003) ^ this.f8771b) * 1000003) ^ this.f8772c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f8770a + ", importance=" + this.f8771b + ", frames=" + this.f8772c + "}";
    }
}
