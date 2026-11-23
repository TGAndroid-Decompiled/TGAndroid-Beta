package gb;
public final class b0 {
    public static final a0 Companion = new Object();
    public final int f13286a;
    public final String f13287b;

    public b0(int i7, int i10, String str) {
        if (3 != (i7 & 3)) {
            oe.k.a(i7, 3, z.f13437a.d());
            throw null;
        }
        this.f13286a = i10;
        this.f13287b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f13286a == b0Var.f13286a && kotlin.jvm.internal.j.a(this.f13287b, b0Var.f13287b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13287b.hashCode() + (this.f13286a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.f13286a + ", uuid=" + this.f13287b + ')';
    }

    public b0(int i7, String uuid) {
        kotlin.jvm.internal.j.e(uuid, "uuid");
        this.f13286a = i7;
        this.f13287b = uuid;
    }
}
