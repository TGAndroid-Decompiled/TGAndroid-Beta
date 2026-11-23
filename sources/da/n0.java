package da;

import java.util.List;
public final class n0 extends t2 {
    public final String f8139a;
    public final String f8140b;
    public final String f8141c;
    public final long d;
    public final Long f8142e;
    public final boolean f8143f;
    public final b2 f8144g;
    public final s2 h;
    public final r2 f8145i;
    public final c2 f8146j;
    public final List f8147k;
    public final int f8148l;

    public n0(String str, String str2, String str3, long j3, Long l10, boolean z10, b2 b2Var, s2 s2Var, r2 r2Var, c2 c2Var, List list, int i7) {
        this.f8139a = str;
        this.f8140b = str2;
        this.f8141c = str3;
        this.d = j3;
        this.f8142e = l10;
        this.f8143f = z10;
        this.f8144g = b2Var;
        this.h = s2Var;
        this.f8145i = r2Var;
        this.f8146j = c2Var;
        this.f8147k = list;
        this.f8148l = i7;
    }

    @Override
    public final m0 a() {
        ?? obj = new Object();
        obj.f8120a = this.f8139a;
        obj.f8121b = this.f8140b;
        obj.f8122c = this.f8141c;
        obj.d = this.d;
        obj.f8123e = this.f8142e;
        obj.f8124f = this.f8143f;
        obj.f8125g = this.f8144g;
        obj.h = this.h;
        obj.f8126i = this.f8145i;
        obj.f8127j = this.f8146j;
        obj.f8128k = this.f8147k;
        obj.f8129l = this.f8148l;
        obj.f8130m = (byte) 7;
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
            List list2 = n0Var.f8147k;
            c2 c2Var2 = n0Var.f8146j;
            r2 r2Var2 = n0Var.f8145i;
            s2 s2Var2 = n0Var.h;
            Long l11 = n0Var.f8142e;
            String str2 = n0Var.f8141c;
            if (this.f8139a.equals(n0Var.f8139a) && this.f8140b.equals(n0Var.f8140b) && ((str = this.f8141c) != null ? str.equals(str2) : str2 == null) && this.d == n0Var.d && ((l10 = this.f8142e) != null ? l10.equals(l11) : l11 == null) && this.f8143f == n0Var.f8143f && this.f8144g.equals(n0Var.f8144g) && ((s2Var = this.h) != null ? s2Var.equals(s2Var2) : s2Var2 == null) && ((r2Var = this.f8145i) != null ? r2Var.equals(r2Var2) : r2Var2 == null) && ((c2Var = this.f8146j) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((list = this.f8147k) != null ? list.equals(list2) : list2 == null) && this.f8148l == n0Var.f8148l) {
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
        int hashCode6 = (((this.f8139a.hashCode() ^ 1000003) * 1000003) ^ this.f8140b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f8141c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l10 = this.f8142e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f8143f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int hashCode7 = (((i12 ^ i7) * 1000003) ^ this.f8144g.hashCode()) * 1000003;
        s2 s2Var = this.h;
        if (s2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = s2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        r2 r2Var = this.f8145i;
        if (r2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        c2 c2Var = this.f8146j;
        if (c2Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f8147k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.f8148l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f8139a);
        sb2.append(", identifier=");
        sb2.append(this.f8140b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f8141c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f8142e);
        sb2.append(", crashed=");
        sb2.append(this.f8143f);
        sb2.append(", app=");
        sb2.append(this.f8144g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f8145i);
        sb2.append(", device=");
        sb2.append(this.f8146j);
        sb2.append(", events=");
        sb2.append(this.f8147k);
        sb2.append(", generatorType=");
        return a8.p0.n(this.f8148l, "}", sb2);
    }
}
