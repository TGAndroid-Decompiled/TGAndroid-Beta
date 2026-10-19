package ci;

import android.text.TextUtils;
import j$.util.Objects;
public final class f5 {
    public boolean f5387a = true;
    public boolean f5388b;
    public String f5389c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && f5.class == obj.getClass()) {
                f5 f5Var = (f5) obj;
                if ((TextUtils.isEmpty(this.f5389c) && TextUtils.isEmpty(f5Var.f5389c)) || Objects.equals(this.f5389c, f5Var.f5389c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f5387a != f5Var.f5387a || this.f5388b != f5Var.f5388b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f5387a), Boolean.valueOf(this.f5388b), this.f5389c);
    }
}
