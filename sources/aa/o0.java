package aa;

import java.util.List;
public final class o0 extends w1 {
    public final u1 f1165a;
    public final List f1166b;
    public final List f1167c;
    public final Boolean d;
    public final v1 e;
    public final List f1168f;
    public final int f1169g;

    public o0(u1 u1Var, List list, List list2, Boolean bool, v1 v1Var, List list3, int i10) {
        this.f1165a = u1Var;
        this.f1166b = list;
        this.f1167c = list2;
        this.d = bool;
        this.e = v1Var;
        this.f1168f = list3;
        this.f1169g = i10;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        v1 v1Var;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            o0 o0Var = (o0) ((w1) obj);
            List list4 = o0Var.f1168f;
            v1 v1Var2 = o0Var.e;
            Boolean bool2 = o0Var.d;
            List list5 = o0Var.f1167c;
            List list6 = o0Var.f1166b;
            if (this.f1165a.equals(o0Var.f1165a) && ((list = this.f1166b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f1167c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.d) != null ? bool.equals(bool2) : bool2 == null) && ((v1Var = this.e) != null ? v1Var.equals(v1Var2) : v1Var2 == null) && ((list3 = this.f1168f) != null ? list3.equals(list4) : list4 == null) && this.f1169g == o0Var.f1169g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.f1165a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        List list = this.f1166b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f1167c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        Boolean bool = this.d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        v1 v1Var = this.e;
        if (v1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = v1Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        List list3 = this.f1168f;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return ((i14 ^ i10) * 1000003) ^ this.f1169g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f1165a);
        sb2.append(", customAttributes=");
        sb2.append(this.f1166b);
        sb2.append(", internalKeys=");
        sb2.append(this.f1167c);
        sb2.append(", background=");
        sb2.append(this.d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f1168f);
        sb2.append(", uiOrientation=");
        return a1.g.n(this.f1169g, "}", sb2);
    }
}
