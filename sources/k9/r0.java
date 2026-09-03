package k9;

import java.util.List;
public final class r0 extends r1 {
    public final String f10211a;
    public final int f10212b;
    public final List f10213c;

    public r0(String str, int i10, List list) {
        this.f10211a = str;
        this.f10212b = i10;
        this.f10213c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f10211a.equals(r0Var.f10211a) && this.f10212b == r0Var.f10212b && this.f10213c.equals(r0Var.f10213c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10211a.hashCode() ^ 1000003) * 1000003) ^ this.f10212b) * 1000003) ^ this.f10213c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f10211a + ", importance=" + this.f10212b + ", frames=" + this.f10213c + "}";
    }
}
