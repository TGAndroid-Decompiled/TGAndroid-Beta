package i2;

import android.text.TextUtils;
public final class h {
    public final String f11715a;
    public final b2.s f11716b;
    public final b2.s f11717c;
    public final int d;
    public final int f11718e;

    public h(String str, b2.s sVar, b2.s sVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f11715a = str;
            sVar.getClass();
            this.f11716b = sVar;
            sVar2.getClass();
            this.f11717c = sVar2;
            this.d = i10;
            this.f11718e = i11;
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
            if (this.d == hVar.d && this.f11718e == hVar.f11718e && this.f11715a.equals(hVar.f11715a) && this.f11716b.equals(hVar.f11716b) && this.f11717c.equals(hVar.f11717c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = a1.g.h((((527 + this.d) * 31) + this.f11718e) * 31, 31, this.f11715a);
        return this.f11717c.hashCode() + ((this.f11716b.hashCode() + h) * 31);
    }
}
