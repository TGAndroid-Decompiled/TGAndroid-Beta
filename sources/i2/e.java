package i2;

import android.text.TextUtils;
import v7.u6;
public final class e {
    public final String f12350a;
    public final b2.w f12351b;
    public final b2.w f12352c;
    public final int d;
    public final int e;

    public e(String str, b2.w wVar, b2.w wVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.g(z10);
        u6.g(true ^ TextUtils.isEmpty(str));
        this.f12350a = str;
        wVar.getClass();
        this.f12351b = wVar;
        wVar2.getClass();
        this.f12352c = wVar2;
        this.d = i10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.e == eVar.e && this.f12350a.equals(eVar.f12350a) && this.f12351b.equals(eVar.f12351b) && this.f12352c.equals(eVar.f12352c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int g10 = a1.g.g((((527 + this.d) * 31) + this.e) * 31, 31, this.f12350a);
        return this.f12352c.hashCode() + ((this.f12351b.hashCode() + g10) * 31);
    }
}
