package ai;

import android.text.TextUtils;
import j$.util.Objects;
public final class u6 {
    public boolean f1575a = true;
    public boolean f1576b;
    public String f1577c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && u6.class == obj.getClass()) {
                u6 u6Var = (u6) obj;
                if ((TextUtils.isEmpty(this.f1577c) && TextUtils.isEmpty(u6Var.f1577c)) || Objects.equals(this.f1577c, u6Var.f1577c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f1575a != u6Var.f1575a || this.f1576b != u6Var.f1576b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1575a), Boolean.valueOf(this.f1576b), this.f1577c);
    }
}
