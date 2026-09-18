package ai;

import android.text.TextUtils;
import j$.util.Objects;
public final class u6 {
    public boolean f1578a = true;
    public boolean f1579b;
    public String f1580c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && u6.class == obj.getClass()) {
                u6 u6Var = (u6) obj;
                if ((TextUtils.isEmpty(this.f1580c) && TextUtils.isEmpty(u6Var.f1580c)) || Objects.equals(this.f1580c, u6Var.f1580c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f1578a != u6Var.f1578a || this.f1579b != u6Var.f1579b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1578a), Boolean.valueOf(this.f1579b), this.f1580c);
    }
}
