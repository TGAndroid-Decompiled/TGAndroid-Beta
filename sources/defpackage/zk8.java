package defpackage;
public final class zk8 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public zk8(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zk8) {
                zk8 zk8Var = (zk8) obj;
                if (!this.a.equals(zk8Var.a) || this.b != zk8Var.b || this.c != zk8Var.c || this.d != zk8Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
