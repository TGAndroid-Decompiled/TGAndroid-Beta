package di;

import android.text.TextUtils;
import j$.util.Objects;
public final class e5 {
    public boolean f8519a = true;
    public boolean f8520b;
    public String f8521c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && e5.class == obj.getClass()) {
                e5 e5Var = (e5) obj;
                if ((TextUtils.isEmpty(this.f8521c) && TextUtils.isEmpty(e5Var.f8521c)) || Objects.equals(this.f8521c, e5Var.f8521c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f8519a != e5Var.f8519a || this.f8520b != e5Var.f8520b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f8519a), Boolean.valueOf(this.f8520b), this.f8521c);
    }
}
