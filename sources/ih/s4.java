package ih;

import android.text.TextUtils;
import j$.util.Objects;
public final class s4 {
    public boolean f12115a = true;
    public boolean f12116b;
    public String f12117c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && s4.class == obj.getClass()) {
                s4 s4Var = (s4) obj;
                if ((TextUtils.isEmpty(this.f12117c) && TextUtils.isEmpty(s4Var.f12117c)) || Objects.equals(this.f12117c, s4Var.f12117c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f12115a != s4Var.f12115a || this.f12116b != s4Var.f12116b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f12115a), Boolean.valueOf(this.f12116b), this.f12117c);
    }
}
