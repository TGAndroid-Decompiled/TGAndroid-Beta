package da;

import java.util.List;
public final class v0 extends k2 {
    public final i2 f7932a;
    public final List f7933b;
    public final List f7934c;
    public final Boolean d;
    public final j2 f7935e;
    public final List f7936f;
    public final int f7937g;

    public v0(i2 i2Var, List list, List list2, Boolean bool, j2 j2Var, List list3, int i7) {
        this.f7932a = i2Var;
        this.f7933b = list;
        this.f7934c = list2;
        this.d = bool;
        this.f7935e = j2Var;
        this.f7936f = list3;
        this.f7937g = i7;
    }

    @Override
    public final u0 a() {
        ?? obj = new Object();
        obj.f7919a = this.f7932a;
        obj.f7920b = this.f7933b;
        obj.f7921c = this.f7934c;
        obj.d = this.d;
        obj.f7922e = this.f7935e;
        obj.f7923f = this.f7936f;
        obj.f7924g = this.f7937g;
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
            List list4 = v0Var.f7936f;
            j2 j2Var2 = v0Var.f7935e;
            Boolean bool2 = v0Var.d;
            List list5 = v0Var.f7934c;
            List list6 = v0Var.f7933b;
            if (this.f7932a.equals(v0Var.f7932a) && ((list = this.f7933b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f7934c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.d) != null ? bool.equals(bool2) : bool2 == null) && ((j2Var = this.f7935e) != null ? j2Var.equals(j2Var2) : j2Var2 == null) && ((list3 = this.f7936f) != null ? list3.equals(list4) : list4 == null) && this.f7937g == v0Var.f7937g) {
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
        int hashCode5 = (this.f7932a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        List list = this.f7933b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f7934c;
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
        j2 j2Var = this.f7935e;
        if (j2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j2Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        List list3 = this.f7936f;
        if (list3 != null) {
            i7 = list3.hashCode();
        }
        return ((i13 ^ i7) * 1000003) ^ this.f7937g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f7932a);
        sb2.append(", customAttributes=");
        sb2.append(this.f7933b);
        sb2.append(", internalKeys=");
        sb2.append(this.f7934c);
        sb2.append(", background=");
        sb2.append(this.d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f7935e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f7936f);
        sb2.append(", uiOrientation=");
        return a8.p0.n(this.f7937g, "}", sb2);
    }
}
