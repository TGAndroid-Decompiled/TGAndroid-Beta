package defpackage;

import java.util.Arrays;
import java.util.List;
public final class uf7 {
    public final sf7[] a;
    public final long b;

    public uf7(List list) {
        this((sf7[]) list.toArray(new sf7[0]));
    }

    public final uf7 a(sf7... sf7VarArr) {
        if (sf7VarArr.length == 0) {
            return this;
        }
        String str = gcc.a;
        sf7[] sf7VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(sf7VarArr2, sf7VarArr2.length + sf7VarArr.length);
        System.arraycopy(sf7VarArr, 0, copyOf, sf7VarArr2.length, sf7VarArr.length);
        return new uf7(this.b, (sf7[]) copyOf);
    }

    public final uf7 b(uf7 uf7Var) {
        if (uf7Var == null) {
            return this;
        }
        return a(uf7Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uf7.class == obj.getClass()) {
            uf7 uf7Var = (uf7) obj;
            if (Arrays.equals(this.a, uf7Var.a) && this.b == uf7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return tse.b(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String n;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            n = "";
        } else {
            n = qu6.n(j, ", presentationTimeUs=");
        }
        sb.append(n);
        return sb.toString();
    }

    public uf7(long j, sf7... sf7VarArr) {
        this.b = j;
        this.a = sf7VarArr;
    }

    public uf7(sf7... sf7VarArr) {
        this(-9223372036854775807L, sf7VarArr);
    }
}
