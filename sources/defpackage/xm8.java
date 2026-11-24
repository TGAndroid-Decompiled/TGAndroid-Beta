package defpackage;
public final class xm8 {
    public static final wm8 Companion = new Object();
    public final int a;
    public final String b;

    public xm8(int i, int i2, String str) {
        if (3 == (i & 3)) {
            this.a = i2;
            this.b = str;
            return;
        }
        dte.a(i, 3, vm8.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm8)) {
            return false;
        }
        xm8 xm8Var = (xm8) obj;
        if (this.a == xm8Var.a && rr5.a(this.b, xm8Var.b)) {
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

    public xm8(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
