package n3;

import android.text.TextUtils;
import j3.n0;
public final class k {
    public final String f15222a;
    public final n0 f15223b;
    public final n0 f15224c;
    public final int d;
    public final int f15225e;

    public k(String str, n0 n0Var, n0 n0Var2, int i10, int i11) {
        boolean z4;
        if (i10 != 0 && i11 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.f(z4);
        if (!TextUtils.isEmpty(str)) {
            this.f15222a = str;
            n0Var.getClass();
            this.f15223b = n0Var;
            n0Var2.getClass();
            this.f15224c = n0Var2;
            this.d = i10;
            this.f15225e = i11;
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
            if (this.d == kVar.d && this.f15225e == kVar.f15225e && this.f15222a.equals(kVar.f15222a) && this.f15223b.equals(kVar.f15223b) && this.f15224c.equals(kVar.f15224c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int e6 = l.d.e((((527 + this.d) * 31) + this.f15225e) * 31, 31, this.f15222a);
        return this.f15224c.hashCode() + ((this.f15223b.hashCode() + e6) * 31);
    }
}
