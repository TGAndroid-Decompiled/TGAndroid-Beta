package n3;

import android.text.TextUtils;
import j3.n0;
import kh.a2;
public final class k {
    public final String f14246a;
    public final n0 f14247b;
    public final n0 f14248c;
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
            this.f14246a = str;
            n0Var.getClass();
            this.f14247b = n0Var;
            n0Var2.getClass();
            this.f14248c = n0Var2;
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
            if (this.d == kVar.d && this.e == kVar.e && this.f14246a.equals(kVar.f14246a) && this.f14247b.equals(kVar.f14247b) && this.f14248c.equals(kVar.f14248c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int e = a2.e((((527 + this.d) * 31) + this.e) * 31, 31, this.f14246a);
        return this.f14248c.hashCode() + ((this.f14247b.hashCode() + e) * 31);
    }
}
