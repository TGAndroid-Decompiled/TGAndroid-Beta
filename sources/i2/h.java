package i2;

import android.text.TextUtils;
public final class h {
    public final String f10709a;
    public final b2.s f10710b;
    public final b2.s f10711c;
    public final int d;
    public final int e;

    public h(String str, b2.s sVar, b2.s sVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f10709a = str;
            sVar.getClass();
            this.f10710b = sVar;
            sVar2.getClass();
            this.f10711c = sVar2;
            this.d = i10;
            this.e = i11;
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
            if (this.d == hVar.d && this.e == hVar.e && this.f10709a.equals(hVar.f10709a) && this.f10710b.equals(hVar.f10710b) && this.f10711c.equals(hVar.f10711c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = a4.a.h((((527 + this.d) * 31) + this.e) * 31, 31, this.f10709a);
        return this.f10711c.hashCode() + ((this.f10710b.hashCode() + h) * 31);
    }
}
