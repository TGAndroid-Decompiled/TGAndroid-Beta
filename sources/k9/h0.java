package k9;

import java.util.List;
public final class h0 extends d2 {
    public final String f10889a;
    public final String f10890b;
    public final String f10891c;
    public final long d;
    public final Long f10892e;
    public final boolean f10893f;
    public final l1 f10894g;
    public final c2 h;
    public final b2 f10895i;
    public final m1 f10896j;
    public final List f10897k;
    public final int f10898l;

    public h0(String str, String str2, String str3, long j10, Long l10, boolean z4, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f10889a = str;
        this.f10890b = str2;
        this.f10891c = str3;
        this.d = j10;
        this.f10892e = l10;
        this.f10893f = z4;
        this.f10894g = l1Var;
        this.h = c2Var;
        this.f10895i = b2Var;
        this.f10896j = m1Var;
        this.f10897k = list;
        this.f10898l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f10878a = this.f10889a;
        obj.f10879b = this.f10890b;
        obj.f10880c = this.f10891c;
        obj.d = Long.valueOf(this.d);
        obj.f10881e = this.f10892e;
        obj.f10882f = Boolean.valueOf(this.f10893f);
        obj.f10883g = this.f10894g;
        obj.h = this.h;
        obj.f10884i = this.f10895i;
        obj.f10885j = this.f10896j;
        obj.f10886k = this.f10897k;
        obj.f10887l = Integer.valueOf(this.f10898l);
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
            List list2 = h0Var.f10897k;
            m1 m1Var2 = h0Var.f10896j;
            b2 b2Var2 = h0Var.f10895i;
            c2 c2Var2 = h0Var.h;
            Long l11 = h0Var.f10892e;
            String str2 = h0Var.f10891c;
            if (this.f10889a.equals(h0Var.f10889a) && this.f10890b.equals(h0Var.f10890b) && ((str = this.f10891c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l10 = this.f10892e) != null ? l10.equals(l11) : l11 == null) && this.f10893f == h0Var.f10893f && this.f10894g.equals(h0Var.f10894g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f10895i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f10896j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f10897k) != null ? list.equals(list2) : list2 == null) && this.f10898l == h0Var.f10898l) {
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
        int hashCode6 = (((this.f10889a.hashCode() ^ 1000003) * 1000003) ^ this.f10890b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f10891c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f10892e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f10893f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f10894g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f10895i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f10896j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f10897k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f10898l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f10889a);
        sb.append(", identifier=");
        sb.append(this.f10890b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f10891c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.f10892e);
        sb.append(", crashed=");
        sb.append(this.f10893f);
        sb.append(", app=");
        sb.append(this.f10894g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.f10895i);
        sb.append(", device=");
        sb.append(this.f10896j);
        sb.append(", events=");
        sb.append(this.f10897k);
        sb.append(", generatorType=");
        return android.support.v4.media.a.m(this.f10898l, "}", sb);
    }
}
