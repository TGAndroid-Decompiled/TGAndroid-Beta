package da;

import java.util.List;
public final class n0 extends t2 {
    public final String f8136a;
    public final String f8137b;
    public final String f8138c;
    public final long d;
    public final Long f8139e;
    public final boolean f8140f;
    public final b2 f8141g;
    public final s2 h;
    public final r2 f8142i;
    public final c2 f8143j;
    public final List f8144k;
    public final int f8145l;

    public n0(String str, String str2, String str3, long j3, Long l10, boolean z10, b2 b2Var, s2 s2Var, r2 r2Var, c2 c2Var, List list, int i7) {
        this.f8136a = str;
        this.f8137b = str2;
        this.f8138c = str3;
        this.d = j3;
        this.f8139e = l10;
        this.f8140f = z10;
        this.f8141g = b2Var;
        this.h = s2Var;
        this.f8142i = r2Var;
        this.f8143j = c2Var;
        this.f8144k = list;
        this.f8145l = i7;
    }

    @Override
    public final m0 a() {
        ?? obj = new Object();
        obj.f8117a = this.f8136a;
        obj.f8118b = this.f8137b;
        obj.f8119c = this.f8138c;
        obj.d = this.d;
        obj.f8120e = this.f8139e;
        obj.f8121f = this.f8140f;
        obj.f8122g = this.f8141g;
        obj.h = this.h;
        obj.f8123i = this.f8142i;
        obj.f8124j = this.f8143j;
        obj.f8125k = this.f8144k;
        obj.f8126l = this.f8145l;
        obj.f8127m = (byte) 7;
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
            List list2 = n0Var.f8144k;
            c2 c2Var2 = n0Var.f8143j;
            r2 r2Var2 = n0Var.f8142i;
            s2 s2Var2 = n0Var.h;
            Long l11 = n0Var.f8139e;
            String str2 = n0Var.f8138c;
            if (this.f8136a.equals(n0Var.f8136a) && this.f8137b.equals(n0Var.f8137b) && ((str = this.f8138c) != null ? str.equals(str2) : str2 == null) && this.d == n0Var.d && ((l10 = this.f8139e) != null ? l10.equals(l11) : l11 == null) && this.f8140f == n0Var.f8140f && this.f8141g.equals(n0Var.f8141g) && ((s2Var = this.h) != null ? s2Var.equals(s2Var2) : s2Var2 == null) && ((r2Var = this.f8142i) != null ? r2Var.equals(r2Var2) : r2Var2 == null) && ((c2Var = this.f8143j) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((list = this.f8144k) != null ? list.equals(list2) : list2 == null) && this.f8145l == n0Var.f8145l) {
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
        int hashCode6 = (((this.f8136a.hashCode() ^ 1000003) * 1000003) ^ this.f8137b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f8138c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l10 = this.f8139e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f8140f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int hashCode7 = (((i12 ^ i7) * 1000003) ^ this.f8141g.hashCode()) * 1000003;
        s2 s2Var = this.h;
        if (s2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = s2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        r2 r2Var = this.f8142i;
        if (r2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        c2 c2Var = this.f8143j;
        if (c2Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f8144k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.f8145l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f8136a);
        sb2.append(", identifier=");
        sb2.append(this.f8137b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f8138c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f8139e);
        sb2.append(", crashed=");
        sb2.append(this.f8140f);
        sb2.append(", app=");
        sb2.append(this.f8141g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f8142i);
        sb2.append(", device=");
        sb2.append(this.f8143j);
        sb2.append(", events=");
        sb2.append(this.f8144k);
        sb2.append(", generatorType=");
        return a8.p0.n(this.f8145l, "}", sb2);
    }
}
