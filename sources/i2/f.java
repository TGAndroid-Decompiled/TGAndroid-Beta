package i2;

import android.text.TextUtils;
import v7.u6;
public final class f {
    public final String f10957a;
    public final b2.x f10958b;
    public final b2.x f10959c;
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
        this.f10957a = str;
        xVar.getClass();
        this.f10958b = xVar;
        xVar2.getClass();
        this.f10959c = xVar2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.d == fVar.d && this.e == fVar.e && this.f10957a.equals(fVar.f10957a) && this.f10958b.equals(fVar.f10958b) && this.f10959c.equals(fVar.f10959c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int g10 = a1.g.g((((527 + this.d) * 31) + this.e) * 31, 31, this.f10957a);
        return this.f10959c.hashCode() + ((this.f10958b.hashCode() + g10) * 31);
    }
}
