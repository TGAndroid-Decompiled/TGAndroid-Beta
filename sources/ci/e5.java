package ci;

import android.text.TextUtils;
import j$.util.Objects;
public final class e5 {
    public boolean f5288a = true;
    public boolean f5289b;
    public String f5290c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && e5.class == obj.getClass()) {
                e5 e5Var = (e5) obj;
                if ((TextUtils.isEmpty(this.f5290c) && TextUtils.isEmpty(e5Var.f5290c)) || Objects.equals(this.f5290c, e5Var.f5290c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f5288a != e5Var.f5288a || this.f5289b != e5Var.f5289b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f5288a), Boolean.valueOf(this.f5289b), this.f5290c);
    }
}
