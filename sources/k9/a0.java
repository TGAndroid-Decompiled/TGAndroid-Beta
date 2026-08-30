package k9;

import j7.f8;
public final class a0 extends e2 {
    public final String f10068b;
    public final String f10069c;
    public final int d;
    public final String e;
    public final String f10070f;
    public final String f10071g;
    public final String h;
    public final String f10072i;
    public final d2 f10073j;
    public final j1 f10074k;
    public final g1 f10075l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f10068b = str;
        this.f10069c = str2;
        this.d = i10;
        this.e = str3;
        this.f10070f = str4;
        this.f10071g = str5;
        this.h = str6;
        this.f10072i = str7;
        this.f10073j = d2Var;
        this.f10074k = j1Var;
        this.f10075l = g1Var;
    }

    public final f8 a() {
        ?? obj = new Object();
        obj.f8996a = this.f10068b;
        obj.f8997b = this.f10069c;
        obj.f9001i = Integer.valueOf(this.d);
        obj.f8998c = this.e;
        obj.d = this.f10070f;
        obj.e = this.f10071g;
        obj.f9003k = this.h;
        obj.f8999f = this.f10072i;
        obj.f9000g = this.f10073j;
        obj.h = this.f10074k;
        obj.f9002j = this.f10075l;
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        d2 d2Var;
        j1 j1Var;
        g1 g1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            a0 a0Var = (a0) ((e2) obj);
            g1 g1Var2 = a0Var.f10075l;
            j1 j1Var2 = a0Var.f10074k;
            d2 d2Var2 = a0Var.f10073j;
            String str3 = a0Var.f10071g;
            String str4 = a0Var.f10070f;
            if (this.f10068b.equals(a0Var.f10068b) && this.f10069c.equals(a0Var.f10069c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f10070f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f10071g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f10072i.equals(a0Var.f10072i) && ((d2Var = this.f10073j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f10074k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f10075l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((((((this.f10068b.hashCode() ^ 1000003) * 1000003) ^ this.f10069c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f10070f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f10071g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f10072i.hashCode()) * 1000003;
        d2 d2Var = this.f10073j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f10074k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f10075l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f10068b + ", gmpAppId=" + this.f10069c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f10070f + ", appQualitySessionId=" + this.f10071g + ", buildVersion=" + this.h + ", displayVersion=" + this.f10072i + ", session=" + this.f10073j + ", ndkPayload=" + this.f10074k + ", appExitInfo=" + this.f10075l + "}";
    }
}
