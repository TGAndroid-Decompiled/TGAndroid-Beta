package k3;

import android.text.TextUtils;
import h3.t0;
import j3.r0;
public final class l {
    public final String f14612a;
    public final t0 f14613b;
    public final t0 f14614c;
    public final int d;
    public final int f14615e;

    public l(String str, t0 t0Var, t0 t0Var2, int i9, int i10) {
        boolean z10;
        if (i9 != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        d5.a.f(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f14612a = str;
            t0Var.getClass();
            this.f14613b = t0Var;
            t0Var2.getClass();
            this.f14614c = t0Var2;
            this.d = i9;
            this.f14615e = i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.d == lVar.d && this.f14615e == lVar.f14615e && this.f14612a.equals(lVar.f14612a) && this.f14613b.equals(lVar.f14613b) && this.f14614c.equals(lVar.f14614c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int f10 = r0.f((((527 + this.d) * 31) + this.f14615e) * 31, 31, this.f14612a);
        return this.f14614c.hashCode() + ((this.f14613b.hashCode() + f10) * 31);
    }
}
