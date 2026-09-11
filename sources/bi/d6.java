package bi;

import android.text.TextUtils;
import j$.util.Objects;
public final class d6 {
    public boolean f2863a = true;
    public boolean f2864b;
    public String f2865c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && d6.class == obj.getClass()) {
                d6 d6Var = (d6) obj;
                if ((TextUtils.isEmpty(this.f2865c) && TextUtils.isEmpty(d6Var.f2865c)) || Objects.equals(this.f2865c, d6Var.f2865c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f2863a != d6Var.f2863a || this.f2864b != d6Var.f2864b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2863a), Boolean.valueOf(this.f2864b), this.f2865c);
    }
}
