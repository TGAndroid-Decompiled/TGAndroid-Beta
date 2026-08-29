package m3;

import android.text.TextUtils;
import j3.t0;
import j7.l1;
public final class l {
    public final String f16832a;
    public final t0 f16833b;
    public final t0 f16834c;
    public final int d;
    public final int f16835e;

    public l(String str, t0 t0Var, t0 t0Var2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        f5.a.f(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f16832a = str;
            t0Var.getClass();
            this.f16833b = t0Var;
            t0Var2.getClass();
            this.f16834c = t0Var2;
            this.d = i10;
            this.f16835e = i11;
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
            if (this.d == lVar.d && this.f16835e == lVar.f16835e && this.f16832a.equals(lVar.f16832a) && this.f16833b.equals(lVar.f16833b) && this.f16834c.equals(lVar.f16834c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int f9 = l1.f((((527 + this.d) * 31) + this.f16835e) * 31, 31, this.f16832a);
        return this.f16834c.hashCode() + ((this.f16833b.hashCode() + f9) * 31);
    }
}
