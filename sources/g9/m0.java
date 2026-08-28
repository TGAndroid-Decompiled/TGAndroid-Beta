package g9;

import java.util.List;
public final class m0 extends u1 {
    public final s1 f7595a;
    public final List f7596b;
    public final List f7597c;
    public final Boolean d;
    public final t1 f7598e;
    public final List f7599f;
    public final int f7600g;

    public m0(s1 s1Var, List list, List list2, Boolean bool, t1 t1Var, List list3, int i9) {
        this.f7595a = s1Var;
        this.f7596b = list;
        this.f7597c = list2;
        this.d = bool;
        this.f7598e = t1Var;
        this.f7599f = list3;
        this.f7600g = i9;
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
            List list4 = m0Var.f7599f;
            t1 t1Var2 = m0Var.f7598e;
            Boolean bool2 = m0Var.d;
            List list5 = m0Var.f7597c;
            List list6 = m0Var.f7596b;
            if (this.f7595a.equals(m0Var.f7595a) && ((list = this.f7596b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f7597c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.d) != null ? bool.equals(bool2) : bool2 == null) && ((t1Var = this.f7598e) != null ? t1Var.equals(t1Var2) : t1Var2 == null) && ((list3 = this.f7599f) != null ? list3.equals(list4) : list4 == null) && this.f7600g == m0Var.f7600g) {
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
        int hashCode5 = (this.f7595a.hashCode() ^ 1000003) * 1000003;
        int i9 = 0;
        List list = this.f7596b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f7597c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        Boolean bool = this.d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        t1 t1Var = this.f7598e;
        if (t1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        List list3 = this.f7599f;
        if (list3 != null) {
            i9 = list3.hashCode();
        }
        return ((i13 ^ i9) * 1000003) ^ this.f7600g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f7595a);
        sb2.append(", customAttributes=");
        sb2.append(this.f7596b);
        sb2.append(", internalKeys=");
        sb2.append(this.f7597c);
        sb2.append(", background=");
        sb2.append(this.d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f7598e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f7599f);
        sb2.append(", uiOrientation=");
        return aa.d.l(this.f7600g, "}", sb2);
    }
}
