package e2;

import java.util.Arrays;
import java.util.List;
public final class q0 {
    public final p0[] f10638a;
    public final long f10639b;

    public q0(p0... p0VarArr) {
        this(-9223372036854775807L, p0VarArr);
    }

    public final q0 a(p0... p0VarArr) {
        if (p0VarArr.length == 0) {
            return this;
        }
        String str = h2.l0.f13786a;
        p0[] p0VarArr2 = this.f10638a;
        Object[] copyOf = Arrays.copyOf(p0VarArr2, p0VarArr2.length + p0VarArr.length);
        System.arraycopy(p0VarArr, 0, copyOf, p0VarArr2.length, p0VarArr.length);
        return new q0(this.f10639b, (p0[]) copyOf);
    }

    public final q0 b(q0 q0Var) {
        if (q0Var == null) {
            return this;
        }
        return a(q0Var.f10638a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (Arrays.equals(this.f10638a, q0Var.f10638a) && this.f10639b == q0Var.f10639b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c8.l1.b(this.f10639b) + (Arrays.hashCode(this.f10638a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f10638a));
        long j3 = this.f10639b;
        if (j3 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j3;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public q0(long j3, p0... p0VarArr) {
        this.f10639b = j3;
        this.f10638a = p0VarArr;
    }

    public q0(List list) {
        this((p0[]) list.toArray(new p0[0]));
    }
}
