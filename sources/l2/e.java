package l2;

import a8.la;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
public final class e {
    public final String f19317a;
    public final e2.u f19318b;
    public final e2.u f19319c;
    public final int d;
    public final int f19320e;

    public e(String str, e2.u uVar, e2.u uVar2, int i7, int i10) {
        boolean z10;
        if (i7 != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.f(z10);
        la.f(true ^ TextUtils.isEmpty(str));
        this.f19317a = str;
        uVar.getClass();
        this.f19318b = uVar;
        uVar2.getClass();
        this.f19319c = uVar2;
        this.d = i7;
        this.f19320e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.d == eVar.d && this.f19320e == eVar.f19320e && this.f19317a.equals(eVar.f19317a) && this.f19318b.equals(eVar.f19318b) && this.f19319c.equals(eVar.f19319c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = e2.h((((527 + this.d) * 31) + this.f19320e) * 31, 31, this.f19317a);
        return this.f19319c.hashCode() + ((this.f19318b.hashCode() + h) * 31);
    }
}
