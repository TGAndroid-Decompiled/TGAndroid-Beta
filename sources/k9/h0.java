package k9;

import java.util.List;
public final class h0 extends d2 {
    public final String f10145a;
    public final String f10146b;
    public final String f10147c;
    public final long d;
    public final Long e;
    public final boolean f10148f;
    public final l1 f10149g;
    public final c2 h;
    public final b2 f10150i;
    public final m1 f10151j;
    public final List f10152k;
    public final int f10153l;

    public h0(String str, String str2, String str3, long j10, Long l10, boolean z4, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f10145a = str;
        this.f10146b = str2;
        this.f10147c = str3;
        this.d = j10;
        this.e = l10;
        this.f10148f = z4;
        this.f10149g = l1Var;
        this.h = c2Var;
        this.f10150i = b2Var;
        this.f10151j = m1Var;
        this.f10152k = list;
        this.f10153l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f10135a = this.f10145a;
        obj.f10136b = this.f10146b;
        obj.f10137c = this.f10147c;
        obj.d = Long.valueOf(this.d);
        obj.e = this.e;
        obj.f10138f = Boolean.valueOf(this.f10148f);
        obj.f10139g = this.f10149g;
        obj.h = this.h;
        obj.f10140i = this.f10150i;
        obj.f10141j = this.f10151j;
        obj.f10142k = this.f10152k;
        obj.f10143l = Integer.valueOf(this.f10153l);
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
            List list2 = h0Var.f10152k;
            m1 m1Var2 = h0Var.f10151j;
            b2 b2Var2 = h0Var.f10150i;
            c2 c2Var2 = h0Var.h;
            Long l11 = h0Var.e;
            String str2 = h0Var.f10147c;
            if (this.f10145a.equals(h0Var.f10145a) && this.f10146b.equals(h0Var.f10146b) && ((str = this.f10147c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l10 = this.e) != null ? l10.equals(l11) : l11 == null) && this.f10148f == h0Var.f10148f && this.f10149g.equals(h0Var.f10149g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f10150i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f10151j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f10152k) != null ? list.equals(list2) : list2 == null) && this.f10153l == h0Var.f10153l) {
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
        int hashCode6 = (((this.f10145a.hashCode() ^ 1000003) * 1000003) ^ this.f10146b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f10147c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f10148f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f10149g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f10150i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f10151j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f10152k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f10153l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f10145a);
        sb.append(", identifier=");
        sb.append(this.f10146b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f10147c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f10148f);
        sb.append(", app=");
        sb.append(this.f10149g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.f10150i);
        sb.append(", device=");
        sb.append(this.f10151j);
        sb.append(", events=");
        sb.append(this.f10152k);
        sb.append(", generatorType=");
        return android.support.v4.media.a.m(this.f10153l, "}", sb);
    }
}
