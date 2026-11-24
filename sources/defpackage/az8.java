package defpackage;
public final class az8 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public az8(long j, String str, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final az8 a(az8 az8Var, String str) {
        az8 az8Var2;
        String c = jxe.c(str, this.c);
        if (az8Var != null) {
            long j = az8Var.b;
            if (c.equals(jxe.c(str, az8Var.c))) {
                long j2 = this.b;
                long j3 = -1;
                if (j2 != -1) {
                    long j4 = this.a;
                    az8Var2 = null;
                    if (j4 + j2 == az8Var.a) {
                        if (j != -1) {
                            j3 = j2 + j;
                        }
                        return new az8(j4, c, j3);
                    }
                } else {
                    az8Var2 = null;
                }
                if (j != -1) {
                    long j5 = az8Var.a;
                    if (j5 + j == this.a) {
                        if (j2 != -1) {
                            j3 = j + j2;
                        }
                        return new az8(j5, c, j3);
                    }
                }
                return az8Var2;
            }
            return null;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && az8.class == obj.getClass()) {
            az8 az8Var = (az8) obj;
            if (this.a == az8Var.a && this.b == az8Var.b && this.c.equals(az8Var.c)) {
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
        return ls6.p(sb, this.b, ")");
    }
}
