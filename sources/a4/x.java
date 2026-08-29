package a4;

import android.text.TextUtils;
import j7.l1;
public final class x {
    public final String f153a;
    public final boolean f154b;
    public final boolean f155c;

    public x(String str, boolean z10, boolean z11) {
        this.f153a = str;
        this.f154b = z10;
        this.f155c = z11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && obj.getClass() == x.class) {
                x xVar = (x) obj;
                if (TextUtils.equals(this.f153a, xVar.f153a) && this.f154b == xVar.f154b && this.f155c == xVar.f155c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int f9 = l1.f(31, 31, this.f153a);
        int i11 = 1237;
        if (this.f154b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (f9 + i10) * 31;
        if (this.f155c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
