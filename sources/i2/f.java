package i2;

import android.text.TextUtils;
import v7.u6;
public final class f {
    public final String f12351a;
    public final b2.w f12352b;
    public final b2.w f12353c;
    public final int d;
    public final int e;

    public f(String str, b2.w wVar, b2.w wVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.g(z10);
        u6.g(true ^ TextUtils.isEmpty(str));
        this.f12351a = str;
        wVar.getClass();
        this.f12352b = wVar;
        wVar2.getClass();
        this.f12353c = wVar2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.d == fVar.d && this.e == fVar.e && this.f12351a.equals(fVar.f12351a) && this.f12352b.equals(fVar.f12352b) && this.f12353c.equals(fVar.f12353c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int g10 = a1.g.g((((527 + this.d) * 31) + this.e) * 31, 31, this.f12351a);
        return this.f12353c.hashCode() + ((this.f12352b.hashCode() + g10) * 31);
    }
}
