package ci;

import android.text.TextUtils;
import j$.util.Objects;
public final class f5 {
    public boolean f5388a = true;
    public boolean f5389b;
    public String f5390c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && f5.class == obj.getClass()) {
                f5 f5Var = (f5) obj;
                if ((TextUtils.isEmpty(this.f5390c) && TextUtils.isEmpty(f5Var.f5390c)) || Objects.equals(this.f5390c, f5Var.f5390c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f5388a != f5Var.f5388a || this.f5389b != f5Var.f5389b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f5388a), Boolean.valueOf(this.f5389b), this.f5390c);
    }
}
