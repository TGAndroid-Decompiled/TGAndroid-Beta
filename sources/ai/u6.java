package ai;

import android.text.TextUtils;
import j$.util.Objects;
public final class u6 {
    public boolean f1582a = true;
    public boolean f1583b;
    public String f1584c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && u6.class == obj.getClass()) {
                u6 u6Var = (u6) obj;
                if ((TextUtils.isEmpty(this.f1584c) && TextUtils.isEmpty(u6Var.f1584c)) || Objects.equals(this.f1584c, u6Var.f1584c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f1582a != u6Var.f1582a || this.f1583b != u6Var.f1583b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1582a), Boolean.valueOf(this.f1583b), this.f1584c);
    }
}
