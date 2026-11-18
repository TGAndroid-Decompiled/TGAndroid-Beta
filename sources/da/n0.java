package da;

import java.util.List;
public final class n0 extends t2 {
    public final String f8110a;
    public final String f8111b;
    public final String f8112c;
    public final long d;
    public final Long f8113e;
    public final boolean f8114f;
    public final b2 f8115g;
    public final s2 h;
    public final r2 f8116i;
    public final c2 f8117j;
    public final List f8118k;
    public final int f8119l;

    public n0(String str, String str2, String str3, long j3, Long l10, boolean z10, b2 b2Var, s2 s2Var, r2 r2Var, c2 c2Var, List list, int i7) {
        this.f8110a = str;
        this.f8111b = str2;
        this.f8112c = str3;
        this.d = j3;
        this.f8113e = l10;
        this.f8114f = z10;
        this.f8115g = b2Var;
        this.h = s2Var;
        this.f8116i = r2Var;
        this.f8117j = c2Var;
        this.f8118k = list;
        this.f8119l = i7;
    }

    @Override
    public final m0 a() {
        ?? obj = new Object();
        obj.f8091a = this.f8110a;
        obj.f8092b = this.f8111b;
        obj.f8093c = this.f8112c;
        obj.d = this.d;
        obj.f8094e = this.f8113e;
        obj.f8095f = this.f8114f;
        obj.f8096g = this.f8115g;
        obj.h = this.h;
        obj.f8097i = this.f8116i;
        obj.f8098j = this.f8117j;
        obj.f8099k = this.f8118k;
        obj.f8100l = this.f8119l;
        obj.f8101m = (byte) 7;
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
            List list2 = n0Var.f8118k;
            c2 c2Var2 = n0Var.f8117j;
            r2 r2Var2 = n0Var.f8116i;
            s2 s2Var2 = n0Var.h;
            Long l11 = n0Var.f8113e;
            String str2 = n0Var.f8112c;
            if (this.f8110a.equals(n0Var.f8110a) && this.f8111b.equals(n0Var.f8111b) && ((str = this.f8112c) != null ? str.equals(str2) : str2 == null) && this.d == n0Var.d && ((l10 = this.f8113e) != null ? l10.equals(l11) : l11 == null) && this.f8114f == n0Var.f8114f && this.f8115g.equals(n0Var.f8115g) && ((s2Var = this.h) != null ? s2Var.equals(s2Var2) : s2Var2 == null) && ((r2Var = this.f8116i) != null ? r2Var.equals(r2Var2) : r2Var2 == null) && ((c2Var = this.f8117j) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((list = this.f8118k) != null ? list.equals(list2) : list2 == null) && this.f8119l == n0Var.f8119l) {
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
        int hashCode6 = (((this.f8110a.hashCode() ^ 1000003) * 1000003) ^ this.f8111b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f8112c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l10 = this.f8113e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f8114f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int hashCode7 = (((i12 ^ i7) * 1000003) ^ this.f8115g.hashCode()) * 1000003;
        s2 s2Var = this.h;
        if (s2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = s2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        r2 r2Var = this.f8116i;
        if (r2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        c2 c2Var = this.f8117j;
        if (c2Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f8118k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.f8119l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f8110a);
        sb2.append(", identifier=");
        sb2.append(this.f8111b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f8112c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f8113e);
        sb2.append(", crashed=");
        sb2.append(this.f8114f);
        sb2.append(", app=");
        sb2.append(this.f8115g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f8116i);
        sb2.append(", device=");
        sb2.append(this.f8117j);
        sb2.append(", events=");
        sb2.append(this.f8118k);
        sb2.append(", generatorType=");
        return a8.p0.n(this.f8119l, "}", sb2);
    }
}
