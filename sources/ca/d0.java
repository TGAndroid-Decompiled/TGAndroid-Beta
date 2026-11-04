package ca;
public final class d0 extends u2 {
    public final String f4338b;
    public final String f4339c;
    public final int d;
    public final String f4340e;
    public final String f4341f;
    public final String f4342g;
    public final String h;
    public final String f4343i;
    public final String f4344j;
    public final t2 f4345k;
    public final x1 f4346l;
    public final u1 f4347m;

    public d0(String str, String str2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, t2 t2Var, x1 x1Var, u1 u1Var) {
        this.f4338b = str;
        this.f4339c = str2;
        this.d = i3;
        this.f4340e = str3;
        this.f4341f = str4;
        this.f4342g = str5;
        this.h = str6;
        this.f4343i = str7;
        this.f4344j = str8;
        this.f4345k = t2Var;
        this.f4346l = x1Var;
        this.f4347m = u1Var;
    }

    public final c0 a() {
        ?? obj = new Object();
        obj.f4312a = this.f4338b;
        obj.f4313b = this.f4339c;
        obj.f4314c = this.d;
        obj.d = this.f4340e;
        obj.f4315e = this.f4341f;
        obj.f4316f = this.f4342g;
        obj.f4317g = this.h;
        obj.h = this.f4343i;
        obj.f4318i = this.f4344j;
        obj.f4319j = this.f4345k;
        obj.f4320k = this.f4346l;
        obj.f4321l = this.f4347m;
        obj.f4322m = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        t2 t2Var;
        x1 x1Var;
        u1 u1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u2) {
            d0 d0Var = (d0) ((u2) obj);
            u1 u1Var2 = d0Var.f4347m;
            x1 x1Var2 = d0Var.f4346l;
            t2 t2Var2 = d0Var.f4345k;
            String str4 = d0Var.h;
            String str5 = d0Var.f4342g;
            String str6 = d0Var.f4341f;
            if (this.f4338b.equals(d0Var.f4338b) && this.f4339c.equals(d0Var.f4339c) && this.d == d0Var.d && this.f4340e.equals(d0Var.f4340e) && ((str = this.f4341f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f4342g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.f4343i.equals(d0Var.f4343i) && this.f4344j.equals(d0Var.f4344j) && ((t2Var = this.f4345k) != null ? t2Var.equals(t2Var2) : t2Var2 == null) && ((x1Var = this.f4346l) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && ((u1Var = this.f4347m) != null ? u1Var.equals(u1Var2) : u1Var2 == null)) {
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
        int hashCode5;
        int hashCode6 = (((((((this.f4338b.hashCode() ^ 1000003) * 1000003) ^ this.f4339c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f4340e.hashCode()) * 1000003;
        int i3 = 0;
        String str = this.f4341f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f4342g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f4343i.hashCode()) * 1000003) ^ this.f4344j.hashCode()) * 1000003;
        t2 t2Var = this.f4345k;
        if (t2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t2Var.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        x1 x1Var = this.f4346l;
        if (x1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = x1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        u1 u1Var = this.f4347m;
        if (u1Var != null) {
            i3 = u1Var.hashCode();
        }
        return i13 ^ i3;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f4338b + ", gmpAppId=" + this.f4339c + ", platform=" + this.d + ", installationUuid=" + this.f4340e + ", firebaseInstallationId=" + this.f4341f + ", firebaseAuthenticationToken=" + this.f4342g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.f4343i + ", displayVersion=" + this.f4344j + ", session=" + this.f4345k + ", ndkPayload=" + this.f4346l + ", appExitInfo=" + this.f4347m + "}";
    }
}
