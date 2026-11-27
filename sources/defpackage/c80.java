package defpackage;
public final class c80 extends c03 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final n80 k;
    public final i80 l;
    public final f80 m;

    public c80(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, n80 n80Var, i80 i80Var, f80 f80Var) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = n80Var;
        this.l = i80Var;
        this.m = f80Var;
    }

    public final b80 a() {
        ?? obj = new Object();
        obj.a = this.b;
        obj.b = this.c;
        obj.c = this.d;
        obj.d = this.e;
        obj.e = this.f;
        obj.f = this.g;
        obj.g = this.h;
        obj.h = this.i;
        obj.i = this.j;
        obj.j = this.k;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c03) {
                c80 c80Var = (c80) ((c03) obj);
                if (this.b.equals(c80Var.b) && this.c.equals(c80Var.c) && this.d == c80Var.d && this.e.equals(c80Var.e)) {
                    String str = c80Var.f;
                    String str2 = this.f;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    String str3 = c80Var.g;
                    String str4 = this.g;
                    if (str4 == null) {
                        if (str3 != null) {
                            return false;
                        }
                    } else if (!str4.equals(str3)) {
                        return false;
                    }
                    String str5 = c80Var.h;
                    String str6 = this.h;
                    if (str6 == null) {
                        if (str5 != null) {
                            return false;
                        }
                    } else if (!str6.equals(str5)) {
                        return false;
                    }
                    if (this.i.equals(c80Var.i) && this.j.equals(c80Var.j)) {
                        n80 n80Var = c80Var.k;
                        n80 n80Var2 = this.k;
                        if (n80Var2 == null) {
                            if (n80Var != null) {
                                return false;
                            }
                        } else if (!n80Var2.equals(n80Var)) {
                            return false;
                        }
                        i80 i80Var = c80Var.l;
                        i80 i80Var2 = this.l;
                        if (i80Var2 == null) {
                            if (i80Var != null) {
                                return false;
                            }
                        } else if (!i80Var2.equals(i80Var)) {
                            return false;
                        }
                        f80 f80Var = c80Var.m;
                        f80 f80Var2 = this.m;
                        if (f80Var2 == null) {
                            if (f80Var == null) {
                                return true;
                            }
                            return false;
                        } else if (f80Var2.equals(f80Var)) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    return false;
                }
                return false;
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
        int hashCode5;
        int hashCode6 = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i = 0;
        String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i3 ^ hashCode3) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        n80 n80Var = this.k;
        if (n80Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = n80Var.hashCode();
        }
        int i4 = (hashCode7 ^ hashCode4) * 1000003;
        i80 i80Var = this.l;
        if (i80Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = i80Var.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        f80 f80Var = this.m;
        if (f80Var != null) {
            i = f80Var.hashCode();
        }
        return i5 ^ i;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
