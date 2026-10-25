package aa;

import java.util.List;
public final class t0 extends t1 {
    public final String f1202a;
    public final int f1203b;
    public final List f1204c;

    public t0(String str, int i10, List list) {
        this.f1202a = str;
        this.f1203b = i10;
        this.f1204c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f1202a.equals(t0Var.f1202a) && this.f1203b == t0Var.f1203b && this.f1204c.equals(t0Var.f1204c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1202a.hashCode() ^ 1000003) * 1000003) ^ this.f1203b) * 1000003) ^ this.f1204c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f1202a + ", importance=" + this.f1203b + ", frames=" + this.f1204c + "}";
    }
}
