package fi;

import android.text.TextUtils;
import j$.util.Objects;
public final class n4 {
    public boolean f12340a = true;
    public boolean f12341b;
    public String f12342c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && n4.class == obj.getClass()) {
                n4 n4Var = (n4) obj;
                if ((TextUtils.isEmpty(this.f12342c) && TextUtils.isEmpty(n4Var.f12342c)) || Objects.equals(this.f12342c, n4Var.f12342c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f12340a != n4Var.f12340a || this.f12341b != n4Var.f12341b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f12340a), Boolean.valueOf(this.f12341b), this.f12342c);
    }
}
