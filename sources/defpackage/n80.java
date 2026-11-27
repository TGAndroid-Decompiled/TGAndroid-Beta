package defpackage;

import java.util.List;
public final class n80 extends b03 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final o80 g;
    public final n90 h;
    public final m90 i;
    public final r80 j;
    public final List k;
    public final int l;

    public n80(String str, String str2, String str3, long j, Long l, boolean z, o80 o80Var, n90 n90Var, m90 m90Var, r80 r80Var, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = o80Var;
        this.h = n90Var;
        this.i = m90Var;
        this.j = r80Var;
        this.k = list;
        this.l = i;
    }

    public final m80 a() {
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
            if (obj instanceof b03) {
                n80 n80Var = (n80) ((b03) obj);
                if (this.a.equals(n80Var.a) && this.b.equals(n80Var.b)) {
                    String str = n80Var.c;
                    String str2 = this.c;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.d == n80Var.d) {
                        Long l = n80Var.e;
                        Long l2 = this.e;
                        if (l2 == null) {
                            if (l != null) {
                                return false;
                            }
                        } else if (!l2.equals(l)) {
                            return false;
                        }
                        if (this.f == n80Var.f && this.g.equals(n80Var.g)) {
                            n90 n90Var = n80Var.h;
                            n90 n90Var2 = this.h;
                            if (n90Var2 == null) {
                                if (n90Var != null) {
                                    return false;
                                }
                            } else if (!n90Var2.equals(n90Var)) {
                                return false;
                            }
                            m90 m90Var = n80Var.i;
                            m90 m90Var2 = this.i;
                            if (m90Var2 == null) {
                                if (m90Var != null) {
                                    return false;
                                }
                            } else if (!m90Var2.equals(m90Var)) {
                                return false;
                            }
                            r80 r80Var = n80Var.j;
                            r80 r80Var2 = this.j;
                            if (r80Var2 == null) {
                                if (r80Var != null) {
                                    return false;
                                }
                            } else if (!r80Var2.equals(r80Var)) {
                                return false;
                            }
                            List list = n80Var.k;
                            List list2 = this.k;
                            if (list2 == null) {
                                if (list != null) {
                                    return false;
                                }
                            } else if (!list2.equals(list)) {
                                return false;
                            }
                            if (this.l == n80Var.l) {
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
        n90 n90Var = this.h;
        if (n90Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = n90Var.hashCode();
        }
        int i5 = (hashCode7 ^ hashCode3) * 1000003;
        m90 m90Var = this.i;
        if (m90Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = m90Var.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        r80 r80Var = this.j;
        if (r80Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = r80Var.hashCode();
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
        return uh9.l(sb, this.l, "}");
    }
}
