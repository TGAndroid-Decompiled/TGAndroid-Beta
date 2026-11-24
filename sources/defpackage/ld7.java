package defpackage;

import java.util.Arrays;
import java.util.List;
public final class ld7 {
    public final jd7[] a;
    public final long b;

    public ld7(List list) {
        this((jd7[]) list.toArray(new jd7[0]));
    }

    public final ld7 a(jd7... jd7VarArr) {
        if (jd7VarArr.length == 0) {
            return this;
        }
        String str = g8c.a;
        jd7[] jd7VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(jd7VarArr2, jd7VarArr2.length + jd7VarArr.length);
        System.arraycopy(jd7VarArr, 0, copyOf, jd7VarArr2.length, jd7VarArr.length);
        return new ld7(this.b, (jd7[]) copyOf);
    }

    public final ld7 b(ld7 ld7Var) {
        if (ld7Var == null) {
            return this;
        }
        return a(ld7Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ld7.class == obj.getClass()) {
            ld7 ld7Var = (ld7) obj;
            if (Arrays.equals(this.a, ld7Var.a) && this.b == ld7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zne.b(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String n;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            n = "";
        } else {
            n = ls6.n(j, ", presentationTimeUs=");
        }
        sb.append(n);
        return sb.toString();
    }

    public ld7(long j, jd7... jd7VarArr) {
        this.b = j;
        this.a = jd7VarArr;
    }

    public ld7(jd7... jd7VarArr) {
        this(-9223372036854775807L, jd7VarArr);
    }
}
