package c9;

import j7.j5;
import kf.k0;
public final class m {
    public final u f2194a;
    public final int f2195b;
    public final int f2196c;

    public m(int i10, int i11, Class cls) {
        this(u.a(cls), i10, i11);
    }

    public static m a(u uVar) {
        return new m(uVar, 1, 0);
    }

    public static m b(Class cls) {
        return new m(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f2194a.equals(mVar.f2194a) && this.f2195b == mVar.f2195b && this.f2196c == mVar.f2196c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2194a.hashCode() ^ 1000003) * 1000003) ^ this.f2195b) * 1000003) ^ this.f2196c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f2194a);
        sb.append(", type=");
        int i10 = this.f2195b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i11 = this.f2196c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(k0.j(i11, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return android.support.v4.media.a.r(sb, str2, "}");
    }

    public m(u uVar, int i10, int i11) {
        j5.a(uVar, "Null dependency anInterface.");
        this.f2194a = uVar;
        this.f2195b = i10;
        this.f2196c = i11;
    }
}
