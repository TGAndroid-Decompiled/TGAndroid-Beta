package l2;

import a8.ma;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
public final class e {
    public final String f19286a;
    public final e2.u f19287b;
    public final e2.u f19288c;
    public final int d;
    public final int f19289e;

    public e(String str, e2.u uVar, e2.u uVar2, int i7, int i10) {
        boolean z10;
        if (i7 != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ma.f(z10);
        ma.f(true ^ TextUtils.isEmpty(str));
        this.f19286a = str;
        uVar.getClass();
        this.f19287b = uVar;
        uVar2.getClass();
        this.f19288c = uVar2;
        this.d = i7;
        this.f19289e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.f19289e == eVar.f19289e && this.f19286a.equals(eVar.f19286a) && this.f19287b.equals(eVar.f19287b) && this.f19288c.equals(eVar.f19288c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = e2.h((((527 + this.d) * 31) + this.f19289e) * 31, 31, this.f19286a);
        return this.f19288c.hashCode() + ((this.f19287b.hashCode() + h) * 31);
    }
}
