package defpackage;
public final class a90 extends s03 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final l90 k;
    public final g90 l;
    public final d90 m;

    public a90(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, l90 l90Var, g90 g90Var, d90 d90Var) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = l90Var;
        this.l = g90Var;
        this.m = d90Var;
    }

    public final z80 a() {
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
            if (obj instanceof s03) {
                a90 a90Var = (a90) ((s03) obj);
                if (this.b.equals(a90Var.b) && this.c.equals(a90Var.c) && this.d == a90Var.d && this.e.equals(a90Var.e)) {
                    String str = a90Var.f;
                    String str2 = this.f;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    String str3 = a90Var.g;
                    String str4 = this.g;
                    if (str4 == null) {
                        if (str3 != null) {
                            return false;
                        }
                    } else if (!str4.equals(str3)) {
                        return false;
                    }
                    String str5 = a90Var.h;
                    String str6 = this.h;
                    if (str6 == null) {
                        if (str5 != null) {
                            return false;
                        }
                    } else if (!str6.equals(str5)) {
                        return false;
                    }
                    if (this.i.equals(a90Var.i) && this.j.equals(a90Var.j)) {
                        l90 l90Var = a90Var.k;
                        l90 l90Var2 = this.k;
                        if (l90Var2 == null) {
                            if (l90Var != null) {
                                return false;
                            }
                        } else if (!l90Var2.equals(l90Var)) {
                            return false;
                        }
                        g90 g90Var = a90Var.l;
                        g90 g90Var2 = this.l;
                        if (g90Var2 == null) {
                            if (g90Var != null) {
                                return false;
                            }
                        } else if (!g90Var2.equals(g90Var)) {
                            return false;
                        }
                        d90 d90Var = a90Var.m;
                        d90 d90Var2 = this.m;
                        if (d90Var2 == null) {
                            if (d90Var == null) {
                                return true;
                            }
                            return false;
                        } else if (d90Var2.equals(d90Var)) {
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
        l90 l90Var = this.k;
        if (l90Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l90Var.hashCode();
        }
        int i4 = (hashCode7 ^ hashCode4) * 1000003;
        g90 g90Var = this.l;
        if (g90Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = g90Var.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        d90 d90Var = this.m;
        if (d90Var != null) {
            i = d90Var.hashCode();
        }
        return i5 ^ i;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
