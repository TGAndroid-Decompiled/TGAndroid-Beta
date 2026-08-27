package h9;

import java.util.List;

public final class m0 extends u1 {

    public final s1 f8766a;

    public final List f8767b;

    public final List f8768c;
    public final Boolean d;

    public final t1 f8769e;

    public final List f8770f;

    public final int f8771g;

    public m0(s1 s1Var, List list, List list2, Boolean bool, t1 t1Var, List list3, int i10) {
        this.f8766a = s1Var;
        this.f8767b = list;
        this.f8768c = list2;
        this.d = bool;
        this.f8769e = t1Var;
        this.f8770f = list3;
        this.f8771g = i10;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        t1 t1Var;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            m0 m0Var = (m0) ((u1) obj);
            List list4 = m0Var.f8770f;
            t1 t1Var2 = m0Var.f8769e;
            Boolean bool2 = m0Var.d;
            List list5 = m0Var.f8768c;
            List list6 = m0Var.f8767b;
            if (this.f8766a.equals(m0Var.f8766a) && ((list = this.f8767b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f8768c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.d) != null ? bool.equals(bool2) : bool2 == null) && ((t1Var = this.f8769e) != null ? t1Var.equals(t1Var2) : t1Var2 == null) && ((list3 = this.f8770f) != null ? list3.equals(list4) : list4 == null) && this.f8771g == m0Var.f8771g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8766a.hashCode() ^ 1000003) * 1000003;
        List list = this.f8767b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f8768c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        t1 t1Var = this.f8769e;
        int iHashCode5 = (iHashCode4 ^ (t1Var == null ? 0 : t1Var.hashCode())) * 1000003;
        List list3 = this.f8770f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f8771g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f8766a);
        sb2.append(", customAttributes=");
        sb2.append(this.f8767b);
        sb2.append(", internalKeys=");
        sb2.append(this.f8768c);
        sb2.append(", background=");
        sb2.append(this.d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f8769e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f8770f);
        sb2.append(", uiOrientation=");
        return a9.p.k(this.f8771g, "}", sb2);
    }
}
