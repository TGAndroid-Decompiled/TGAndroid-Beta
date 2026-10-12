package i2;

import android.text.TextUtils;
import v7.u6;
public final class f {
    public final String f10953a;
    public final b2.x f10954b;
    public final b2.x f10955c;
    public final int d;
    public final int e;

    public f(String str, b2.x xVar, b2.x xVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.g(z10);
        u6.g(true ^ TextUtils.isEmpty(str));
        this.f10953a = str;
        xVar.getClass();
        this.f10954b = xVar;
        xVar2.getClass();
        this.f10955c = xVar2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.d == fVar.d && this.e == fVar.e && this.f10953a.equals(fVar.f10953a) && this.f10954b.equals(fVar.f10954b) && this.f10955c.equals(fVar.f10955c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int g10 = a1.g.g((((527 + this.d) * 31) + this.e) * 31, 31, this.f10953a);
        return this.f10955c.hashCode() + ((this.f10954b.hashCode() + g10) * 31);
    }
}
