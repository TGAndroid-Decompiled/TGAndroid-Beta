package c9;

import j7.k5;
public final class l {
    public final t f2360a;
    public final int f2361b;
    public final int f2362c;

    public l(int i10, int i11, Class cls) {
        this(t.a(cls), i10, i11);
    }

    public static l a(t tVar) {
        return new l(tVar, 1, 0);
    }

    public static l b(Class cls) {
        return new l(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f2360a.equals(lVar.f2360a) && this.f2361b == lVar.f2361b && this.f2362c == lVar.f2362c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2360a.hashCode() ^ 1000003) * 1000003) ^ this.f2361b) * 1000003) ^ this.f2362c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f2360a);
        sb.append(", type=");
        int i10 = this.f2361b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i11 = this.f2362c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(l.d.j(i11, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return android.support.v4.media.a.r(sb, str2, "}");
    }

    public l(t tVar, int i10, int i11) {
        k5.a(tVar, "Null dependency anInterface.");
        this.f2360a = tVar;
        this.f2361b = i10;
        this.f2362c = i11;
    }
}
