package k3;

import android.text.TextUtils;
import h3.t0;

public final class l {

    public final String f14433a;

    public final t0 f14434b;

    public final t0 f14435c;
    public final int d;

    public final int f14436e;

    public l(String str, t0 t0Var, t0 t0Var2, int i10, int i11) {
        d5.a.f(i10 == 0 || i11 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f14433a = str;
        t0Var.getClass();
        this.f14434b = t0Var;
        t0Var2.getClass();
        this.f14435c = t0Var2;
        this.d = i10;
        this.f14436e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.d == lVar.d && this.f14436e == lVar.f14436e && this.f14433a.equals(lVar.f14433a) && this.f14434b.equals(lVar.f14434b) && this.f14435c.equals(lVar.f14435c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14435c.hashCode() + ((this.f14434b.hashCode() + i0.a.g((((527 + this.d) * 31) + this.f14436e) * 31, 31, this.f14433a)) * 31);
    }
}
