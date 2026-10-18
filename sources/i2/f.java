package i2;

import android.text.TextUtils;
import v7.u6;
public final class f {
    public final String f12353a;
    public final b2.w f12354b;
    public final b2.w f12355c;
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
        this.f12353a = str;
        wVar.getClass();
        this.f12354b = wVar;
        wVar2.getClass();
        this.f12355c = wVar2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.d == fVar.d && this.e == fVar.e && this.f12353a.equals(fVar.f12353a) && this.f12354b.equals(fVar.f12354b) && this.f12355c.equals(fVar.f12355c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int g10 = a1.g.g((((527 + this.d) * 31) + this.e) * 31, 31, this.f12353a);
        return this.f12355c.hashCode() + ((this.f12354b.hashCode() + g10) * 31);
    }
}
