package k9;

import java.util.List;
public final class r0 extends r1 {
    public final String f10990a;
    public final int f10991b;
    public final List f10992c;

    public r0(String str, int i10, List list) {
        this.f10990a = str;
        this.f10991b = i10;
        this.f10992c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f10990a.equals(r0Var.f10990a) && this.f10991b == r0Var.f10991b && this.f10992c.equals(r0Var.f10992c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10990a.hashCode() ^ 1000003) * 1000003) ^ this.f10991b) * 1000003) ^ this.f10992c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f10990a + ", importance=" + this.f10991b + ", frames=" + this.f10992c + "}";
    }
}
