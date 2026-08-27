package h9;

import java.util.List;

public final class r0 extends r1 {

    public final String f8806a;

    public final int f8807b;

    public final List f8808c;

    public r0(String str, int i10, List list) {
        this.f8806a = str;
        this.f8807b = i10;
        this.f8808c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f8806a.equals(r0Var.f8806a) && this.f8807b == r0Var.f8807b && this.f8808c.equals(r0Var.f8808c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8806a.hashCode() ^ 1000003) * 1000003) ^ this.f8807b) * 1000003) ^ this.f8808c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f8806a + ", importance=" + this.f8807b + ", frames=" + this.f8808c + "}";
    }
}
