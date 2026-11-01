package i2;

import android.text.TextUtils;
import v7.t6;
public final class e {
    public final String f7838a;
    public final b2.x f7839b;
    public final b2.x f7840c;
    public final int d;
    public final int e;

    public e(String str, b2.x xVar, b2.x xVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        t6.f(z10);
        t6.f(true ^ TextUtils.isEmpty(str));
        this.f7838a = str;
        xVar.getClass();
        this.f7839b = xVar;
        xVar2.getClass();
        this.f7840c = xVar2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.e == eVar.e && this.f7838a.equals(eVar.f7838a) && this.f7839b.equals(eVar.f7839b) && this.f7840c.equals(eVar.f7840c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int f7 = a1.g.f((((527 + this.d) * 31) + this.e) * 31, 31, this.f7838a);
        return this.f7840c.hashCode() + ((this.f7839b.hashCode() + f7) * 31);
    }
}
