package k9;

import java.util.List;
public final class h0 extends d2 {
    public final String f10125a;
    public final String f10126b;
    public final String f10127c;
    public final long d;
    public final Long e;
    public final boolean f10128f;
    public final l1 f10129g;
    public final c2 h;
    public final b2 f10130i;
    public final m1 f10131j;
    public final List f10132k;
    public final int f10133l;

    public h0(String str, String str2, String str3, long j10, Long l10, boolean z4, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f10125a = str;
        this.f10126b = str2;
        this.f10127c = str3;
        this.d = j10;
        this.e = l10;
        this.f10128f = z4;
        this.f10129g = l1Var;
        this.h = c2Var;
        this.f10130i = b2Var;
        this.f10131j = m1Var;
        this.f10132k = list;
        this.f10133l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f10115a = this.f10125a;
        obj.f10116b = this.f10126b;
        obj.f10117c = this.f10127c;
        obj.d = Long.valueOf(this.d);
        obj.e = this.e;
        obj.f10118f = Boolean.valueOf(this.f10128f);
        obj.f10119g = this.f10129g;
        obj.h = this.h;
        obj.f10120i = this.f10130i;
        obj.f10121j = this.f10131j;
        obj.f10122k = this.f10132k;
        obj.f10123l = Integer.valueOf(this.f10133l);
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
            List list2 = h0Var.f10132k;
            m1 m1Var2 = h0Var.f10131j;
            b2 b2Var2 = h0Var.f10130i;
            c2 c2Var2 = h0Var.h;
            Long l11 = h0Var.e;
            String str2 = h0Var.f10127c;
            if (this.f10125a.equals(h0Var.f10125a) && this.f10126b.equals(h0Var.f10126b) && ((str = this.f10127c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l10 = this.e) != null ? l10.equals(l11) : l11 == null) && this.f10128f == h0Var.f10128f && this.f10129g.equals(h0Var.f10129g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f10130i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f10131j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f10132k) != null ? list.equals(list2) : list2 == null) && this.f10133l == h0Var.f10133l) {
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
        int hashCode6 = (((this.f10125a.hashCode() ^ 1000003) * 1000003) ^ this.f10126b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f10127c;
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
        if (this.f10128f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f10129g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f10130i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f10131j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f10132k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f10133l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f10125a);
        sb.append(", identifier=");
        sb.append(this.f10126b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f10127c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f10128f);
        sb.append(", app=");
        sb.append(this.f10129g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.f10130i);
        sb.append(", device=");
        sb.append(this.f10131j);
        sb.append(", events=");
        sb.append(this.f10132k);
        sb.append(", generatorType=");
        return android.support.v4.media.a.m(this.f10133l, "}", sb);
    }
}
