package ca;

import java.util.List;
public final class n0 extends t2 {
    public final String f4464a;
    public final String f4465b;
    public final String f4466c;
    public final long d;
    public final Long f4467e;
    public final boolean f4468f;
    public final b2 f4469g;
    public final s2 h;
    public final r2 f4470i;
    public final c2 f4471j;
    public final List f4472k;
    public final int f4473l;

    public n0(String str, String str2, String str3, long j10, Long l10, boolean z10, b2 b2Var, s2 s2Var, r2 r2Var, c2 c2Var, List list, int i3) {
        this.f4464a = str;
        this.f4465b = str2;
        this.f4466c = str3;
        this.d = j10;
        this.f4467e = l10;
        this.f4468f = z10;
        this.f4469g = b2Var;
        this.h = s2Var;
        this.f4470i = r2Var;
        this.f4471j = c2Var;
        this.f4472k = list;
        this.f4473l = i3;
    }

    @Override
    public final m0 a() {
        ?? obj = new Object();
        obj.f4445a = this.f4464a;
        obj.f4446b = this.f4465b;
        obj.f4447c = this.f4466c;
        obj.d = this.d;
        obj.f4448e = this.f4467e;
        obj.f4449f = this.f4468f;
        obj.f4450g = this.f4469g;
        obj.h = this.h;
        obj.f4451i = this.f4470i;
        obj.f4452j = this.f4471j;
        obj.f4453k = this.f4472k;
        obj.f4454l = this.f4473l;
        obj.f4455m = (byte) 7;
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l10;
        s2 s2Var;
        r2 r2Var;
        c2 c2Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t2) {
            n0 n0Var = (n0) ((t2) obj);
            List list2 = n0Var.f4472k;
            c2 c2Var2 = n0Var.f4471j;
            r2 r2Var2 = n0Var.f4470i;
            s2 s2Var2 = n0Var.h;
            Long l11 = n0Var.f4467e;
            String str2 = n0Var.f4466c;
            if (this.f4464a.equals(n0Var.f4464a) && this.f4465b.equals(n0Var.f4465b) && ((str = this.f4466c) != null ? str.equals(str2) : str2 == null) && this.d == n0Var.d && ((l10 = this.f4467e) != null ? l10.equals(l11) : l11 == null) && this.f4468f == n0Var.f4468f && this.f4469g.equals(n0Var.f4469g) && ((s2Var = this.h) != null ? s2Var.equals(s2Var2) : s2Var2 == null) && ((r2Var = this.f4470i) != null ? r2Var.equals(r2Var2) : r2Var2 == null) && ((c2Var = this.f4471j) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((list = this.f4472k) != null ? list.equals(list2) : list2 == null) && this.f4473l == n0Var.f4473l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i3;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f4464a.hashCode() ^ 1000003) * 1000003) ^ this.f4465b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f4466c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f4467e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f4468f) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        int hashCode7 = (((i12 ^ i3) * 1000003) ^ this.f4469g.hashCode()) * 1000003;
        s2 s2Var = this.h;
        if (s2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = s2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        r2 r2Var = this.f4470i;
        if (r2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        c2 c2Var = this.f4471j;
        if (c2Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f4472k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.f4473l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f4464a);
        sb2.append(", identifier=");
        sb2.append(this.f4465b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f4466c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f4467e);
        sb2.append(", crashed=");
        sb2.append(this.f4468f);
        sb2.append(", app=");
        sb2.append(this.f4469g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f4470i);
        sb2.append(", device=");
        sb2.append(this.f4471j);
        sb2.append(", events=");
        sb2.append(this.f4472k);
        sb2.append(", generatorType=");
        return a1.g.o(this.f4473l, "}", sb2);
    }
}
