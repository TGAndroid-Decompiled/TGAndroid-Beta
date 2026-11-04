package ca;

import java.util.List;
public final class v0 extends k2 {
    public final i2 f4568a;
    public final List f4569b;
    public final List f4570c;
    public final Boolean d;
    public final j2 f4571e;
    public final List f4572f;
    public final int f4573g;

    public v0(i2 i2Var, List list, List list2, Boolean bool, j2 j2Var, List list3, int i3) {
        this.f4568a = i2Var;
        this.f4569b = list;
        this.f4570c = list2;
        this.d = bool;
        this.f4571e = j2Var;
        this.f4572f = list3;
        this.f4573g = i3;
    }

    @Override
    public final u0 a() {
        ?? obj = new Object();
        obj.f4555a = this.f4568a;
        obj.f4556b = this.f4569b;
        obj.f4557c = this.f4570c;
        obj.d = this.d;
        obj.f4558e = this.f4571e;
        obj.f4559f = this.f4572f;
        obj.f4560g = this.f4573g;
        obj.h = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        j2 j2Var;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            v0 v0Var = (v0) ((k2) obj);
            List list4 = v0Var.f4572f;
            j2 j2Var2 = v0Var.f4571e;
            Boolean bool2 = v0Var.d;
            List list5 = v0Var.f4570c;
            List list6 = v0Var.f4569b;
            if (this.f4568a.equals(v0Var.f4568a) && ((list = this.f4569b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f4570c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.d) != null ? bool.equals(bool2) : bool2 == null) && ((j2Var = this.f4571e) != null ? j2Var.equals(j2Var2) : j2Var2 == null) && ((list3 = this.f4572f) != null ? list3.equals(list4) : list4 == null) && this.f4573g == v0Var.f4573g) {
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
        int hashCode5 = (this.f4568a.hashCode() ^ 1000003) * 1000003;
        int i3 = 0;
        List list = this.f4569b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f4570c;
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
        j2 j2Var = this.f4571e;
        if (j2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j2Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        List list3 = this.f4572f;
        if (list3 != null) {
            i3 = list3.hashCode();
        }
        return ((i13 ^ i3) * 1000003) ^ this.f4573g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f4568a);
        sb2.append(", customAttributes=");
        sb2.append(this.f4569b);
        sb2.append(", internalKeys=");
        sb2.append(this.f4570c);
        sb2.append(", background=");
        sb2.append(this.d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f4571e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f4572f);
        sb2.append(", uiOrientation=");
        return a1.g.o(this.f4573g, "}", sb2);
    }
}
