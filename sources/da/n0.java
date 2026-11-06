package da;

import java.util.List;
public final class n0 extends t2 {
    public final String f8438a;
    public final String f8439b;
    public final String f8440c;
    public final long d;
    public final Long f8441e;
    public final boolean f8442f;
    public final b2 f8443g;
    public final s2 h;
    public final r2 f8444i;
    public final c2 f8445j;
    public final List f8446k;
    public final int f8447l;

    public n0(String str, String str2, String str3, long j3, Long l10, boolean z9, b2 b2Var, s2 s2Var, r2 r2Var, c2 c2Var, List list, int i7) {
        this.f8438a = str;
        this.f8439b = str2;
        this.f8440c = str3;
        this.d = j3;
        this.f8441e = l10;
        this.f8442f = z9;
        this.f8443g = b2Var;
        this.h = s2Var;
        this.f8444i = r2Var;
        this.f8445j = c2Var;
        this.f8446k = list;
        this.f8447l = i7;
    }

    @Override
    public final m0 a() {
        ?? obj = new Object();
        obj.f8419a = this.f8438a;
        obj.f8420b = this.f8439b;
        obj.f8421c = this.f8440c;
        obj.d = this.d;
        obj.f8422e = this.f8441e;
        obj.f8423f = this.f8442f;
        obj.f8424g = this.f8443g;
        obj.h = this.h;
        obj.f8425i = this.f8444i;
        obj.f8426j = this.f8445j;
        obj.f8427k = this.f8446k;
        obj.f8428l = this.f8447l;
        obj.f8429m = (byte) 7;
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
            List list2 = n0Var.f8446k;
            c2 c2Var2 = n0Var.f8445j;
            r2 r2Var2 = n0Var.f8444i;
            s2 s2Var2 = n0Var.h;
            Long l11 = n0Var.f8441e;
            String str2 = n0Var.f8440c;
            if (this.f8438a.equals(n0Var.f8438a) && this.f8439b.equals(n0Var.f8439b) && ((str = this.f8440c) != null ? str.equals(str2) : str2 == null) && this.d == n0Var.d && ((l10 = this.f8441e) != null ? l10.equals(l11) : l11 == null) && this.f8442f == n0Var.f8442f && this.f8443g.equals(n0Var.f8443g) && ((s2Var = this.h) != null ? s2Var.equals(s2Var2) : s2Var2 == null) && ((r2Var = this.f8444i) != null ? r2Var.equals(r2Var2) : r2Var2 == null) && ((c2Var = this.f8445j) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((list = this.f8446k) != null ? list.equals(list2) : list2 == null) && this.f8447l == n0Var.f8447l) {
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
        int hashCode6 = (((this.f8438a.hashCode() ^ 1000003) * 1000003) ^ this.f8439b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f8440c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l10 = this.f8441e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f8442f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int hashCode7 = (((i12 ^ i7) * 1000003) ^ this.f8443g.hashCode()) * 1000003;
        s2 s2Var = this.h;
        if (s2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = s2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        r2 r2Var = this.f8444i;
        if (r2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        c2 c2Var = this.f8445j;
        if (c2Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f8446k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.f8447l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f8438a);
        sb2.append(", identifier=");
        sb2.append(this.f8439b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f8440c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f8441e);
        sb2.append(", crashed=");
        sb2.append(this.f8442f);
        sb2.append(", app=");
        sb2.append(this.f8443g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f8444i);
        sb2.append(", device=");
        sb2.append(this.f8445j);
        sb2.append(", events=");
        sb2.append(this.f8446k);
        sb2.append(", generatorType=");
        return a8.p0.n(this.f8447l, "}", sb2);
    }
}
