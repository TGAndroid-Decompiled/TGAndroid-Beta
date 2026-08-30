package ea;

import b4.e0;
import m1.j;
public final class b {
    public final String f5170a;
    public final long f5171b;
    public final int f5172c;

    public b(String str, long j10, int i10) {
        this.f5170a = str;
        this.f5171b = j10;
        this.f5172c = i10;
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
                int i10 = bVar.f5172c;
                String str = bVar.f5170a;
                String str2 = this.f5170a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f5171b == bVar.f5171b) {
                    int i11 = this.f5172c;
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
        String str = this.f5170a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f5171b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i12 = this.f5172c;
        if (i12 != 0) {
            i10 = j.b(i12);
        }
        return i10 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f5170a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f5171b);
        sb.append(", responseCode=");
        int i10 = this.f5172c;
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
