package defpackage;
public final class n29 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public n29(long j, long j2, String str) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final n29 a(n29 n29Var, String str) {
        n29 n29Var2;
        long j;
        String c = d2f.c(str, this.c);
        if (n29Var != null) {
            long j2 = n29Var.b;
            if (c.equals(d2f.c(str, n29Var.c))) {
                long j3 = this.b;
                long j4 = -1;
                if (j3 != -1) {
                    j = j2;
                    long j5 = this.a;
                    n29Var2 = null;
                    if (j5 + j3 == n29Var.a) {
                        if (j != -1) {
                            j4 = j3 + j;
                        }
                        return new n29(j5, j4, c);
                    }
                } else {
                    n29Var2 = null;
                    j = j2;
                }
                if (j != -1) {
                    long j6 = n29Var.a;
                    if (j6 + j == this.a) {
                        if (j3 != -1) {
                            j4 = j + j3;
                        }
                        return new n29(j6, j4, c);
                    }
                }
                return n29Var2;
            }
            return null;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n29.class == obj.getClass()) {
            n29 n29Var = (n29) obj;
            if (this.a == n29Var.a && this.b == n29Var.b && this.c.equals(n29Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int hashCode = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
            this.d = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return qu6.p(sb, this.b, ")");
    }
}
