package ai;

import android.text.TextUtils;
import j$.util.Objects;
public final class u6 {
    public boolean f1717a = true;
    public boolean f1718b;
    public String f1719c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && u6.class == obj.getClass()) {
                u6 u6Var = (u6) obj;
                if ((TextUtils.isEmpty(this.f1719c) && TextUtils.isEmpty(u6Var.f1719c)) || Objects.equals(this.f1719c, u6Var.f1719c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f1717a != u6Var.f1717a || this.f1718b != u6Var.f1718b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1717a), Boolean.valueOf(this.f1718b), this.f1719c);
    }
}
