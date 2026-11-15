package gb;
public final class b0 {
    public static final a0 Companion = new Object();
    public final int f12977a;
    public final String f12978b;

    public b0(int i7, int i10, String str) {
        if (3 != (i7 & 3)) {
            oe.k.a(i7, 3, z.f13128a.d());
            throw null;
        }
        this.f12977a = i10;
        this.f12978b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f12977a == b0Var.f12977a && kotlin.jvm.internal.j.a(this.f12978b, b0Var.f12978b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12978b.hashCode() + (this.f12977a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.f12977a + ", uuid=" + this.f12978b + ')';
    }

    public b0(int i7, String uuid) {
        kotlin.jvm.internal.j.e(uuid, "uuid");
        this.f12977a = i7;
        this.f12978b = uuid;
    }
}
