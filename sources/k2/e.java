package k2;

import android.text.TextUtils;
import b8.zb;
public final class e {
    public final String f16479a;
    public final d2.v f16480b;
    public final d2.v f16481c;
    public final int d;
    public final int f16482e;

    public e(String str, d2.v vVar, d2.v vVar2, int i3, int i10) {
        boolean z10;
        if (i3 != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        zb.f(z10);
        zb.f(true ^ TextUtils.isEmpty(str));
        this.f16479a = str;
        vVar.getClass();
        this.f16480b = vVar;
        vVar2.getClass();
        this.f16481c = vVar2;
        this.d = i3;
        this.f16482e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.f16482e == eVar.f16482e && this.f16479a.equals(eVar.f16479a) && this.f16480b.equals(eVar.f16480b) && this.f16481c.equals(eVar.f16481c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int g7 = com.google.android.recaptcha.internal.a.g((((527 + this.d) * 31) + this.f16482e) * 31, 31, this.f16479a);
        return this.f16481c.hashCode() + ((this.f16480b.hashCode() + g7) * 31);
    }
}
