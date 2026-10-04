package i2;

import android.text.TextUtils;
public final class h {
    public final String f11666a;
    public final b2.s f11667b;
    public final b2.s f11668c;
    public final int d;
    public final int f11669e;

    public h(String str, b2.s sVar, b2.s sVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f11666a = str;
            sVar.getClass();
            this.f11667b = sVar;
            sVar2.getClass();
            this.f11668c = sVar2;
            this.d = i10;
            this.f11669e = i11;
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
            if (this.d == hVar.d && this.f11669e == hVar.f11669e && this.f11666a.equals(hVar.f11666a) && this.f11667b.equals(hVar.f11667b) && this.f11668c.equals(hVar.f11668c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = a4.a.h((((527 + this.d) * 31) + this.f11669e) * 31, 31, this.f11666a);
        return this.f11668c.hashCode() + ((this.f11667b.hashCode() + h) * 31);
    }
}
