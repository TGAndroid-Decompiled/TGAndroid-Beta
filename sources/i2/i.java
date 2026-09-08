package i2;

import android.text.TextUtils;
public final class i {
    public final String f11610a;
    public final b2.s f11611b;
    public final b2.s f11612c;
    public final int d;
    public final int f11613e;

    public i(String str, b2.s sVar, b2.s sVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f11610a = str;
            sVar.getClass();
            this.f11611b = sVar;
            sVar2.getClass();
            this.f11612c = sVar2;
            this.d = i10;
            this.f11613e = i11;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.d == iVar.d && this.f11613e == iVar.f11613e && this.f11610a.equals(iVar.f11610a) && this.f11611b.equals(iVar.f11611b) && this.f11612c.equals(iVar.f11612c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = a4.a.h((((527 + this.d) * 31) + this.f11613e) * 31, 31, this.f11610a);
        return this.f11612c.hashCode() + ((this.f11611b.hashCode() + h) * 31);
    }
}
