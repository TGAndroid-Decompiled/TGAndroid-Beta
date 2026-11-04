package db;
public final class a0 {
    public static final z Companion = new Object();
    public final int f8599a;
    public final String f8600b;

    public a0(int i3, int i10, String str) {
        if (3 != (i3 & 3)) {
            le.k.a(i3, 3, y.f8756a.d());
            throw null;
        }
        this.f8599a = i10;
        this.f8600b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f8599a == a0Var.f8599a && kotlin.jvm.internal.j.a(this.f8600b, a0Var.f8600b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8600b.hashCode() + (this.f8599a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.f8599a + ", uuid=" + this.f8600b + ')';
    }

    public a0(int i3, String uuid) {
        kotlin.jvm.internal.j.e(uuid, "uuid");
        this.f8599a = i3;
        this.f8600b = uuid;
    }
}
