package i2;

import android.text.TextUtils;
public final class i {
    public final String f11584a;
    public final b2.s f11585b;
    public final b2.s f11586c;
    public final int d;
    public final int f11587e;

    public i(String str, b2.s sVar, b2.s sVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f11584a = str;
            sVar.getClass();
            this.f11585b = sVar;
            sVar2.getClass();
            this.f11586c = sVar2;
            this.d = i10;
            this.f11587e = i11;
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
            if (this.d == iVar.d && this.f11587e == iVar.f11587e && this.f11584a.equals(iVar.f11584a) && this.f11585b.equals(iVar.f11585b) && this.f11586c.equals(iVar.f11586c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = a4.a.h((((527 + this.d) * 31) + this.f11587e) * 31, 31, this.f11584a);
        return this.f11586c.hashCode() + ((this.f11585b.hashCode() + h) * 31);
    }
}
