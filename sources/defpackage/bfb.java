package defpackage;
public final class bfb {
    public static final bfb e = new bfb(false, new yeb(Integer.MIN_VALUE, -2147483647), efb.T, 0.0f);
    public final boolean a;
    public final yeb b;
    public final qeb c;
    public final float d;

    public bfb(boolean z, yeb yebVar, qeb qebVar, float f) {
        this.a = z;
        this.b = yebVar;
        this.c = qebVar;
        this.d = f;
    }

    public final qeb a(boolean z) {
        qeb qebVar = efb.T;
        qeb qebVar2 = this.c;
        if (qebVar2 != qebVar) {
            return qebVar2;
        }
        if (this.d == 0.0f) {
            if (z) {
                return efb.U;
            }
            return efb.V;
        }
        return efb.W;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && bfb.class == obj.getClass()) {
                bfb bfbVar = (bfb) obj;
                if (this.c.equals(bfbVar.c) && this.b.equals(bfbVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
