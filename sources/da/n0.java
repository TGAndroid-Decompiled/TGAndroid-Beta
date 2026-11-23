package da;

import java.util.List;
public final class n0 extends t2 {
    public final String f8102a;
    public final String f8103b;
    public final String f8104c;
    public final long d;
    public final Long f8105e;
    public final boolean f8106f;
    public final b2 f8107g;
    public final s2 h;
    public final r2 f8108i;
    public final c2 f8109j;
    public final List f8110k;
    public final int f8111l;

    public n0(String str, String str2, String str3, long j3, Long l10, boolean z10, b2 b2Var, s2 s2Var, r2 r2Var, c2 c2Var, List list, int i7) {
        this.f8102a = str;
        this.f8103b = str2;
        this.f8104c = str3;
        this.d = j3;
        this.f8105e = l10;
        this.f8106f = z10;
        this.f8107g = b2Var;
        this.h = s2Var;
        this.f8108i = r2Var;
        this.f8109j = c2Var;
        this.f8110k = list;
        this.f8111l = i7;
    }

    @Override
    public final m0 a() {
        ?? obj = new Object();
        obj.f8083a = this.f8102a;
        obj.f8084b = this.f8103b;
        obj.f8085c = this.f8104c;
        obj.d = this.d;
        obj.f8086e = this.f8105e;
        obj.f8087f = this.f8106f;
        obj.f8088g = this.f8107g;
        obj.h = this.h;
        obj.f8089i = this.f8108i;
        obj.f8090j = this.f8109j;
        obj.f8091k = this.f8110k;
        obj.f8092l = this.f8111l;
        obj.f8093m = (byte) 7;
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
            List list2 = n0Var.f8110k;
            c2 c2Var2 = n0Var.f8109j;
            r2 r2Var2 = n0Var.f8108i;
            s2 s2Var2 = n0Var.h;
            Long l11 = n0Var.f8105e;
            String str2 = n0Var.f8104c;
            if (this.f8102a.equals(n0Var.f8102a) && this.f8103b.equals(n0Var.f8103b) && ((str = this.f8104c) != null ? str.equals(str2) : str2 == null) && this.d == n0Var.d && ((l10 = this.f8105e) != null ? l10.equals(l11) : l11 == null) && this.f8106f == n0Var.f8106f && this.f8107g.equals(n0Var.f8107g) && ((s2Var = this.h) != null ? s2Var.equals(s2Var2) : s2Var2 == null) && ((r2Var = this.f8108i) != null ? r2Var.equals(r2Var2) : r2Var2 == null) && ((c2Var = this.f8109j) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((list = this.f8110k) != null ? list.equals(list2) : list2 == null) && this.f8111l == n0Var.f8111l) {
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
        int hashCode6 = (((this.f8102a.hashCode() ^ 1000003) * 1000003) ^ this.f8103b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f8104c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l10 = this.f8105e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f8106f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int hashCode7 = (((i12 ^ i7) * 1000003) ^ this.f8107g.hashCode()) * 1000003;
        s2 s2Var = this.h;
        if (s2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = s2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        r2 r2Var = this.f8108i;
        if (r2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        c2 c2Var = this.f8109j;
        if (c2Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f8110k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.f8111l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f8102a);
        sb2.append(", identifier=");
        sb2.append(this.f8103b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f8104c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f8105e);
        sb2.append(", crashed=");
        sb2.append(this.f8106f);
        sb2.append(", app=");
        sb2.append(this.f8107g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f8108i);
        sb2.append(", device=");
        sb2.append(this.f8109j);
        sb2.append(", events=");
        sb2.append(this.f8110k);
        sb2.append(", generatorType=");
        return a8.p0.n(this.f8111l, "}", sb2);
    }
}
