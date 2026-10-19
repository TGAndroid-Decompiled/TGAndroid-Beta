package b2;

import java.util.Arrays;
import java.util.List;
import v7.c8;
public final class t0 {
    public final s0[] f4009a;
    public final long f4010b;

    public t0(s0... s0VarArr) {
        this(-9223372036854775807L, s0VarArr);
    }

    public final t0 a(s0... s0VarArr) {
        if (s0VarArr.length == 0) {
            return this;
        }
        String str = e2.m0.f8254a;
        s0[] s0VarArr2 = this.f4009a;
        Object[] copyOf = Arrays.copyOf(s0VarArr2, s0VarArr2.length + s0VarArr.length);
        System.arraycopy(s0VarArr, 0, copyOf, s0VarArr2.length, s0VarArr.length);
        return new t0(this.f4010b, (s0[]) copyOf);
    }

    public final t0 b(t0 t0Var) {
        if (t0Var == null) {
            return this;
        }
        return a(t0Var.f4009a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            if (Arrays.equals(this.f4009a, t0Var.f4009a) && this.f4010b == t0Var.f4010b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c8.b(this.f4010b) + (Arrays.hashCode(this.f4009a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f4009a));
        long j10 = this.f4010b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public t0(long j10, s0... s0VarArr) {
        this.f4010b = j10;
        this.f4009a = s0VarArr;
    }

    public t0(List list) {
        this((s0[]) list.toArray(new s0[0]));
    }
}
