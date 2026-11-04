package ei;

import android.text.TextUtils;
import j$.util.Objects;
public final class w4 {
    public boolean f11180a = true;
    public boolean f11181b;
    public String f11182c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && w4.class == obj.getClass()) {
                w4 w4Var = (w4) obj;
                if ((TextUtils.isEmpty(this.f11182c) && TextUtils.isEmpty(w4Var.f11182c)) || Objects.equals(this.f11182c, w4Var.f11182c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f11180a != w4Var.f11180a || this.f11181b != w4Var.f11181b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f11180a), Boolean.valueOf(this.f11181b), this.f11182c);
    }
}
