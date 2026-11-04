package db;
public final class e0 {
    public final String f8641a;
    public final int f8642b;
    public final int f8643c;
    public final boolean d;

    public e0(int i3, int i10, String str, boolean z10) {
        this.f8641a = str;
        this.f8642b = i3;
        this.f8643c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (kotlin.jvm.internal.j.a(this.f8641a, e0Var.f8641a) && this.f8642b == e0Var.f8642b && this.f8643c == e0Var.f8643c && this.d == e0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = ((((this.f8641a.hashCode() * 31) + this.f8642b) * 31) + this.f8643c) * 31;
        if (this.d) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f8641a + ", pid=" + this.f8642b + ", importance=" + this.f8643c + ", isDefaultProcess=" + this.d + ')';
    }
}
