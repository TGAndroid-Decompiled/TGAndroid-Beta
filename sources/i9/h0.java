package i9;

import java.util.List;
public final class h0 extends d2 {
    public final String f8669a;
    public final String f8670b;
    public final String f8671c;
    public final long d;
    public final Long f8672e;
    public final boolean f8673f;
    public final l1 f8674g;
    public final c2 h;
    public final b2 f8675i;
    public final m1 f8676j;
    public final List f8677k;
    public final int f8678l;

    public h0(String str, String str2, String str3, long j10, Long l10, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f8669a = str;
        this.f8670b = str2;
        this.f8671c = str3;
        this.d = j10;
        this.f8672e = l10;
        this.f8673f = z10;
        this.f8674g = l1Var;
        this.h = c2Var;
        this.f8675i = b2Var;
        this.f8676j = m1Var;
        this.f8677k = list;
        this.f8678l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f8658a = this.f8669a;
        obj.f8659b = this.f8670b;
        obj.f8660c = this.f8671c;
        obj.d = Long.valueOf(this.d);
        obj.f8661e = this.f8672e;
        obj.f8662f = Boolean.valueOf(this.f8673f);
        obj.f8663g = this.f8674g;
        obj.h = this.h;
        obj.f8664i = this.f8675i;
        obj.f8665j = this.f8676j;
        obj.f8666k = this.f8677k;
        obj.f8667l = Integer.valueOf(this.f8678l);
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
            List list2 = h0Var.f8677k;
            m1 m1Var2 = h0Var.f8676j;
            b2 b2Var2 = h0Var.f8675i;
            c2 c2Var2 = h0Var.h;
            Long l11 = h0Var.f8672e;
            String str2 = h0Var.f8671c;
            if (this.f8669a.equals(h0Var.f8669a) && this.f8670b.equals(h0Var.f8670b) && ((str = this.f8671c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l10 = this.f8672e) != null ? l10.equals(l11) : l11 == null) && this.f8673f == h0Var.f8673f && this.f8674g.equals(h0Var.f8674g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f8675i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f8676j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f8677k) != null ? list.equals(list2) : list2 == null) && this.f8678l == h0Var.f8678l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i10;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f8669a.hashCode() ^ 1000003) * 1000003) ^ this.f8670b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f8671c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f8672e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f8673f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f8674g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f8675i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f8676j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f8677k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f8678l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f8669a);
        sb2.append(", identifier=");
        sb2.append(this.f8670b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f8671c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f8672e);
        sb2.append(", crashed=");
        sb2.append(this.f8673f);
        sb2.append(", app=");
        sb2.append(this.f8674g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f8675i);
        sb2.append(", device=");
        sb2.append(this.f8676j);
        sb2.append(", events=");
        sb2.append(this.f8677k);
        sb2.append(", generatorType=");
        return a4.w.l(this.f8678l, "}", sb2);
    }
}
