package i2;

import android.text.TextUtils;
public final class h {
    public final String f11717a;
    public final b2.s f11718b;
    public final b2.s f11719c;
    public final int d;
    public final int f11720e;

    public h(String str, b2.s sVar, b2.s sVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f11717a = str;
            sVar.getClass();
            this.f11718b = sVar;
            sVar2.getClass();
            this.f11719c = sVar2;
            this.d = i10;
            this.f11720e = i11;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.d == hVar.d && this.f11720e == hVar.f11720e && this.f11717a.equals(hVar.f11717a) && this.f11718b.equals(hVar.f11718b) && this.f11719c.equals(hVar.f11719c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = a1.g.h((((527 + this.d) * 31) + this.f11720e) * 31, 31, this.f11717a);
        return this.f11719c.hashCode() + ((this.f11718b.hashCode() + h) * 31);
    }
}
