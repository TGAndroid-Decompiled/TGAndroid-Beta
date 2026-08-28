package g9;

import java.util.List;
public final class h0 extends d2 {
    public final String f7534a;
    public final String f7535b;
    public final String f7536c;
    public final long d;
    public final Long f7537e;
    public final boolean f7538f;
    public final l1 f7539g;
    public final c2 h;
    public final b2 f7540i;
    public final m1 f7541j;
    public final List f7542k;
    public final int f7543l;

    public h0(String str, String str2, String str3, long j10, Long l10, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i9) {
        this.f7534a = str;
        this.f7535b = str2;
        this.f7536c = str3;
        this.d = j10;
        this.f7537e = l10;
        this.f7538f = z10;
        this.f7539g = l1Var;
        this.h = c2Var;
        this.f7540i = b2Var;
        this.f7541j = m1Var;
        this.f7542k = list;
        this.f7543l = i9;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f7523a = this.f7534a;
        obj.f7524b = this.f7535b;
        obj.f7525c = this.f7536c;
        obj.d = Long.valueOf(this.d);
        obj.f7526e = this.f7537e;
        obj.f7527f = Boolean.valueOf(this.f7538f);
        obj.f7528g = this.f7539g;
        obj.h = this.h;
        obj.f7529i = this.f7540i;
        obj.f7530j = this.f7541j;
        obj.f7531k = this.f7542k;
        obj.f7532l = Integer.valueOf(this.f7543l);
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l10;
        c2 c2Var;
        b2 b2Var;
        m1 m1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d2) {
            h0 h0Var = (h0) ((d2) obj);
            List list2 = h0Var.f7542k;
            m1 m1Var2 = h0Var.f7541j;
            b2 b2Var2 = h0Var.f7540i;
            c2 c2Var2 = h0Var.h;
            Long l11 = h0Var.f7537e;
            String str2 = h0Var.f7536c;
            if (this.f7534a.equals(h0Var.f7534a) && this.f7535b.equals(h0Var.f7535b) && ((str = this.f7536c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l10 = this.f7537e) != null ? l10.equals(l11) : l11 == null) && this.f7538f == h0Var.f7538f && this.f7539g.equals(h0Var.f7539g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f7540i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f7541j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f7542k) != null ? list.equals(list2) : list2 == null) && this.f7543l == h0Var.f7543l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i9;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f7534a.hashCode() ^ 1000003) * 1000003) ^ this.f7535b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f7536c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f7537e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f7538f) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int hashCode7 = (((i12 ^ i9) * 1000003) ^ this.f7539g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f7540i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        m1 m1Var = this.f7541j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f7542k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.f7543l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f7534a);
        sb2.append(", identifier=");
        sb2.append(this.f7535b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f7536c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f7537e);
        sb2.append(", crashed=");
        sb2.append(this.f7538f);
        sb2.append(", app=");
        sb2.append(this.f7539g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f7540i);
        sb2.append(", device=");
        sb2.append(this.f7541j);
        sb2.append(", events=");
        sb2.append(this.f7542k);
        sb2.append(", generatorType=");
        return aa.d.l(this.f7543l, "}", sb2);
    }
}
