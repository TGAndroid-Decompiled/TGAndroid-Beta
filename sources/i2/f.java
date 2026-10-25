package i2;

import a8.yb;
import android.text.TextUtils;
public final class f {
    public final String f13527a;
    public final b2.x f13528b;
    public final b2.x f13529c;
    public final int d;
    public final int e;

    public f(String str, b2.x xVar, b2.x xVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        yb.g(z10);
        yb.g(true ^ TextUtils.isEmpty(str));
        this.f13527a = str;
        xVar.getClass();
        this.f13528b = xVar;
        xVar2.getClass();
        this.f13529c = xVar2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.d == fVar.d && this.e == fVar.e && this.f13527a.equals(fVar.f13527a) && this.f13528b.equals(fVar.f13528b) && this.f13529c.equals(fVar.f13529c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int f7 = a1.g.f((((527 + this.d) * 31) + this.e) * 31, 31, this.f13527a);
        return this.f13529c.hashCode() + ((this.f13528b.hashCode() + f7) * 31);
    }
}
