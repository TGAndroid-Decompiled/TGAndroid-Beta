package fi;

import android.text.TextUtils;
import j$.util.Objects;
public final class n4 {
    public boolean f12302a = true;
    public boolean f12303b;
    public String f12304c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && n4.class == obj.getClass()) {
                n4 n4Var = (n4) obj;
                if ((TextUtils.isEmpty(this.f12304c) && TextUtils.isEmpty(n4Var.f12304c)) || Objects.equals(this.f12304c, n4Var.f12304c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f12302a != n4Var.f12302a || this.f12303b != n4Var.f12303b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f12302a), Boolean.valueOf(this.f12303b), this.f12304c);
    }
}
