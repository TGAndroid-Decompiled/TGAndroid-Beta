package defpackage;

import java.util.List;
public final class l80 extends gz2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final m80 g;
    public final l90 h;
    public final k90 i;
    public final p80 j;
    public final List k;
    public final int l;

    public l80(String str, String str2, String str3, long j, Long l, boolean z, m80 m80Var, l90 l90Var, k90 k90Var, p80 p80Var, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = m80Var;
        this.h = l90Var;
        this.i = k90Var;
        this.j = p80Var;
        this.k = list;
        this.l = i;
    }

    public final k80 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        obj.m = (byte) 7;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof gz2) {
                l80 l80Var = (l80) ((gz2) obj);
                if (this.a.equals(l80Var.a) && this.b.equals(l80Var.b)) {
                    String str = l80Var.c;
                    String str2 = this.c;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.d == l80Var.d) {
                        Long l = l80Var.e;
                        Long l2 = this.e;
                        if (l2 == null) {
                            if (l != null) {
                                return false;
                            }
                        } else if (!l2.equals(l)) {
                            return false;
                        }
                        if (this.f == l80Var.f && this.g.equals(l80Var.g)) {
                            l90 l90Var = l80Var.h;
                            l90 l90Var2 = this.h;
                            if (l90Var2 == null) {
                                if (l90Var != null) {
                                    return false;
                                }
                            } else if (!l90Var2.equals(l90Var)) {
                                return false;
                            }
                            k90 k90Var = l80Var.i;
                            k90 k90Var2 = this.i;
                            if (k90Var2 == null) {
                                if (k90Var != null) {
                                    return false;
                                }
                            } else if (!k90Var2.equals(k90Var)) {
                                return false;
                            }
                            p80 p80Var = l80Var.j;
                            p80 p80Var2 = this.j;
                            if (p80Var2 == null) {
                                if (p80Var != null) {
                                    return false;
                                }
                            } else if (!p80Var2.equals(p80Var)) {
                                return false;
                            }
                            List list = l80Var.k;
                            List list2 = this.k;
                            if (list2 == null) {
                                if (list != null) {
                                    return false;
                                }
                            } else if (!list2.equals(list)) {
                                return false;
                            }
                            if (this.l == l80Var.l) {
                                return true;
                            }
                            return false;
                        }
                        return false;
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
        int i;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i2 = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.d;
        int i3 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        if (this.f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode7 = (((i4 ^ i) * 1000003) ^ this.g.hashCode()) * 1000003;
        l90 l90Var = this.h;
        if (l90Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l90Var.hashCode();
        }
        int i5 = (hashCode7 ^ hashCode3) * 1000003;
        k90 k90Var = this.i;
        if (k90Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = k90Var.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        p80 p80Var = this.j;
        if (p80Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = p80Var.hashCode();
        }
        int i7 = (i6 ^ hashCode5) * 1000003;
        List list = this.k;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((i7 ^ i2) * 1000003) ^ this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return de9.l(sb, this.l, "}");
    }
}
