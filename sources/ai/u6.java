package ai;

import android.text.TextUtils;
import j$.util.Objects;
public final class u6 {
    public boolean f1577a = true;
    public boolean f1578b;
    public String f1579c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && u6.class == obj.getClass()) {
                u6 u6Var = (u6) obj;
                if ((TextUtils.isEmpty(this.f1579c) && TextUtils.isEmpty(u6Var.f1579c)) || Objects.equals(this.f1579c, u6Var.f1579c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f1577a != u6Var.f1577a || this.f1578b != u6Var.f1578b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1577a), Boolean.valueOf(this.f1578b), this.f1579c);
    }
}
