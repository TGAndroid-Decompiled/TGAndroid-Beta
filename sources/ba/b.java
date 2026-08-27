package ba;

import m1.j;

public final class b {

    public final String f2056a;

    public final long f2057b;

    public final int f2058c;

    public b(String str, long j10, int i10) {
        this.f2056a = str;
        this.f2057b = j10;
        this.f2058c = i10;
    }

    public static b6.a a() {
        b6.a aVar = new b6.a((char) 0, 1);
        aVar.d = 0L;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i10 = bVar.f2058c;
        String str = bVar.f2056a;
        String str2 = this.f2056a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f2057b != bVar.f2057b) {
            return false;
        }
        int i11 = this.f2058c;
        if (i11 == 0) {
            return i10 == 0;
        }
        return j.a(i11, i10);
    }

    public final int hashCode() {
        String str = this.f2056a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f2057b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i11 = this.f2058c;
        return (i11 != 0 ? j.b(i11) : 0) ^ i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f2056a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f2057b);
        sb2.append(", responseCode=");
        int i10 = this.f2058c;
        if (i10 == 1) {
            str = "OK";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
