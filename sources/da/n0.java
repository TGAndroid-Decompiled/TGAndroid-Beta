package da;

import java.util.List;
public final class n0 extends t2 {
    public final String f8436a;
    public final String f8437b;
    public final String f8438c;
    public final long d;
    public final Long f8439e;
    public final boolean f8440f;
    public final b2 f8441g;
    public final s2 h;
    public final r2 f8442i;
    public final c2 f8443j;
    public final List f8444k;
    public final int f8445l;

    public n0(String str, String str2, String str3, long j3, Long l10, boolean z9, b2 b2Var, s2 s2Var, r2 r2Var, c2 c2Var, List list, int i7) {
        this.f8436a = str;
        this.f8437b = str2;
        this.f8438c = str3;
        this.d = j3;
        this.f8439e = l10;
        this.f8440f = z9;
        this.f8441g = b2Var;
        this.h = s2Var;
        this.f8442i = r2Var;
        this.f8443j = c2Var;
        this.f8444k = list;
        this.f8445l = i7;
    }

    @Override
    public final m0 a() {
        ?? obj = new Object();
        obj.f8417a = this.f8436a;
        obj.f8418b = this.f8437b;
        obj.f8419c = this.f8438c;
        obj.d = this.d;
        obj.f8420e = this.f8439e;
        obj.f8421f = this.f8440f;
        obj.f8422g = this.f8441g;
        obj.h = this.h;
        obj.f8423i = this.f8442i;
        obj.f8424j = this.f8443j;
        obj.f8425k = this.f8444k;
        obj.f8426l = this.f8445l;
        obj.f8427m = (byte) 7;
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
            List list2 = n0Var.f8444k;
            c2 c2Var2 = n0Var.f8443j;
            r2 r2Var2 = n0Var.f8442i;
            s2 s2Var2 = n0Var.h;
            Long l11 = n0Var.f8439e;
            String str2 = n0Var.f8438c;
            if (this.f8436a.equals(n0Var.f8436a) && this.f8437b.equals(n0Var.f8437b) && ((str = this.f8438c) != null ? str.equals(str2) : str2 == null) && this.d == n0Var.d && ((l10 = this.f8439e) != null ? l10.equals(l11) : l11 == null) && this.f8440f == n0Var.f8440f && this.f8441g.equals(n0Var.f8441g) && ((s2Var = this.h) != null ? s2Var.equals(s2Var2) : s2Var2 == null) && ((r2Var = this.f8442i) != null ? r2Var.equals(r2Var2) : r2Var2 == null) && ((c2Var = this.f8443j) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((list = this.f8444k) != null ? list.equals(list2) : list2 == null) && this.f8445l == n0Var.f8445l) {
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
        int hashCode6 = (((this.f8436a.hashCode() ^ 1000003) * 1000003) ^ this.f8437b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f8438c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i11 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l10 = this.f8439e;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        if (this.f8440f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int hashCode7 = (((i12 ^ i7) * 1000003) ^ this.f8441g.hashCode()) * 1000003;
        s2 s2Var = this.h;
        if (s2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = s2Var.hashCode();
        }
        int i13 = (hashCode7 ^ hashCode3) * 1000003;
        r2 r2Var = this.f8442i;
        if (r2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        c2 c2Var = this.f8443j;
        if (c2Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        List list = this.f8444k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((i15 ^ i10) * 1000003) ^ this.f8445l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f8436a);
        sb2.append(", identifier=");
        sb2.append(this.f8437b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f8438c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f8439e);
        sb2.append(", crashed=");
        sb2.append(this.f8440f);
        sb2.append(", app=");
        sb2.append(this.f8441g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f8442i);
        sb2.append(", device=");
        sb2.append(this.f8443j);
        sb2.append(", events=");
        sb2.append(this.f8444k);
        sb2.append(", generatorType=");
        return a8.p0.n(this.f8445l, "}", sb2);
    }
}
