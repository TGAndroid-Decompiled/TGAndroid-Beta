package aa;

import m1.j;
public final class b {
    public final String f128a;
    public final long f129b;
    public final int f130c;

    public b(String str, long j10, int i9) {
        this.f128a = str;
        this.f129b = j10;
        this.f130c = i9;
    }

    public static a6.a a() {
        a6.a aVar = new a6.a((char) 0, 1);
        aVar.d = 0L;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i9 = bVar.f130c;
                String str = bVar.f128a;
                String str2 = this.f128a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f129b == bVar.f129b) {
                    int i10 = this.f130c;
                    if (i10 == 0) {
                        if (i9 == 0) {
                            return true;
                        }
                        return false;
                    } else if (j.a(i10, i9)) {
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
        int i9 = 0;
        String str = this.f128a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f129b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i11 = this.f130c;
        if (i11 != 0) {
            i9 = j.b(i11);
        }
        return i9 ^ i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f128a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f129b);
        sb2.append(", responseCode=");
        int i9 = this.f130c;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
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
