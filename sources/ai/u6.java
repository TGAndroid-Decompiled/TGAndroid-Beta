package ai;

import android.text.TextUtils;
import j$.util.Objects;
public final class u6 {
    public boolean f1579a = true;
    public boolean f1580b;
    public String f1581c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && u6.class == obj.getClass()) {
                u6 u6Var = (u6) obj;
                if ((TextUtils.isEmpty(this.f1581c) && TextUtils.isEmpty(u6Var.f1581c)) || Objects.equals(this.f1581c, u6Var.f1581c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f1579a != u6Var.f1579a || this.f1580b != u6Var.f1580b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1579a), Boolean.valueOf(this.f1580b), this.f1581c);
    }
}
