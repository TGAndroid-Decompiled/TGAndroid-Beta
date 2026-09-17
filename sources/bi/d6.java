package bi;

import android.text.TextUtils;
import j$.util.Objects;
public final class d6 {
    public boolean f2890a = true;
    public boolean f2891b;
    public String f2892c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && d6.class == obj.getClass()) {
                d6 d6Var = (d6) obj;
                if ((TextUtils.isEmpty(this.f2892c) && TextUtils.isEmpty(d6Var.f2892c)) || Objects.equals(this.f2892c, d6Var.f2892c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f2890a != d6Var.f2890a || this.f2891b != d6Var.f2891b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2890a), Boolean.valueOf(this.f2891b), this.f2892c);
    }
}
