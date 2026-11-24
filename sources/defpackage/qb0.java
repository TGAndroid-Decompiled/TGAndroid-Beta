package defpackage;
public final class qb0 {
    public final String a;
    public final long b;
    public final int c;

    public qb0(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof qb0) {
                qb0 qb0Var = (qb0) obj;
                String str = qb0Var.a;
                String str2 = this.a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.b == qb0Var.b) {
                    int i = qb0Var.c;
                    int i2 = this.c;
                    if (i2 == 0) {
                        if (i == 0) {
                            return true;
                        }
                        return false;
                    } else if (wi8.c(i2, i)) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i3 = this.c;
        if (i3 != 0) {
            i = wi8.F(i3);
        }
        return i2 ^ i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "null";
                } else {
                    str = "AUTH_ERROR";
                }
            } else {
                str = "BAD_CONFIG";
            }
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
