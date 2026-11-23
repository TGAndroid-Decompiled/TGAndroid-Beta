package l2;

import a8.la;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
public final class e {
    public final String f19320a;
    public final e2.u f19321b;
    public final e2.u f19322c;
    public final int d;
    public final int f19323e;

    public e(String str, e2.u uVar, e2.u uVar2, int i7, int i10) {
        boolean z10;
        if (i7 != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.f(z10);
        la.f(true ^ TextUtils.isEmpty(str));
        this.f19320a = str;
        uVar.getClass();
        this.f19321b = uVar;
        uVar2.getClass();
        this.f19322c = uVar2;
        this.d = i7;
        this.f19323e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.f19323e == eVar.f19323e && this.f19320a.equals(eVar.f19320a) && this.f19321b.equals(eVar.f19321b) && this.f19322c.equals(eVar.f19322c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = e2.h((((527 + this.d) * 31) + this.f19323e) * 31, 31, this.f19320a);
        return this.f19322c.hashCode() + ((this.f19321b.hashCode() + h) * 31);
    }
}
