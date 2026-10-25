package aa;

import java.util.List;
public final class i0 extends f2 {
    public final String f1109a;
    public final String f1110b;
    public final String f1111c;
    public final long d;
    public final Long e;
    public final boolean f1112f;
    public final n1 f1113g;
    public final e2 h;
    public final d2 f1114i;
    public final o1 f1115j;
    public final List f1116k;
    public final int f1117l;

    public i0(String str, String str2, String str3, long j10, Long l4, boolean z10, n1 n1Var, e2 e2Var, d2 d2Var, o1 o1Var, List list, int i10) {
        this.f1109a = str;
        this.f1110b = str2;
        this.f1111c = str3;
        this.d = j10;
        this.e = l4;
        this.f1112f = z10;
        this.f1113g = n1Var;
        this.h = e2Var;
        this.f1114i = d2Var;
        this.f1115j = o1Var;
        this.f1116k = list;
        this.f1117l = i10;
    }

    @Override
    public final h0 a() {
        ?? obj = new Object();
        obj.f1093a = this.f1109a;
        obj.f1094b = this.f1110b;
        obj.f1095c = this.f1111c;
        obj.d = Long.valueOf(this.d);
        obj.e = this.e;
        obj.f1096f = Boolean.valueOf(this.f1112f);
        obj.f1097g = this.f1113g;
        obj.h = this.h;
        obj.f1098i = this.f1114i;
        obj.f1099j = this.f1115j;
        obj.f1100k = this.f1116k;
        obj.f1101l = Integer.valueOf(this.f1117l);
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l4;
        e2 e2Var;
        d2 d2Var;
        o1 o1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            i0 i0Var = (i0) ((f2) obj);
            List list2 = i0Var.f1116k;
            o1 o1Var2 = i0Var.f1115j;
            d2 d2Var2 = i0Var.f1114i;
            e2 e2Var2 = i0Var.h;
            Long l10 = i0Var.e;
            String str2 = i0Var.f1111c;
            if (this.f1109a.equals(i0Var.f1109a) && this.f1110b.equals(i0Var.f1110b) && ((str = this.f1111c) != null ? str.equals(str2) : str2 == null) && this.d == i0Var.d && ((l4 = this.e) != null ? l4.equals(l10) : l10 == null) && this.f1112f == i0Var.f1112f && this.f1113g.equals(i0Var.f1113g) && ((e2Var = this.h) != null ? e2Var.equals(e2Var2) : e2Var2 == null) && ((d2Var = this.f1114i) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((o1Var = this.f1115j) != null ? o1Var.equals(o1Var2) : o1Var2 == null) && ((list = this.f1116k) != null ? list.equals(list2) : list2 == null) && this.f1117l == i0Var.f1117l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i10;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f1109a.hashCode() ^ 1000003) * 1000003) ^ this.f1110b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f1111c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l4 = this.e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f1112f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f1113g.hashCode()) * 1000003;
        e2 e2Var = this.h;
        if (e2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = e2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        d2 d2Var = this.f1114i;
        if (d2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        o1 o1Var = this.f1115j;
        if (o1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = o1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f1116k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f1117l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f1109a);
        sb2.append(", identifier=");
        sb2.append(this.f1110b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f1111c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f1112f);
        sb2.append(", app=");
        sb2.append(this.f1113g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f1114i);
        sb2.append(", device=");
        sb2.append(this.f1115j);
        sb2.append(", events=");
        sb2.append(this.f1116k);
        sb2.append(", generatorType=");
        return a1.g.n(this.f1117l, "}", sb2);
    }
}
