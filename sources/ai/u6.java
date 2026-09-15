package ai;

import android.text.TextUtils;
import j$.util.Objects;
public final class u6 {
    public boolean f1573a = true;
    public boolean f1574b;
    public String f1575c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && u6.class == obj.getClass()) {
                u6 u6Var = (u6) obj;
                if ((TextUtils.isEmpty(this.f1575c) && TextUtils.isEmpty(u6Var.f1575c)) || Objects.equals(this.f1575c, u6Var.f1575c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f1573a != u6Var.f1573a || this.f1574b != u6Var.f1574b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1573a), Boolean.valueOf(this.f1574b), this.f1575c);
    }
}
