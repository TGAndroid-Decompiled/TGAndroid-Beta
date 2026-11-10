package l2;

import a8.ia;
import android.text.TextUtils;
public final class e {
    public final String f17792a;
    public final e2.u f17793b;
    public final e2.u f17794c;
    public final int d;
    public final int f17795e;

    public e(String str, e2.u uVar, e2.u uVar2, int i7, int i10) {
        boolean z9;
        if (i7 != 0 && i10 != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.f(z9);
        ia.f(true ^ TextUtils.isEmpty(str));
        this.f17792a = str;
        uVar.getClass();
        this.f17793b = uVar;
        uVar2.getClass();
        this.f17794c = uVar2;
        this.d = i7;
        this.f17795e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.f17795e == eVar.f17795e && this.f17792a.equals(eVar.f17792a) && this.f17793b.equals(eVar.f17793b) && this.f17794c.equals(eVar.f17794c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = com.google.android.recaptcha.internal.a.h((((527 + this.d) * 31) + this.f17795e) * 31, 31, this.f17792a);
        return this.f17794c.hashCode() + ((this.f17793b.hashCode() + h) * 31);
    }
}
