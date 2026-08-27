package h9;

import g7.e8;

public final class a0 extends e2 {

    public final String f8620b;

    public final String f8621c;
    public final int d;

    public final String f8622e;

    public final String f8623f;

    public final String f8624g;
    public final String h;

    public final String f8625i;

    public final d2 f8626j;

    public final j1 f8627k;

    public final g1 f8628l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f8620b = str;
        this.f8621c = str2;
        this.d = i10;
        this.f8622e = str3;
        this.f8623f = str4;
        this.f8624g = str5;
        this.h = str6;
        this.f8625i = str7;
        this.f8626j = d2Var;
        this.f8627k = j1Var;
        this.f8628l = g1Var;
    }

    public final e8 a() {
        e8 e8Var = new e8();
        e8Var.f6455a = this.f8620b;
        e8Var.f6456b = this.f8621c;
        e8Var.f6461i = Integer.valueOf(this.d);
        e8Var.f6457c = this.f8622e;
        e8Var.d = this.f8623f;
        e8Var.f6458e = this.f8624g;
        e8Var.f6463k = this.h;
        e8Var.f6459f = this.f8625i;
        e8Var.f6460g = this.f8626j;
        e8Var.h = this.f8627k;
        e8Var.f6462j = this.f8628l;
        return e8Var;
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
            g1 g1Var2 = a0Var.f8628l;
            j1 j1Var2 = a0Var.f8627k;
            d2 d2Var2 = a0Var.f8626j;
            String str3 = a0Var.f8624g;
            String str4 = a0Var.f8623f;
            if (this.f8620b.equals(a0Var.f8620b) && this.f8621c.equals(a0Var.f8621c) && this.d == a0Var.d && this.f8622e.equals(a0Var.f8622e) && ((str = this.f8623f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f8624g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f8625i.equals(a0Var.f8625i) && ((d2Var = this.f8626j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f8627k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f8628l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f8620b.hashCode() ^ 1000003) * 1000003) ^ this.f8621c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f8622e.hashCode()) * 1000003;
        String str = this.f8623f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f8624g;
        int iHashCode3 = (((((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f8625i.hashCode()) * 1000003;
        d2 d2Var = this.f8626j;
        int iHashCode4 = (iHashCode3 ^ (d2Var == null ? 0 : d2Var.hashCode())) * 1000003;
        j1 j1Var = this.f8627k;
        int iHashCode5 = (iHashCode4 ^ (j1Var == null ? 0 : j1Var.hashCode())) * 1000003;
        g1 g1Var = this.f8628l;
        return iHashCode5 ^ (g1Var != null ? g1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f8620b + ", gmpAppId=" + this.f8621c + ", platform=" + this.d + ", installationUuid=" + this.f8622e + ", firebaseInstallationId=" + this.f8623f + ", appQualitySessionId=" + this.f8624g + ", buildVersion=" + this.h + ", displayVersion=" + this.f8625i + ", session=" + this.f8626j + ", ndkPayload=" + this.f8627k + ", appExitInfo=" + this.f8628l + "}";
    }
}
