package ca;

import ag.j2;
import m1.j;
public final class b {
    public final String f3017a;
    public final long f3018b;
    public final int f3019c;

    public b(String str, long j10, int i10) {
        this.f3017a = str;
        this.f3018b = j10;
        this.f3019c = i10;
    }

    public static j2 a() {
        j2 j2Var = new j2((char) 0, 2);
        j2Var.d = 0L;
        return j2Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = bVar.f3019c;
                String str = bVar.f3017a;
                String str2 = this.f3017a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f3018b == bVar.f3018b) {
                    int i11 = this.f3019c;
                    if (i11 == 0) {
                        if (i10 == 0) {
                            return true;
                        }
                        return false;
                    } else if (j.a(i11, i10)) {
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
        String str = this.f3017a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f3018b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i12 = this.f3019c;
        if (i12 != 0) {
            i10 = j.b(i12);
        }
        return i10 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f3017a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f3018b);
        sb2.append(", responseCode=");
        int i10 = this.f3019c;
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
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
