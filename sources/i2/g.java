package i2;

import android.text.TextUtils;
import v7.u6;
public final class g {
    public final String f12354a;
    public final b2.w f12355b;
    public final b2.w f12356c;
    public final int d;
    public final int e;

    public g(String str, b2.w wVar, b2.w wVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.g(z10);
        u6.g(true ^ TextUtils.isEmpty(str));
        this.f12354a = str;
        wVar.getClass();
        this.f12355b = wVar;
        wVar2.getClass();
        this.f12356c = wVar2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.d == gVar.d && this.e == gVar.e && this.f12354a.equals(gVar.f12354a) && this.f12355b.equals(gVar.f12355b) && this.f12356c.equals(gVar.f12356c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int g10 = a1.g.g((((527 + this.d) * 31) + this.e) * 31, 31, this.f12354a);
        return this.f12356c.hashCode() + ((this.f12355b.hashCode() + g10) * 31);
    }
}
