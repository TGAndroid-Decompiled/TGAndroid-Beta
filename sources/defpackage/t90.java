package defpackage;

import java.util.List;
public final class t90 extends i03 {
    public final u90 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final h03 e;
    public final List f;
    public final int g;

    public t90(u90 u90Var, List list, List list2, Boolean bool, h03 h03Var, List list3, int i) {
        this.a = u90Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = h03Var;
        this.f = list3;
        this.g = i;
    }

    public final s90 a() {
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
            if (obj instanceof i03) {
                t90 t90Var = (t90) ((i03) obj);
                if (this.a.equals(t90Var.a)) {
                    List list = t90Var.b;
                    List list2 = this.b;
                    if (list2 == null) {
                        if (list != null) {
                            return false;
                        }
                    } else if (!list2.equals(list)) {
                        return false;
                    }
                    List list3 = t90Var.c;
                    List list4 = this.c;
                    if (list4 == null) {
                        if (list3 != null) {
                            return false;
                        }
                    } else if (!list4.equals(list3)) {
                        return false;
                    }
                    Boolean bool = t90Var.d;
                    Boolean bool2 = this.d;
                    if (bool2 == null) {
                        if (bool != null) {
                            return false;
                        }
                    } else if (!bool2.equals(bool)) {
                        return false;
                    }
                    h03 h03Var = t90Var.e;
                    h03 h03Var2 = this.e;
                    if (h03Var2 == null) {
                        if (h03Var != null) {
                            return false;
                        }
                    } else if (!h03Var2.equals(h03Var)) {
                        return false;
                    }
                    List list5 = t90Var.f;
                    List list6 = this.f;
                    if (list6 == null) {
                        if (list5 != null) {
                            return false;
                        }
                    } else if (!list6.equals(list5)) {
                        return false;
                    }
                    if (this.g == t90Var.g) {
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
        h03 h03Var = this.e;
        if (h03Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = h03Var.hashCode();
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
        return hg9.k(sb, this.g, "}");
    }
}
