package ca;

import m1.j;
public final class a {
    public final String f3013a;
    public final String f3014b;
    public final String f3015c;
    public final b d;
    public final int f3016e;

    public a(String str, String str2, String str3, b bVar, int i10) {
        this.f3013a = str;
        this.f3014b = str2;
        this.f3015c = str3;
        this.d = bVar;
        this.f3016e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i10 = aVar.f3016e;
                b bVar = aVar.d;
                String str = aVar.f3015c;
                String str2 = aVar.f3014b;
                String str3 = aVar.f3013a;
                String str4 = this.f3013a;
                if (str4 == null) {
                    if (str3 != null) {
                        return false;
                    }
                } else if (!str4.equals(str3)) {
                    return false;
                }
                String str5 = this.f3014b;
                if (str5 == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str5.equals(str2)) {
                    return false;
                }
                String str6 = this.f3015c;
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
                int i11 = this.f3016e;
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
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i10 = 0;
        String str = this.f3013a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f3014b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.f3015c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        b bVar = this.d;
        if (bVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bVar.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        int i15 = this.f3016e;
        if (i15 != 0) {
            i10 = j.b(i15);
        }
        return i10 ^ i14;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f3013a);
        sb2.append(", fid=");
        sb2.append(this.f3014b);
        sb2.append(", refreshToken=");
        sb2.append(this.f3015c);
        sb2.append(", authToken=");
        sb2.append(this.d);
        sb2.append(", responseCode=");
        int i10 = this.f3016e;
        if (i10 != 1) {
            if (i10 != 2) {
                str = "null";
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
