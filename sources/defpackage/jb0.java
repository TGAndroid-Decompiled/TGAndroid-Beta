package defpackage;

import java.util.HashMap;
public final class jb0 {
    public final hk2 a;
    public final HashMap b;

    public jb0(hk2 hk2Var, HashMap hashMap) {
        this.a = hk2Var;
        this.b = hashMap;
    }

    public final long a(fl8 fl8Var, long j, int i) {
        long j2;
        long a = j - this.a.a();
        kb0 kb0Var = (kb0) this.b.get(fl8Var);
        long j3 = kb0Var.a;
        int i2 = i - 1;
        if (j3 > 1) {
            j2 = j3;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j3 * Math.max(1.0d, 9.210340371976184d / Math.log(j2 * i2))), a), kb0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof jb0) {
                jb0 jb0Var = (jb0) obj;
                if (this.a.equals(jb0Var.a) && this.b.equals(jb0Var.b)) {
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
