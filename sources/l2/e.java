package l2;

import a8.ia;
import android.text.TextUtils;
public final class e {
    public final String f17791a;
    public final e2.u f17792b;
    public final e2.u f17793c;
    public final int d;
    public final int f17794e;

    public e(String str, e2.u uVar, e2.u uVar2, int i7, int i10) {
        boolean z9;
        if (i7 != 0 && i10 != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.f(z9);
        ia.f(true ^ TextUtils.isEmpty(str));
        this.f17791a = str;
        uVar.getClass();
        this.f17792b = uVar;
        uVar2.getClass();
        this.f17793c = uVar2;
        this.d = i7;
        this.f17794e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.f17794e == eVar.f17794e && this.f17791a.equals(eVar.f17791a) && this.f17792b.equals(eVar.f17792b) && this.f17793c.equals(eVar.f17793c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = com.google.android.recaptcha.internal.a.h((((527 + this.d) * 31) + this.f17794e) * 31, 31, this.f17791a);
        return this.f17793c.hashCode() + ((this.f17792b.hashCode() + h) * 31);
    }
}
