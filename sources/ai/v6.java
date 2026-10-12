package ai;

import android.text.TextUtils;
import j$.util.Objects;
public final class v6 {
    public boolean f1823a = true;
    public boolean f1824b;
    public String f1825c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && v6.class == obj.getClass()) {
                v6 v6Var = (v6) obj;
                if ((TextUtils.isEmpty(this.f1825c) && TextUtils.isEmpty(v6Var.f1825c)) || Objects.equals(this.f1825c, v6Var.f1825c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f1823a != v6Var.f1823a || this.f1824b != v6Var.f1824b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1823a), Boolean.valueOf(this.f1824b), this.f1825c);
    }
}
