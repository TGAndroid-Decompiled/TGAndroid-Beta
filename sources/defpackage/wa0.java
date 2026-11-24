package defpackage;
public final class wa0 {
    public final String a;
    public final String b;
    public final String c;
    public final qb0 d;
    public final int e;

    public wa0(String str, String str2, String str3, qb0 qb0Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qb0Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof wa0) {
                wa0 wa0Var = (wa0) obj;
                String str = wa0Var.a;
                String str2 = this.a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                String str3 = wa0Var.b;
                String str4 = this.b;
                if (str4 == null) {
                    if (str3 != null) {
                        return false;
                    }
                } else if (!str4.equals(str3)) {
                    return false;
                }
                String str5 = wa0Var.c;
                String str6 = this.c;
                if (str6 == null) {
                    if (str5 != null) {
                        return false;
                    }
                } else if (!str6.equals(str5)) {
                    return false;
                }
                qb0 qb0Var = wa0Var.d;
                qb0 qb0Var2 = this.d;
                if (qb0Var2 == null) {
                    if (qb0Var != null) {
                        return false;
                    }
                } else if (!qb0Var2.equals(qb0Var)) {
                    return false;
                }
                int i = wa0Var.e;
                int i2 = this.e;
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
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        qb0 qb0Var = this.d;
        if (qb0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = qb0Var.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        int i6 = this.e;
        if (i6 != 0) {
            i = wi8.F(i6);
        }
        return i5 ^ i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        if (i != 1) {
            if (i != 2) {
                str = "null";
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
