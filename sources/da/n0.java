package da;

import java.util.List;
public final class n0 extends t2 {
    public final String f7828a;
    public final String f7829b;
    public final String f7830c;
    public final long d;
    public final Long f7831e;
    public final boolean f7832f;
    public final b2 f7833g;
    public final s2 h;
    public final r2 f7834i;
    public final c2 f7835j;
    public final List f7836k;
    public final int f7837l;

    public n0(String str, String str2, String str3, long j3, Long l10, boolean z10, b2 b2Var, s2 s2Var, r2 r2Var, c2 c2Var, List list, int i7) {
        this.f7828a = str;
        this.f7829b = str2;
        this.f7830c = str3;
        this.d = j3;
        this.f7831e = l10;
        this.f7832f = z10;
        this.f7833g = b2Var;
        this.h = s2Var;
        this.f7834i = r2Var;
        this.f7835j = c2Var;
        this.f7836k = list;
        this.f7837l = i7;
    }

    @Override
    public final m0 a() {
        ?? obj = new Object();
        obj.f7809a = this.f7828a;
        obj.f7810b = this.f7829b;
        obj.f7811c = this.f7830c;
        obj.d = this.d;
        obj.f7812e = this.f7831e;
        obj.f7813f = this.f7832f;
        obj.f7814g = this.f7833g;
        obj.h = this.h;
        obj.f7815i = this.f7834i;
        obj.f7816j = this.f7835j;
        obj.f7817k = this.f7836k;
        obj.f7818l = this.f7837l;
        obj.f7819m = (byte) 7;
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
            List list2 = n0Var.f7836k;
            c2 c2Var2 = n0Var.f7835j;
            r2 r2Var2 = n0Var.f7834i;
            s2 s2Var2 = n0Var.h;
            Long l11 = n0Var.f7831e;
            String str2 = n0Var.f7830c;
            if (this.f7828a.equals(n0Var.f7828a) && this.f7829b.equals(n0Var.f7829b) && ((str = this.f7830c) != null ? str.equals(str2) : str2 == null) && this.d == n0Var.d && ((l10 = this.f7831e) != null ? l10.equals(l11) : l11 == null) && this.f7832f == n0Var.f7832f && this.f7833g.equals(n0Var.f7833g) && ((s2Var = this.h) != null ? s2Var.equals(s2Var2) : s2Var2 == null) && ((r2Var = this.f7834i) != null ? r2Var.equals(r2Var2) : r2Var2 == null) && ((c2Var = this.f7835j) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((list = this.f7836k) != null ? list.equals(list2) : list2 == null) && this.f7837l == n0Var.f7837l) {
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
        int hashCode6 = (((this.f7828a.hashCode() ^ 1000003) * 1000003) ^ this.f7829b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f7830c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l10 = this.f7831e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f7832f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int hashCode7 = (((i12 ^ i7) * 1000003) ^ this.f7833g.hashCode()) * 1000003;
        s2 s2Var = this.h;
        if (s2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = s2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        r2 r2Var = this.f7834i;
        if (r2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        c2 c2Var = this.f7835j;
        if (c2Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f7836k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.f7837l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f7828a);
        sb2.append(", identifier=");
        sb2.append(this.f7829b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f7830c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f7831e);
        sb2.append(", crashed=");
        sb2.append(this.f7832f);
        sb2.append(", app=");
        sb2.append(this.f7833g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f7834i);
        sb2.append(", device=");
        sb2.append(this.f7835j);
        sb2.append(", events=");
        sb2.append(this.f7836k);
        sb2.append(", generatorType=");
        return a8.p0.n(this.f7837l, "}", sb2);
    }
}
