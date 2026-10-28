package i2;

import a8.yb;
import android.text.TextUtils;
public final class f {
    public final String f13526a;
    public final b2.x f13527b;
    public final b2.x f13528c;
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
        this.f13526a = str;
        xVar.getClass();
        this.f13527b = xVar;
        xVar2.getClass();
        this.f13528c = xVar2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.d == fVar.d && this.e == fVar.e && this.f13526a.equals(fVar.f13526a) && this.f13527b.equals(fVar.f13527b) && this.f13528c.equals(fVar.f13528c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int f7 = a1.g.f((((527 + this.d) * 31) + this.e) * 31, 31, this.f13526a);
        return this.f13528c.hashCode() + ((this.f13527b.hashCode() + f7) * 31);
    }
}
