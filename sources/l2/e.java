package l2;

import a8.ia;
import android.text.TextUtils;
public final class e {
    public final String f17788a;
    public final e2.u f17789b;
    public final e2.u f17790c;
    public final int d;
    public final int f17791e;

    public e(String str, e2.u uVar, e2.u uVar2, int i7, int i10) {
        boolean z9;
        if (i7 != 0 && i10 != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.f(z9);
        ia.f(true ^ TextUtils.isEmpty(str));
        this.f17788a = str;
        uVar.getClass();
        this.f17789b = uVar;
        uVar2.getClass();
        this.f17790c = uVar2;
        this.d = i7;
        this.f17791e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.f17791e == eVar.f17791e && this.f17788a.equals(eVar.f17788a) && this.f17789b.equals(eVar.f17789b) && this.f17790c.equals(eVar.f17790c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = com.google.android.recaptcha.internal.a.h((((527 + this.d) * 31) + this.f17791e) * 31, 31, this.f17788a);
        return this.f17790c.hashCode() + ((this.f17789b.hashCode() + h) * 31);
    }
}
