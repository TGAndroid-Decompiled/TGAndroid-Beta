package h9;

import java.util.List;

public final class h0 extends d2 {

    public final String f8705a;

    public final String f8706b;

    public final String f8707c;
    public final long d;

    public final Long f8708e;

    public final boolean f8709f;

    public final l1 f8710g;
    public final c2 h;

    public final b2 f8711i;

    public final m1 f8712j;

    public final List f8713k;

    public final int f8714l;

    public h0(String str, String str2, String str3, long j10, Long l10, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f8705a = str;
        this.f8706b = str2;
        this.f8707c = str3;
        this.d = j10;
        this.f8708e = l10;
        this.f8709f = z10;
        this.f8710g = l1Var;
        this.h = c2Var;
        this.f8711i = b2Var;
        this.f8712j = m1Var;
        this.f8713k = list;
        this.f8714l = i10;
    }

    @Override
    public final g0 a() {
        g0 g0Var = new g0();
        g0Var.f8694a = this.f8705a;
        g0Var.f8695b = this.f8706b;
        g0Var.f8696c = this.f8707c;
        g0Var.d = Long.valueOf(this.d);
        g0Var.f8697e = this.f8708e;
        g0Var.f8698f = Boolean.valueOf(this.f8709f);
        g0Var.f8699g = this.f8710g;
        g0Var.h = this.h;
        g0Var.f8700i = this.f8711i;
        g0Var.f8701j = this.f8712j;
        g0Var.f8702k = this.f8713k;
        g0Var.f8703l = Integer.valueOf(this.f8714l);
        return g0Var;
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
            List list2 = h0Var.f8713k;
            m1 m1Var2 = h0Var.f8712j;
            b2 b2Var2 = h0Var.f8711i;
            c2 c2Var2 = h0Var.h;
            Long l11 = h0Var.f8708e;
            String str2 = h0Var.f8707c;
            if (this.f8705a.equals(h0Var.f8705a) && this.f8706b.equals(h0Var.f8706b) && ((str = this.f8707c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l10 = this.f8708e) != null ? l10.equals(l11) : l11 == null) && this.f8709f == h0Var.f8709f && this.f8710g.equals(h0Var.f8710g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f8711i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f8712j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f8713k) != null ? list.equals(list2) : list2 == null) && this.f8714l == h0Var.f8714l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f8705a.hashCode() ^ 1000003) * 1000003) ^ this.f8706b.hashCode()) * 1000003;
        String str = this.f8707c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f8708e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f8709f ? 1231 : 1237)) * 1000003) ^ this.f8710g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        int iHashCode4 = (iHashCode3 ^ (c2Var == null ? 0 : c2Var.hashCode())) * 1000003;
        b2 b2Var = this.f8711i;
        int iHashCode5 = (iHashCode4 ^ (b2Var == null ? 0 : b2Var.hashCode())) * 1000003;
        m1 m1Var = this.f8712j;
        int iHashCode6 = (iHashCode5 ^ (m1Var == null ? 0 : m1Var.hashCode())) * 1000003;
        List list = this.f8713k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f8714l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f8705a);
        sb2.append(", identifier=");
        sb2.append(this.f8706b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f8707c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f8708e);
        sb2.append(", crashed=");
        sb2.append(this.f8709f);
        sb2.append(", app=");
        sb2.append(this.f8710g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f8711i);
        sb2.append(", device=");
        sb2.append(this.f8712j);
        sb2.append(", events=");
        sb2.append(this.f8713k);
        sb2.append(", generatorType=");
        return a9.p.k(this.f8714l, "}", sb2);
    }
}
