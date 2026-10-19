package ci;

import android.text.TextUtils;
import j$.util.Objects;
public final class f5 {
    public boolean f5385a = true;
    public boolean f5386b;
    public String f5387c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && f5.class == obj.getClass()) {
                f5 f5Var = (f5) obj;
                if ((TextUtils.isEmpty(this.f5387c) && TextUtils.isEmpty(f5Var.f5387c)) || Objects.equals(this.f5387c, f5Var.f5387c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f5385a != f5Var.f5385a || this.f5386b != f5Var.f5386b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f5385a), Boolean.valueOf(this.f5386b), this.f5387c);
    }
}
