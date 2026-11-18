package l2;

import a8.la;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
public final class e {
    public final String f19292a;
    public final e2.u f19293b;
    public final e2.u f19294c;
    public final int d;
    public final int f19295e;

    public e(String str, e2.u uVar, e2.u uVar2, int i7, int i10) {
        boolean z10;
        if (i7 != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.f(z10);
        la.f(true ^ TextUtils.isEmpty(str));
        this.f19292a = str;
        uVar.getClass();
        this.f19293b = uVar;
        uVar2.getClass();
        this.f19294c = uVar2;
        this.d = i7;
        this.f19295e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.f19295e == eVar.f19295e && this.f19292a.equals(eVar.f19292a) && this.f19293b.equals(eVar.f19293b) && this.f19294c.equals(eVar.f19294c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = e2.h((((527 + this.d) * 31) + this.f19295e) * 31, 31, this.f19292a);
        return this.f19294c.hashCode() + ((this.f19293b.hashCode() + h) * 31);
    }
}
