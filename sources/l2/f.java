package l2;

import a8.ma;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
public final class f {
    public final String f19390a;
    public final e2.u f19391b;
    public final e2.u f19392c;
    public final int d;
    public final int f19393e;

    public f(String str, e2.u uVar, e2.u uVar2, int i7, int i10) {
        boolean z10;
        if (i7 != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ma.f(z10);
        ma.f(true ^ TextUtils.isEmpty(str));
        this.f19390a = str;
        uVar.getClass();
        this.f19391b = uVar;
        uVar2.getClass();
        this.f19392c = uVar2;
        this.d = i7;
        this.f19393e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.d == fVar.d && this.f19393e == fVar.f19393e && this.f19390a.equals(fVar.f19390a) && this.f19391b.equals(fVar.f19391b) && this.f19392c.equals(fVar.f19392c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int h = e2.h((((527 + this.d) * 31) + this.f19393e) * 31, 31, this.f19390a);
        return this.f19392c.hashCode() + ((this.f19391b.hashCode() + h) * 31);
    }
}
