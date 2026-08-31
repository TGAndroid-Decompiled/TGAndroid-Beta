package k9;

import j7.g8;
public final class a0 extends e2 {
    public final String f10804b;
    public final String f10805c;
    public final int d;
    public final String f10806e;
    public final String f10807f;
    public final String f10808g;
    public final String h;
    public final String f10809i;
    public final d2 f10810j;
    public final j1 f10811k;
    public final g1 f10812l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f10804b = str;
        this.f10805c = str2;
        this.d = i10;
        this.f10806e = str3;
        this.f10807f = str4;
        this.f10808g = str5;
        this.h = str6;
        this.f10809i = str7;
        this.f10810j = d2Var;
        this.f10811k = j1Var;
        this.f10812l = g1Var;
    }

    public final g8 a() {
        ?? obj = new Object();
        obj.f9615a = this.f10804b;
        obj.f9616b = this.f10805c;
        obj.f9621i = Integer.valueOf(this.d);
        obj.f9617c = this.f10806e;
        obj.d = this.f10807f;
        obj.f9618e = this.f10808g;
        obj.f9623k = this.h;
        obj.f9619f = this.f10809i;
        obj.f9620g = this.f10810j;
        obj.h = this.f10811k;
        obj.f9622j = this.f10812l;
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
            g1 g1Var2 = a0Var.f10812l;
            j1 j1Var2 = a0Var.f10811k;
            d2 d2Var2 = a0Var.f10810j;
            String str3 = a0Var.f10808g;
            String str4 = a0Var.f10807f;
            if (this.f10804b.equals(a0Var.f10804b) && this.f10805c.equals(a0Var.f10805c) && this.d == a0Var.d && this.f10806e.equals(a0Var.f10806e) && ((str = this.f10807f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f10808g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f10809i.equals(a0Var.f10809i) && ((d2Var = this.f10810j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f10811k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f10812l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f10804b.hashCode() ^ 1000003) * 1000003) ^ this.f10805c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f10806e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f10807f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f10808g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f10809i.hashCode()) * 1000003;
        d2 d2Var = this.f10810j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f10811k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f10812l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f10804b + ", gmpAppId=" + this.f10805c + ", platform=" + this.d + ", installationUuid=" + this.f10806e + ", firebaseInstallationId=" + this.f10807f + ", appQualitySessionId=" + this.f10808g + ", buildVersion=" + this.h + ", displayVersion=" + this.f10809i + ", session=" + this.f10810j + ", ndkPayload=" + this.f10811k + ", appExitInfo=" + this.f10812l + "}";
    }
}
