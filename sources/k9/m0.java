package k9;

import java.util.List;
public final class m0 extends u1 {
    public final s1 f10950a;
    public final List f10951b;
    public final List f10952c;
    public final Boolean d;
    public final t1 f10953e;
    public final List f10954f;
    public final int f10955g;

    public m0(s1 s1Var, List list, List list2, Boolean bool, t1 t1Var, List list3, int i10) {
        this.f10950a = s1Var;
        this.f10951b = list;
        this.f10952c = list2;
        this.d = bool;
        this.f10953e = t1Var;
        this.f10954f = list3;
        this.f10955g = i10;
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
            List list4 = m0Var.f10954f;
            t1 t1Var2 = m0Var.f10953e;
            Boolean bool2 = m0Var.d;
            List list5 = m0Var.f10952c;
            List list6 = m0Var.f10951b;
            if (this.f10950a.equals(m0Var.f10950a) && ((list = this.f10951b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f10952c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.d) != null ? bool.equals(bool2) : bool2 == null) && ((t1Var = this.f10953e) != null ? t1Var.equals(t1Var2) : t1Var2 == null) && ((list3 = this.f10954f) != null ? list3.equals(list4) : list4 == null) && this.f10955g == m0Var.f10955g) {
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
        int hashCode5 = (this.f10950a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        List list = this.f10951b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f10952c;
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
        t1 t1Var = this.f10953e;
        if (t1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t1Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        List list3 = this.f10954f;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return ((i14 ^ i10) * 1000003) ^ this.f10955g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f10950a);
        sb.append(", customAttributes=");
        sb.append(this.f10951b);
        sb.append(", internalKeys=");
        sb.append(this.f10952c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.f10953e);
        sb.append(", appProcessDetails=");
        sb.append(this.f10954f);
        sb.append(", uiOrientation=");
        return android.support.v4.media.a.m(this.f10955g, "}", sb);
    }
}
