package n3;

import android.text.TextUtils;
import j3.n0;
public final class k {
    public final String f15220a;
    public final n0 f15221b;
    public final n0 f15222c;
    public final int d;
    public final int f15223e;

    public k(String str, n0 n0Var, n0 n0Var2, int i10, int i11) {
        boolean z4;
        if (i10 != 0 && i11 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.f(z4);
        if (!TextUtils.isEmpty(str)) {
            this.f15220a = str;
            n0Var.getClass();
            this.f15221b = n0Var;
            n0Var2.getClass();
            this.f15222c = n0Var2;
            this.d = i10;
            this.f15223e = i11;
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
            if (this.d == kVar.d && this.f15223e == kVar.f15223e && this.f15220a.equals(kVar.f15220a) && this.f15221b.equals(kVar.f15221b) && this.f15222c.equals(kVar.f15222c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int e6 = l.d.e((((527 + this.d) * 31) + this.f15223e) * 31, 31, this.f15220a);
        return this.f15222c.hashCode() + ((this.f15221b.hashCode() + e6) * 31);
    }
}
