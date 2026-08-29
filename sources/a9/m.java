package a9;

import j7.l1;
public final class m {
    public final v f257a;
    public final int f258b;
    public final int f259c;

    public m(int i10, int i11, Class cls) {
        this(v.a(cls), i10, i11);
    }

    public static m a(v vVar) {
        return new m(vVar, 1, 0);
    }

    public static m b(Class cls) {
        return new m(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f257a.equals(mVar.f257a) && this.f258b == mVar.f258b && this.f259c == mVar.f259c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f257a.hashCode() ^ 1000003) * 1000003) ^ this.f258b) * 1000003) ^ this.f259c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f257a);
        sb2.append(", type=");
        int i10 = this.f258b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f259c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(l1.k(i11, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return a4.w.q(sb2, str2, "}");
    }

    public m(v vVar, int i10, int i11) {
        h7.n.a(vVar, "Null dependency anInterface.");
        this.f257a = vVar;
        this.f258b = i10;
        this.f259c = i11;
    }
}
