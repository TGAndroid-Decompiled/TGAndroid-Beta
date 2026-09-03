package k9;

import java.util.List;
public final class m0 extends u1 {
    public final s1 f10177a;
    public final List f10178b;
    public final List f10179c;
    public final Boolean d;
    public final t1 e;
    public final List f10180f;
    public final int f10181g;

    public m0(s1 s1Var, List list, List list2, Boolean bool, t1 t1Var, List list3, int i10) {
        this.f10177a = s1Var;
        this.f10178b = list;
        this.f10179c = list2;
        this.d = bool;
        this.e = t1Var;
        this.f10180f = list3;
        this.f10181g = i10;
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
            List list4 = m0Var.f10180f;
            t1 t1Var2 = m0Var.e;
            Boolean bool2 = m0Var.d;
            List list5 = m0Var.f10179c;
            List list6 = m0Var.f10178b;
            if (this.f10177a.equals(m0Var.f10177a) && ((list = this.f10178b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f10179c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.d) != null ? bool.equals(bool2) : bool2 == null) && ((t1Var = this.e) != null ? t1Var.equals(t1Var2) : t1Var2 == null) && ((list3 = this.f10180f) != null ? list3.equals(list4) : list4 == null) && this.f10181g == m0Var.f10181g) {
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
        int hashCode5 = (this.f10177a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        List list = this.f10178b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f10179c;
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
        t1 t1Var = this.e;
        if (t1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t1Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        List list3 = this.f10180f;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return ((i14 ^ i10) * 1000003) ^ this.f10181g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f10177a);
        sb.append(", customAttributes=");
        sb.append(this.f10178b);
        sb.append(", internalKeys=");
        sb.append(this.f10179c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f10180f);
        sb.append(", uiOrientation=");
        return android.support.v4.media.a.m(this.f10181g, "}", sb);
    }
}
