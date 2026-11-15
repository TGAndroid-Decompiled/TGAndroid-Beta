package l2;

import a8.ja;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
public final class e {
    public final String f18925a;
    public final e2.u f18926b;
    public final e2.u f18927c;
    public final int d;
    public final int f18928e;

    public e(String str, e2.u uVar, e2.u uVar2, int i7, int i10) {
        boolean z10;
        if (i7 != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ja.f(z10);
        ja.f(true ^ TextUtils.isEmpty(str));
        this.f18925a = str;
        uVar.getClass();
        this.f18926b = uVar;
        uVar2.getClass();
        this.f18927c = uVar2;
        this.d = i7;
        this.f18928e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.f18928e == eVar.f18928e && this.f18925a.equals(eVar.f18925a) && this.f18926b.equals(eVar.f18926b) && this.f18927c.equals(eVar.f18927c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = e2.h((((527 + this.d) * 31) + this.f18928e) * 31, 31, this.f18925a);
        return this.f18927c.hashCode() + ((this.f18926b.hashCode() + h) * 31);
    }
}
