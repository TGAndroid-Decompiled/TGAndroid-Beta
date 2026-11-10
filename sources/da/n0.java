package da;

import java.util.List;
public final class n0 extends t2 {
    public final String f8441a;
    public final String f8442b;
    public final String f8443c;
    public final long d;
    public final Long f8444e;
    public final boolean f8445f;
    public final b2 f8446g;
    public final s2 h;
    public final r2 f8447i;
    public final c2 f8448j;
    public final List f8449k;
    public final int f8450l;

    public n0(String str, String str2, String str3, long j3, Long l10, boolean z9, b2 b2Var, s2 s2Var, r2 r2Var, c2 c2Var, List list, int i7) {
        this.f8441a = str;
        this.f8442b = str2;
        this.f8443c = str3;
        this.d = j3;
        this.f8444e = l10;
        this.f8445f = z9;
        this.f8446g = b2Var;
        this.h = s2Var;
        this.f8447i = r2Var;
        this.f8448j = c2Var;
        this.f8449k = list;
        this.f8450l = i7;
    }

    @Override
    public final m0 a() {
        ?? obj = new Object();
        obj.f8422a = this.f8441a;
        obj.f8423b = this.f8442b;
        obj.f8424c = this.f8443c;
        obj.d = this.d;
        obj.f8425e = this.f8444e;
        obj.f8426f = this.f8445f;
        obj.f8427g = this.f8446g;
        obj.h = this.h;
        obj.f8428i = this.f8447i;
        obj.f8429j = this.f8448j;
        obj.f8430k = this.f8449k;
        obj.f8431l = this.f8450l;
        obj.f8432m = (byte) 7;
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
            List list2 = n0Var.f8449k;
            c2 c2Var2 = n0Var.f8448j;
            r2 r2Var2 = n0Var.f8447i;
            s2 s2Var2 = n0Var.h;
            Long l11 = n0Var.f8444e;
            String str2 = n0Var.f8443c;
            if (this.f8441a.equals(n0Var.f8441a) && this.f8442b.equals(n0Var.f8442b) && ((str = this.f8443c) != null ? str.equals(str2) : str2 == null) && this.d == n0Var.d && ((l10 = this.f8444e) != null ? l10.equals(l11) : l11 == null) && this.f8445f == n0Var.f8445f && this.f8446g.equals(n0Var.f8446g) && ((s2Var = this.h) != null ? s2Var.equals(s2Var2) : s2Var2 == null) && ((r2Var = this.f8447i) != null ? r2Var.equals(r2Var2) : r2Var2 == null) && ((c2Var = this.f8448j) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((list = this.f8449k) != null ? list.equals(list2) : list2 == null) && this.f8450l == n0Var.f8450l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i7;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f8441a.hashCode() ^ 1000003) * 1000003) ^ this.f8442b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f8443c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l10 = this.f8444e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f8445f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int hashCode7 = (((i12 ^ i7) * 1000003) ^ this.f8446g.hashCode()) * 1000003;
        s2 s2Var = this.h;
        if (s2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = s2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        r2 r2Var = this.f8447i;
        if (r2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        c2 c2Var = this.f8448j;
        if (c2Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f8449k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.f8450l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f8441a);
        sb2.append(", identifier=");
        sb2.append(this.f8442b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f8443c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f8444e);
        sb2.append(", crashed=");
        sb2.append(this.f8445f);
        sb2.append(", app=");
        sb2.append(this.f8446g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f8447i);
        sb2.append(", device=");
        sb2.append(this.f8448j);
        sb2.append(", events=");
        sb2.append(this.f8449k);
        sb2.append(", generatorType=");
        return a8.p0.n(this.f8450l, "}", sb2);
    }
}
