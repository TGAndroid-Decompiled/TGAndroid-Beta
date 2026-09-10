package b2;

import java.util.Arrays;
import java.util.List;
import v7.z7;
public final class p0 {
    public final o0[] f1871a;
    public final long f1872b;

    public p0(o0... o0VarArr) {
        this(-9223372036854775807L, o0VarArr);
    }

    public final p0 a(o0... o0VarArr) {
        if (o0VarArr.length == 0) {
            return this;
        }
        String str = e2.d0.f7188a;
        o0[] o0VarArr2 = this.f1871a;
        Object[] copyOf = Arrays.copyOf(o0VarArr2, o0VarArr2.length + o0VarArr.length);
        System.arraycopy(o0VarArr, 0, copyOf, o0VarArr2.length, o0VarArr.length);
        return new p0(this.f1872b, (o0[]) copyOf);
    }

    public final p0 b(p0 p0Var) {
        if (p0Var == null) {
            return this;
        }
        return a(p0Var.f1871a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p0.class == obj.getClass()) {
            p0 p0Var = (p0) obj;
            if (Arrays.equals(this.f1871a, p0Var.f1871a) && this.f1872b == p0Var.f1872b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return z7.b(this.f1872b) + (Arrays.hashCode(this.f1871a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f1871a));
        long j3 = this.f1872b;
        if (j3 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j3;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public p0(long j3, o0... o0VarArr) {
        this.f1872b = j3;
        this.f1871a = o0VarArr;
    }

    public p0(List list) {
        this((o0[]) list.toArray(new o0[0]));
    }
}
