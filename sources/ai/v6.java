package ai;

import android.text.TextUtils;
import j$.util.Objects;
public final class v6 {
    public boolean f1825a = true;
    public boolean f1826b;
    public String f1827c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && v6.class == obj.getClass()) {
                v6 v6Var = (v6) obj;
                if ((TextUtils.isEmpty(this.f1827c) && TextUtils.isEmpty(v6Var.f1827c)) || Objects.equals(this.f1827c, v6Var.f1827c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f1825a != v6Var.f1825a || this.f1826b != v6Var.f1826b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1825a), Boolean.valueOf(this.f1826b), this.f1827c);
    }
}
