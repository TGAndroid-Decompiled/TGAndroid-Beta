package n3;

import android.text.TextUtils;
import j3.n0;
import kf.k0;
public final class k {
    public final String f14231a;
    public final n0 f14232b;
    public final n0 f14233c;
    public final int d;
    public final int e;

    public k(String str, n0 n0Var, n0 n0Var2, int i10, int i11) {
        boolean z4;
        if (i10 != 0 && i11 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.f(z4);
        if (!TextUtils.isEmpty(str)) {
            this.f14231a = str;
            n0Var.getClass();
            this.f14232b = n0Var;
            n0Var2.getClass();
            this.f14233c = n0Var2;
            this.d = i10;
            this.e = i11;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.d == kVar.d && this.e == kVar.e && this.f14231a.equals(kVar.f14231a) && this.f14232b.equals(kVar.f14232b) && this.f14233c.equals(kVar.f14233c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int e = k0.e((((527 + this.d) * 31) + this.e) * 31, 31, this.f14231a);
        return this.f14233c.hashCode() + ((this.f14232b.hashCode() + e) * 31);
    }
}
