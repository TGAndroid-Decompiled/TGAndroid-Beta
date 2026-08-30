package k9;

import java.util.List;
public final class r0 extends r1 {
    public final String f10231a;
    public final int f10232b;
    public final List f10233c;

    public r0(String str, int i10, List list) {
        this.f10231a = str;
        this.f10232b = i10;
        this.f10233c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f10231a.equals(r0Var.f10231a) && this.f10232b == r0Var.f10232b && this.f10233c.equals(r0Var.f10233c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10231a.hashCode() ^ 1000003) * 1000003) ^ this.f10232b) * 1000003) ^ this.f10233c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f10231a + ", importance=" + this.f10232b + ", frames=" + this.f10233c + "}";
    }
}
