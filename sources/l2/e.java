package l2;

import a8.ia;
import android.text.TextUtils;
public final class e {
    public final String f17789a;
    public final e2.u f17790b;
    public final e2.u f17791c;
    public final int d;
    public final int f17792e;

    public e(String str, e2.u uVar, e2.u uVar2, int i7, int i10) {
        boolean z9;
        if (i7 != 0 && i10 != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.f(z9);
        ia.f(true ^ TextUtils.isEmpty(str));
        this.f17789a = str;
        uVar.getClass();
        this.f17790b = uVar;
        uVar2.getClass();
        this.f17791c = uVar2;
        this.d = i7;
        this.f17792e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.f17792e == eVar.f17792e && this.f17789a.equals(eVar.f17789a) && this.f17790b.equals(eVar.f17790b) && this.f17791c.equals(eVar.f17791c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = com.google.android.recaptcha.internal.a.h((((527 + this.d) * 31) + this.f17792e) * 31, 31, this.f17789a);
        return this.f17791c.hashCode() + ((this.f17790b.hashCode() + h) * 31);
    }
}
