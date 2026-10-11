package i2;

import android.text.TextUtils;
public final class h {
    public final String f11716a;
    public final b2.s f11717b;
    public final b2.s f11718c;
    public final int d;
    public final int f11719e;

    public h(String str, b2.s sVar, b2.s sVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f11716a = str;
            sVar.getClass();
            this.f11717b = sVar;
            sVar2.getClass();
            this.f11718c = sVar2;
            this.d = i10;
            this.f11719e = i11;
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
            if (this.d == hVar.d && this.f11719e == hVar.f11719e && this.f11716a.equals(hVar.f11716a) && this.f11717b.equals(hVar.f11717b) && this.f11718c.equals(hVar.f11718c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = a1.g.h((((527 + this.d) * 31) + this.f11719e) * 31, 31, this.f11716a);
        return this.f11718c.hashCode() + ((this.f11717b.hashCode() + h) * 31);
    }
}
