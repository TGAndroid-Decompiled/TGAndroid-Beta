package g9;

import f7.f8;
public final class a0 extends e2 {
    public final String f7449b;
    public final String f7450c;
    public final int d;
    public final String f7451e;
    public final String f7452f;
    public final String f7453g;
    public final String h;
    public final String f7454i;
    public final d2 f7455j;
    public final j1 f7456k;
    public final g1 f7457l;

    public a0(String str, String str2, int i9, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f7449b = str;
        this.f7450c = str2;
        this.d = i9;
        this.f7451e = str3;
        this.f7452f = str4;
        this.f7453g = str5;
        this.h = str6;
        this.f7454i = str7;
        this.f7455j = d2Var;
        this.f7456k = j1Var;
        this.f7457l = g1Var;
    }

    public final f8 a() {
        ?? obj = new Object();
        obj.f5661a = this.f7449b;
        obj.f5662b = this.f7450c;
        obj.f5667i = Integer.valueOf(this.d);
        obj.f5663c = this.f7451e;
        obj.d = this.f7452f;
        obj.f5664e = this.f7453g;
        obj.f5669k = this.h;
        obj.f5665f = this.f7454i;
        obj.f5666g = this.f7455j;
        obj.h = this.f7456k;
        obj.f5668j = this.f7457l;
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
            g1 g1Var2 = a0Var.f7457l;
            j1 j1Var2 = a0Var.f7456k;
            d2 d2Var2 = a0Var.f7455j;
            String str3 = a0Var.f7453g;
            String str4 = a0Var.f7452f;
            if (this.f7449b.equals(a0Var.f7449b) && this.f7450c.equals(a0Var.f7450c) && this.d == a0Var.d && this.f7451e.equals(a0Var.f7451e) && ((str = this.f7452f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f7453g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f7454i.equals(a0Var.f7454i) && ((d2Var = this.f7455j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f7456k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f7457l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f7449b.hashCode() ^ 1000003) * 1000003) ^ this.f7450c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f7451e.hashCode()) * 1000003;
        int i9 = 0;
        String str = this.f7452f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f7453g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i10 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f7454i.hashCode()) * 1000003;
        d2 d2Var = this.f7455j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i11 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f7456k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i12 = (i11 ^ hashCode4) * 1000003;
        g1 g1Var = this.f7457l;
        if (g1Var != null) {
            i9 = g1Var.hashCode();
        }
        return i12 ^ i9;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f7449b + ", gmpAppId=" + this.f7450c + ", platform=" + this.d + ", installationUuid=" + this.f7451e + ", firebaseInstallationId=" + this.f7452f + ", appQualitySessionId=" + this.f7453g + ", buildVersion=" + this.h + ", displayVersion=" + this.f7454i + ", session=" + this.f7455j + ", ndkPayload=" + this.f7456k + ", appExitInfo=" + this.f7457l + "}";
    }
}
