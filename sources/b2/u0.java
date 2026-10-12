package b2;

import java.util.Arrays;
import java.util.List;
import v7.c8;
public final class u0 {
    public final t0[] f2398a;
    public final long f2399b;

    public u0(t0... t0VarArr) {
        this(-9223372036854775807L, t0VarArr);
    }

    public final u0 a(t0... t0VarArr) {
        if (t0VarArr.length == 0) {
            return this;
        }
        String str = e2.m0.f8372a;
        t0[] t0VarArr2 = this.f2398a;
        Object[] copyOf = Arrays.copyOf(t0VarArr2, t0VarArr2.length + t0VarArr.length);
        System.arraycopy(t0VarArr, 0, copyOf, t0VarArr2.length, t0VarArr.length);
        return new u0(this.f2399b, (t0[]) copyOf);
    }

    public final u0 b(u0 u0Var) {
        if (u0Var == null) {
            return this;
        }
        return a(u0Var.f2398a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (Arrays.equals(this.f2398a, u0Var.f2398a) && this.f2399b == u0Var.f2399b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c8.b(this.f2399b) + (Arrays.hashCode(this.f2398a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f2398a));
        long j10 = this.f2399b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public u0(long j10, t0... t0VarArr) {
        this.f2399b = j10;
        this.f2398a = t0VarArr;
    }

    public u0(List list) {
        this((t0[]) list.toArray(new t0[0]));
    }
}
