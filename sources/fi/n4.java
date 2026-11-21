package fi;

import android.text.TextUtils;
import j$.util.Objects;
public final class n4 {
    public boolean f12337a = true;
    public boolean f12338b;
    public String f12339c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && n4.class == obj.getClass()) {
                n4 n4Var = (n4) obj;
                if ((TextUtils.isEmpty(this.f12339c) && TextUtils.isEmpty(n4Var.f12339c)) || Objects.equals(this.f12339c, n4Var.f12339c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f12337a != n4Var.f12337a || this.f12338b != n4Var.f12338b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f12337a), Boolean.valueOf(this.f12338b), this.f12339c);
    }
}
