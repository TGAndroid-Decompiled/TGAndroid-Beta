package defpackage;
public final class ss8 {
    public final int a;
    public final boolean b;

    public ss8(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ss8.class == obj.getClass()) {
                ss8 ss8Var = (ss8) obj;
                if (this.a == ss8Var.a && this.b == ss8Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
