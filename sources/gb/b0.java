package gb;
public final class b0 {
    public static final a0 Companion = new Object();
    public final int f13323a;
    public final String f13324b;

    public b0(int i7, int i10, String str) {
        if (3 != (i7 & 3)) {
            oe.k.a(i7, 3, z.f13474a.d());
            throw null;
        }
        this.f13323a = i10;
        this.f13324b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f13323a == b0Var.f13323a && kotlin.jvm.internal.j.a(this.f13324b, b0Var.f13324b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13324b.hashCode() + (this.f13323a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.f13323a + ", uuid=" + this.f13324b + ')';
    }

    public b0(int i7, String uuid) {
        kotlin.jvm.internal.j.e(uuid, "uuid");
        this.f13323a = i7;
        this.f13324b = uuid;
    }
}
