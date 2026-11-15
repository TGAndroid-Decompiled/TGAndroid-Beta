package da;

import java.util.List;
public final class n0 extends t2 {
    public final String f7825a;
    public final String f7826b;
    public final String f7827c;
    public final long d;
    public final Long f7828e;
    public final boolean f7829f;
    public final b2 f7830g;
    public final s2 h;
    public final r2 f7831i;
    public final c2 f7832j;
    public final List f7833k;
    public final int f7834l;

    public n0(String str, String str2, String str3, long j3, Long l10, boolean z10, b2 b2Var, s2 s2Var, r2 r2Var, c2 c2Var, List list, int i7) {
        this.f7825a = str;
        this.f7826b = str2;
        this.f7827c = str3;
        this.d = j3;
        this.f7828e = l10;
        this.f7829f = z10;
        this.f7830g = b2Var;
        this.h = s2Var;
        this.f7831i = r2Var;
        this.f7832j = c2Var;
        this.f7833k = list;
        this.f7834l = i7;
    }

    @Override
    public final m0 a() {
        ?? obj = new Object();
        obj.f7806a = this.f7825a;
        obj.f7807b = this.f7826b;
        obj.f7808c = this.f7827c;
        obj.d = this.d;
        obj.f7809e = this.f7828e;
        obj.f7810f = this.f7829f;
        obj.f7811g = this.f7830g;
        obj.h = this.h;
        obj.f7812i = this.f7831i;
        obj.f7813j = this.f7832j;
        obj.f7814k = this.f7833k;
        obj.f7815l = this.f7834l;
        obj.f7816m = (byte) 7;
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
            List list2 = n0Var.f7833k;
            c2 c2Var2 = n0Var.f7832j;
            r2 r2Var2 = n0Var.f7831i;
            s2 s2Var2 = n0Var.h;
            Long l11 = n0Var.f7828e;
            String str2 = n0Var.f7827c;
            if (this.f7825a.equals(n0Var.f7825a) && this.f7826b.equals(n0Var.f7826b) && ((str = this.f7827c) != null ? str.equals(str2) : str2 == null) && this.d == n0Var.d && ((l10 = this.f7828e) != null ? l10.equals(l11) : l11 == null) && this.f7829f == n0Var.f7829f && this.f7830g.equals(n0Var.f7830g) && ((s2Var = this.h) != null ? s2Var.equals(s2Var2) : s2Var2 == null) && ((r2Var = this.f7831i) != null ? r2Var.equals(r2Var2) : r2Var2 == null) && ((c2Var = this.f7832j) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((list = this.f7833k) != null ? list.equals(list2) : list2 == null) && this.f7834l == n0Var.f7834l) {
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
        int hashCode6 = (((this.f7825a.hashCode() ^ 1000003) * 1000003) ^ this.f7826b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f7827c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l10 = this.f7828e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f7829f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int hashCode7 = (((i12 ^ i7) * 1000003) ^ this.f7830g.hashCode()) * 1000003;
        s2 s2Var = this.h;
        if (s2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = s2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        r2 r2Var = this.f7831i;
        if (r2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        c2 c2Var = this.f7832j;
        if (c2Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f7833k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.f7834l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f7825a);
        sb2.append(", identifier=");
        sb2.append(this.f7826b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f7827c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f7828e);
        sb2.append(", crashed=");
        sb2.append(this.f7829f);
        sb2.append(", app=");
        sb2.append(this.f7830g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f7831i);
        sb2.append(", device=");
        sb2.append(this.f7832j);
        sb2.append(", events=");
        sb2.append(this.f7833k);
        sb2.append(", generatorType=");
        return a8.p0.n(this.f7834l, "}", sb2);
    }
}
