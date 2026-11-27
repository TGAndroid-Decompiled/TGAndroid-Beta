package defpackage;

import java.util.HashMap;
public final class la0 {
    public final pj2 a;
    public final HashMap b;

    public la0(pj2 pj2Var, HashMap hashMap) {
        this.a = pj2Var;
        this.b = hashMap;
    }

    public final long a(pm8 pm8Var, long j, int i) {
        long j2;
        long e = j - this.a.e();
        ma0 ma0Var = (ma0) this.b.get(pm8Var);
        long j3 = ma0Var.a;
        int i2 = i - 1;
        if (j3 > 1) {
            j2 = j3;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j3 * Math.max(1.0d, 9.210340371976184d / Math.log(j2 * i2))), e), ma0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof la0) {
                la0 la0Var = (la0) obj;
                if (this.a.equals(la0Var.a) && this.b.equals(la0Var.b)) {
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
