package c9;

import j7.j5;
import kh.a2;
public final class l {
    public final t f2170a;
    public final int f2171b;
    public final int f2172c;

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
            if (this.f2170a.equals(lVar.f2170a) && this.f2171b == lVar.f2171b && this.f2172c == lVar.f2172c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2170a.hashCode() ^ 1000003) * 1000003) ^ this.f2171b) * 1000003) ^ this.f2172c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f2170a);
        sb.append(", type=");
        int i10 = this.f2171b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i11 = this.f2172c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(a2.j(i11, "Unsupported injection: "));
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
        j5.a(tVar, "Null dependency anInterface.");
        this.f2170a = tVar;
        this.f2171b = i10;
        this.f2172c = i11;
    }
}
