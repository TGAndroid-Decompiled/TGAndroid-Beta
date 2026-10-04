package i2;

import android.text.TextUtils;
public final class h {
    public final String f11667a;
    public final b2.s f11668b;
    public final b2.s f11669c;
    public final int d;
    public final int f11670e;

    public h(String str, b2.s sVar, b2.s sVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f11667a = str;
            sVar.getClass();
            this.f11668b = sVar;
            sVar2.getClass();
            this.f11669c = sVar2;
            this.d = i10;
            this.f11670e = i11;
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
            if (this.d == hVar.d && this.f11670e == hVar.f11670e && this.f11667a.equals(hVar.f11667a) && this.f11668b.equals(hVar.f11668b) && this.f11669c.equals(hVar.f11669c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = a4.a.h((((527 + this.d) * 31) + this.f11670e) * 31, 31, this.f11667a);
        return this.f11669c.hashCode() + ((this.f11668b.hashCode() + h) * 31);
    }
}
