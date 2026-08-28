package g9;

import java.util.List;
public final class r0 extends r1 {
    public final String f7635a;
    public final int f7636b;
    public final List f7637c;

    public r0(String str, int i9, List list) {
        this.f7635a = str;
        this.f7636b = i9;
        this.f7637c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            r0 r0Var = (r0) ((r1) obj);
            if (this.f7635a.equals(r0Var.f7635a) && this.f7636b == r0Var.f7636b && this.f7637c.equals(r0Var.f7637c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7635a.hashCode() ^ 1000003) * 1000003) ^ this.f7636b) * 1000003) ^ this.f7637c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f7635a + ", importance=" + this.f7636b + ", frames=" + this.f7637c + "}";
    }
}
