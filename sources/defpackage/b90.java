package defpackage;
public final class b90 extends wy2 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public b90(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wy2) {
            b90 b90Var = (b90) ((wy2) obj);
            if (this.a.equals(b90Var.a) && this.b == b90Var.b && this.c == b90Var.c && this.d == b90Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", defaultProcess=" + this.d + "}";
    }
}
