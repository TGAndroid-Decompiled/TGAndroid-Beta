package i2;

import android.text.TextUtils;
import v7.t6;
public final class e {
    public final String f7837a;
    public final b2.x f7838b;
    public final b2.x f7839c;
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
        this.f7837a = str;
        xVar.getClass();
        this.f7838b = xVar;
        xVar2.getClass();
        this.f7839c = xVar2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.e == eVar.e && this.f7837a.equals(eVar.f7837a) && this.f7838b.equals(eVar.f7838b) && this.f7839c.equals(eVar.f7839c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int f7 = a1.g.f((((527 + this.d) * 31) + this.e) * 31, 31, this.f7837a);
        return this.f7839c.hashCode() + ((this.f7838b.hashCode() + f7) * 31);
    }
}
