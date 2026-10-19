package i2;

import android.text.TextUtils;
import v7.u6;
public final class g {
    public final String f12356a;
    public final b2.w f12357b;
    public final b2.w f12358c;
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
        this.f12356a = str;
        wVar.getClass();
        this.f12357b = wVar;
        wVar2.getClass();
        this.f12358c = wVar2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.d == gVar.d && this.e == gVar.e && this.f12356a.equals(gVar.f12356a) && this.f12357b.equals(gVar.f12357b) && this.f12358c.equals(gVar.f12358c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int g10 = a1.g.g((((527 + this.d) * 31) + this.e) * 31, 31, this.f12356a);
        return this.f12358c.hashCode() + ((this.f12357b.hashCode() + g10) * 31);
    }
}
