package defpackage;
public final class a80 extends hz2 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final l80 k;
    public final g80 l;
    public final d80 m;

    public a80(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, l80 l80Var, g80 g80Var, d80 d80Var) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = l80Var;
        this.l = g80Var;
        this.m = d80Var;
    }

    public final z70 a() {
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
            if (obj instanceof hz2) {
                a80 a80Var = (a80) ((hz2) obj);
                if (this.b.equals(a80Var.b) && this.c.equals(a80Var.c) && this.d == a80Var.d && this.e.equals(a80Var.e)) {
                    String str = a80Var.f;
                    String str2 = this.f;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    String str3 = a80Var.g;
                    String str4 = this.g;
                    if (str4 == null) {
                        if (str3 != null) {
                            return false;
                        }
                    } else if (!str4.equals(str3)) {
                        return false;
                    }
                    String str5 = a80Var.h;
                    String str6 = this.h;
                    if (str6 == null) {
                        if (str5 != null) {
                            return false;
                        }
                    } else if (!str6.equals(str5)) {
                        return false;
                    }
                    if (this.i.equals(a80Var.i) && this.j.equals(a80Var.j)) {
                        l80 l80Var = a80Var.k;
                        l80 l80Var2 = this.k;
                        if (l80Var2 == null) {
                            if (l80Var != null) {
                                return false;
                            }
                        } else if (!l80Var2.equals(l80Var)) {
                            return false;
                        }
                        g80 g80Var = a80Var.l;
                        g80 g80Var2 = this.l;
                        if (g80Var2 == null) {
                            if (g80Var != null) {
                                return false;
                            }
                        } else if (!g80Var2.equals(g80Var)) {
                            return false;
                        }
                        d80 d80Var = a80Var.m;
                        d80 d80Var2 = this.m;
                        if (d80Var2 == null) {
                            if (d80Var == null) {
                                return true;
                            }
                            return false;
                        } else if (d80Var2.equals(d80Var)) {
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
        l80 l80Var = this.k;
        if (l80Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l80Var.hashCode();
        }
        int i4 = (hashCode7 ^ hashCode4) * 1000003;
        g80 g80Var = this.l;
        if (g80Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = g80Var.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        d80 d80Var = this.m;
        if (d80Var != null) {
            i = d80Var.hashCode();
        }
        return i5 ^ i;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
