package b2;

import a8.fd;
import java.util.Arrays;
import java.util.List;
public final class u0 {
    public final t0[] f3465a;
    public final long f3466b;

    public u0(t0... t0VarArr) {
        this(-9223372036854775807L, t0VarArr);
    }

    public final u0 a(t0... t0VarArr) {
        if (t0VarArr.length == 0) {
            return this;
        }
        String str = e2.n0.f9691a;
        t0[] t0VarArr2 = this.f3465a;
        Object[] copyOf = Arrays.copyOf(t0VarArr2, t0VarArr2.length + t0VarArr.length);
        System.arraycopy(t0VarArr, 0, copyOf, t0VarArr2.length, t0VarArr.length);
        return new u0(this.f3466b, (t0[]) copyOf);
    }

    public final u0 b(u0 u0Var) {
        if (u0Var == null) {
            return this;
        }
        return a(u0Var.f3465a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (Arrays.equals(this.f3465a, u0Var.f3465a) && this.f3466b == u0Var.f3466b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return fd.b(this.f3466b) + (Arrays.hashCode(this.f3465a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f3465a));
        long j10 = this.f3466b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public u0(long j10, t0... t0VarArr) {
        this.f3466b = j10;
        this.f3465a = t0VarArr;
    }

    public u0(List list) {
        this((t0[]) list.toArray(new t0[0]));
    }
}
