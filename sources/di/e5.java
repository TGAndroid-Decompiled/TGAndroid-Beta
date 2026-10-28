package di;

import android.text.TextUtils;
import j$.util.Objects;
public final class e5 {
    public boolean f8518a = true;
    public boolean f8519b;
    public String f8520c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && e5.class == obj.getClass()) {
                e5 e5Var = (e5) obj;
                if ((TextUtils.isEmpty(this.f8520c) && TextUtils.isEmpty(e5Var.f8520c)) || Objects.equals(this.f8520c, e5Var.f8520c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f8518a != e5Var.f8518a || this.f8519b != e5Var.f8519b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f8518a), Boolean.valueOf(this.f8519b), this.f8520c);
    }
}
