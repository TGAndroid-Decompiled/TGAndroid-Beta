package i2;

import android.text.TextUtils;
public final class h {
    public final String f10215a;
    public final b2.s f10216b;
    public final b2.s f10217c;
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
            this.f10215a = str;
            sVar.getClass();
            this.f10216b = sVar;
            sVar2.getClass();
            this.f10217c = sVar2;
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
            if (this.d == hVar.d && this.e == hVar.e && this.f10215a.equals(hVar.f10215a) && this.f10216b.equals(hVar.f10216b) && this.f10217c.equals(hVar.f10217c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = a4.a.h((((527 + this.d) * 31) + this.e) * 31, 31, this.f10215a);
        return this.f10217c.hashCode() + ((this.f10216b.hashCode() + h) * 31);
    }
}
