package da;

import java.util.List;
public final class n0 extends t2 {
    public final String f8107a;
    public final String f8108b;
    public final String f8109c;
    public final long d;
    public final Long f8110e;
    public final boolean f8111f;
    public final b2 f8112g;
    public final s2 h;
    public final r2 f8113i;
    public final c2 f8114j;
    public final List f8115k;
    public final int f8116l;

    public n0(String str, String str2, String str3, long j3, Long l10, boolean z10, b2 b2Var, s2 s2Var, r2 r2Var, c2 c2Var, List list, int i7) {
        this.f8107a = str;
        this.f8108b = str2;
        this.f8109c = str3;
        this.d = j3;
        this.f8110e = l10;
        this.f8111f = z10;
        this.f8112g = b2Var;
        this.h = s2Var;
        this.f8113i = r2Var;
        this.f8114j = c2Var;
        this.f8115k = list;
        this.f8116l = i7;
    }

    @Override
    public final m0 a() {
        ?? obj = new Object();
        obj.f8088a = this.f8107a;
        obj.f8089b = this.f8108b;
        obj.f8090c = this.f8109c;
        obj.d = this.d;
        obj.f8091e = this.f8110e;
        obj.f8092f = this.f8111f;
        obj.f8093g = this.f8112g;
        obj.h = this.h;
        obj.f8094i = this.f8113i;
        obj.f8095j = this.f8114j;
        obj.f8096k = this.f8115k;
        obj.f8097l = this.f8116l;
        obj.f8098m = (byte) 7;
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
            List list2 = n0Var.f8115k;
            c2 c2Var2 = n0Var.f8114j;
            r2 r2Var2 = n0Var.f8113i;
            s2 s2Var2 = n0Var.h;
            Long l11 = n0Var.f8110e;
            String str2 = n0Var.f8109c;
            if (this.f8107a.equals(n0Var.f8107a) && this.f8108b.equals(n0Var.f8108b) && ((str = this.f8109c) != null ? str.equals(str2) : str2 == null) && this.d == n0Var.d && ((l10 = this.f8110e) != null ? l10.equals(l11) : l11 == null) && this.f8111f == n0Var.f8111f && this.f8112g.equals(n0Var.f8112g) && ((s2Var = this.h) != null ? s2Var.equals(s2Var2) : s2Var2 == null) && ((r2Var = this.f8113i) != null ? r2Var.equals(r2Var2) : r2Var2 == null) && ((c2Var = this.f8114j) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((list = this.f8115k) != null ? list.equals(list2) : list2 == null) && this.f8116l == n0Var.f8116l) {
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
        int hashCode6 = (((this.f8107a.hashCode() ^ 1000003) * 1000003) ^ this.f8108b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f8109c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l10 = this.f8110e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f8111f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int hashCode7 = (((i12 ^ i7) * 1000003) ^ this.f8112g.hashCode()) * 1000003;
        s2 s2Var = this.h;
        if (s2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = s2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        r2 r2Var = this.f8113i;
        if (r2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        c2 c2Var = this.f8114j;
        if (c2Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f8115k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.f8116l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f8107a);
        sb2.append(", identifier=");
        sb2.append(this.f8108b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f8109c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f8110e);
        sb2.append(", crashed=");
        sb2.append(this.f8111f);
        sb2.append(", app=");
        sb2.append(this.f8112g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f8113i);
        sb2.append(", device=");
        sb2.append(this.f8114j);
        sb2.append(", events=");
        sb2.append(this.f8115k);
        sb2.append(", generatorType=");
        return a8.p0.n(this.f8116l, "}", sb2);
    }
}
