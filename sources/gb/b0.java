package gb;
public final class b0 {
    public static final a0 Companion = new Object();
    public final int f13629a;
    public final String f13630b;

    public b0(int i7, int i10, String str) {
        if (3 != (i7 & 3)) {
            oe.k.a(i7, 3, z.f13786a.d());
            throw null;
        }
        this.f13629a = i10;
        this.f13630b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f13629a == b0Var.f13629a && kotlin.jvm.internal.j.a(this.f13630b, b0Var.f13630b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13630b.hashCode() + (this.f13629a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.f13629a + ", uuid=" + this.f13630b + ')';
    }

    public b0(int i7, String uuid) {
        kotlin.jvm.internal.j.e(uuid, "uuid");
        this.f13629a = i7;
        this.f13630b = uuid;
    }
}
