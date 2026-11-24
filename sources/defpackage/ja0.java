package defpackage;

import java.util.HashMap;
public final class ja0 {
    public final ti2 a;
    public final HashMap b;

    public ja0(ti2 ti2Var, HashMap hashMap) {
        this.a = ti2Var;
        this.b = hashMap;
    }

    public final long a(cj8 cj8Var, long j, int i) {
        long j2;
        long e = j - this.a.e();
        ka0 ka0Var = (ka0) this.b.get(cj8Var);
        long j3 = ka0Var.a;
        int i2 = i - 1;
        if (j3 > 1) {
            j2 = j3;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j3 * Math.max(1.0d, 9.210340371976184d / Math.log(j2 * i2))), e), ka0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ja0) {
                ja0 ja0Var = (ja0) obj;
                if (this.a.equals(ja0Var.a) && this.b.equals(ja0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
