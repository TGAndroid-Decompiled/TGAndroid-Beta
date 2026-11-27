package defpackage;
public final class io8 {
    public static final ho8 Companion = new Object();
    public final int a;
    public final String b;

    public io8(int i, int i2, String str) {
        if (3 == (i & 3)) {
            this.a = i2;
            this.b = str;
            return;
        }
        sve.a(i, 3, go8.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io8)) {
            return false;
        }
        io8 io8Var = (io8) obj;
        if (this.a == io8Var.a && ur5.a(this.b, io8Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.a + ", uuid=" + this.b + ')';
    }

    public io8(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
