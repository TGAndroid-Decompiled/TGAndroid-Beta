package ea;

import b4.e0;
import m1.j;
public final class b {
    public final String f5010a;
    public final long f5011b;
    public final int f5012c;

    public b(String str, long j10, int i10) {
        this.f5010a = str;
        this.f5011b = j10;
        this.f5012c = i10;
    }

    public static e0 a() {
        e0 e0Var = new e0((char) 0, 6);
        e0Var.d = 0L;
        return e0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = bVar.f5012c;
                String str = bVar.f5010a;
                String str2 = this.f5010a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f5011b == bVar.f5011b) {
                    int i11 = this.f5012c;
                    if (i11 == 0) {
                        if (i10 == 0) {
                            return true;
                        }
                        return false;
                    } else if (j.b(i11, i10)) {
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
        int i10 = 0;
        String str = this.f5010a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f5011b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i12 = this.f5012c;
        if (i12 != 0) {
            i10 = j.c(i12);
        }
        return i10 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f5010a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f5011b);
        sb.append(", responseCode=");
        int i10 = this.f5012c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
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
