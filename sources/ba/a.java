package ba;

import m1.j;

public final class a {

    public final String f2052a;

    public final String f2053b;

    public final String f2054c;
    public final b d;

    public final int f2055e;

    public a(String str, String str2, String str3, b bVar, int i10) {
        this.f2052a = str;
        this.f2053b = str2;
        this.f2054c = str3;
        this.d = bVar;
        this.f2055e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = aVar.f2055e;
        b bVar = aVar.d;
        String str = aVar.f2054c;
        String str2 = aVar.f2053b;
        String str3 = aVar.f2052a;
        String str4 = this.f2052a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f2053b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.f2054c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        b bVar2 = this.d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        int i11 = this.f2055e;
        if (i11 == 0) {
            return i10 == 0;
        }
        return j.a(i11, i10);
    }

    public final int hashCode() {
        String str = this.f2052a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f2053b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2054c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i10 = this.f2055e;
        return (i10 != 0 ? j.b(i10) : 0) ^ iHashCode4;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f2052a);
        sb2.append(", fid=");
        sb2.append(this.f2053b);
        sb2.append(", refreshToken=");
        sb2.append(this.f2054c);
        sb2.append(", authToken=");
        sb2.append(this.d);
        sb2.append(", responseCode=");
        int i10 = this.f2055e;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
