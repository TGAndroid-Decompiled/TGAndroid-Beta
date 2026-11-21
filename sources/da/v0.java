package da;

import java.util.List;
public final class v0 extends k2 {
    public final i2 f8240a;
    public final List f8241b;
    public final List f8242c;
    public final Boolean d;
    public final j2 f8243e;
    public final List f8244f;
    public final int f8245g;

    public v0(i2 i2Var, List list, List list2, Boolean bool, j2 j2Var, List list3, int i7) {
        this.f8240a = i2Var;
        this.f8241b = list;
        this.f8242c = list2;
        this.d = bool;
        this.f8243e = j2Var;
        this.f8244f = list3;
        this.f8245g = i7;
    }

    @Override
    public final u0 a() {
        ?? obj = new Object();
        obj.f8227a = this.f8240a;
        obj.f8228b = this.f8241b;
        obj.f8229c = this.f8242c;
        obj.d = this.d;
        obj.f8230e = this.f8243e;
        obj.f8231f = this.f8244f;
        obj.f8232g = this.f8245g;
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
            List list4 = v0Var.f8244f;
            j2 j2Var2 = v0Var.f8243e;
            Boolean bool2 = v0Var.d;
            List list5 = v0Var.f8242c;
            List list6 = v0Var.f8241b;
            if (this.f8240a.equals(v0Var.f8240a) && ((list = this.f8241b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f8242c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.d) != null ? bool.equals(bool2) : bool2 == null) && ((j2Var = this.f8243e) != null ? j2Var.equals(j2Var2) : j2Var2 == null) && ((list3 = this.f8244f) != null ? list3.equals(list4) : list4 == null) && this.f8245g == v0Var.f8245g) {
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
        int hashCode5 = (this.f8240a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        List list = this.f8241b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f8242c;
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
        j2 j2Var = this.f8243e;
        if (j2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j2Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        List list3 = this.f8244f;
        if (list3 != null) {
            i7 = list3.hashCode();
        }
        return ((i13 ^ i7) * 1000003) ^ this.f8245g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f8240a);
        sb2.append(", customAttributes=");
        sb2.append(this.f8241b);
        sb2.append(", internalKeys=");
        sb2.append(this.f8242c);
        sb2.append(", background=");
        sb2.append(this.d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f8243e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f8244f);
        sb2.append(", uiOrientation=");
        return a8.p0.n(this.f8245g, "}", sb2);
    }
}
