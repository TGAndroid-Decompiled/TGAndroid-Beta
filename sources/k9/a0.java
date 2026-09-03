package k9;

import j7.g8;
public final class a0 extends e2 {
    public final String f10048b;
    public final String f10049c;
    public final int d;
    public final String e;
    public final String f10050f;
    public final String f10051g;
    public final String h;
    public final String f10052i;
    public final d2 f10053j;
    public final j1 f10054k;
    public final g1 f10055l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f10048b = str;
        this.f10049c = str2;
        this.d = i10;
        this.e = str3;
        this.f10050f = str4;
        this.f10051g = str5;
        this.h = str6;
        this.f10052i = str7;
        this.f10053j = d2Var;
        this.f10054k = j1Var;
        this.f10055l = g1Var;
    }

    public final g8 a() {
        ?? obj = new Object();
        obj.f8985a = this.f10048b;
        obj.f8986b = this.f10049c;
        obj.f8990i = Integer.valueOf(this.d);
        obj.f8987c = this.e;
        obj.d = this.f10050f;
        obj.e = this.f10051g;
        obj.f8992k = this.h;
        obj.f8988f = this.f10052i;
        obj.f8989g = this.f10053j;
        obj.h = this.f10054k;
        obj.f8991j = this.f10055l;
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
            g1 g1Var2 = a0Var.f10055l;
            j1 j1Var2 = a0Var.f10054k;
            d2 d2Var2 = a0Var.f10053j;
            String str3 = a0Var.f10051g;
            String str4 = a0Var.f10050f;
            if (this.f10048b.equals(a0Var.f10048b) && this.f10049c.equals(a0Var.f10049c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f10050f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f10051g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f10052i.equals(a0Var.f10052i) && ((d2Var = this.f10053j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f10054k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f10055l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f10048b.hashCode() ^ 1000003) * 1000003) ^ this.f10049c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f10050f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f10051g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f10052i.hashCode()) * 1000003;
        d2 d2Var = this.f10053j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f10054k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f10055l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f10048b + ", gmpAppId=" + this.f10049c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f10050f + ", appQualitySessionId=" + this.f10051g + ", buildVersion=" + this.h + ", displayVersion=" + this.f10052i + ", session=" + this.f10053j + ", ndkPayload=" + this.f10054k + ", appExitInfo=" + this.f10055l + "}";
    }
}
