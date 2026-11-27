package defpackage;

import java.util.List;
public final class v80 extends sz2 {
    public final w80 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final rz2 e;
    public final List f;
    public final int g;

    public v80(w80 w80Var, List list, List list2, Boolean bool, rz2 rz2Var, List list3, int i) {
        this.a = w80Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = rz2Var;
        this.f = list3;
        this.g = i;
    }

    public final u80 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof sz2) {
                v80 v80Var = (v80) ((sz2) obj);
                if (this.a.equals(v80Var.a)) {
                    List list = v80Var.b;
                    List list2 = this.b;
                    if (list2 == null) {
                        if (list != null) {
                            return false;
                        }
                    } else if (!list2.equals(list)) {
                        return false;
                    }
                    List list3 = v80Var.c;
                    List list4 = this.c;
                    if (list4 == null) {
                        if (list3 != null) {
                            return false;
                        }
                    } else if (!list4.equals(list3)) {
                        return false;
                    }
                    Boolean bool = v80Var.d;
                    Boolean bool2 = this.d;
                    if (bool2 == null) {
                        if (bool != null) {
                            return false;
                        }
                    } else if (!bool2.equals(bool)) {
                        return false;
                    }
                    rz2 rz2Var = v80Var.e;
                    rz2 rz2Var2 = this.e;
                    if (rz2Var2 == null) {
                        if (rz2Var != null) {
                            return false;
                        }
                    } else if (!rz2Var2.equals(rz2Var)) {
                        return false;
                    }
                    List list5 = v80Var.f;
                    List list6 = this.f;
                    if (list6 == null) {
                        if (list5 != null) {
                            return false;
                        }
                    } else if (!list6.equals(list5)) {
                        return false;
                    }
                    if (this.g == v80Var.g) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        List list = this.b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        Boolean bool = this.d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        rz2 rz2Var = this.e;
        if (rz2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = rz2Var.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        List list3 = this.f;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return ((i5 ^ i) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return uh9.l(sb, this.g, "}");
    }
}
