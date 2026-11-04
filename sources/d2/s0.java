package d2;

import b8.pd;
import java.util.Arrays;
import java.util.List;
public final class s0 {
    public final r0[] f8366a;
    public final long f8367b;

    public s0(r0... r0VarArr) {
        this(-9223372036854775807L, r0VarArr);
    }

    public final s0 a(r0... r0VarArr) {
        if (r0VarArr.length == 0) {
            return this;
        }
        String str = g2.n0.f11873a;
        r0[] r0VarArr2 = this.f8366a;
        Object[] copyOf = Arrays.copyOf(r0VarArr2, r0VarArr2.length + r0VarArr.length);
        System.arraycopy(r0VarArr, 0, copyOf, r0VarArr2.length, r0VarArr.length);
        return new s0(this.f8367b, (r0[]) copyOf);
    }

    public final s0 b(s0 s0Var) {
        if (s0Var == null) {
            return this;
        }
        return a(s0Var.f8366a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s0.class == obj.getClass()) {
            s0 s0Var = (s0) obj;
            if (Arrays.equals(this.f8366a, s0Var.f8366a) && this.f8367b == s0Var.f8367b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return pd.b(this.f8367b) + (Arrays.hashCode(this.f8366a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f8366a));
        long j10 = this.f8367b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public s0(long j10, r0... r0VarArr) {
        this.f8367b = j10;
        this.f8366a = r0VarArr;
    }

    public s0(List list) {
        this((r0[]) list.toArray(new r0[0]));
    }
}
