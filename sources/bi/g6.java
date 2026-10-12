package bi;

import android.text.TextUtils;
import j$.util.Objects;
public final class g6 {
    public boolean f3077a = true;
    public boolean f3078b;
    public String f3079c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && g6.class == obj.getClass()) {
                g6 g6Var = (g6) obj;
                if ((TextUtils.isEmpty(this.f3079c) && TextUtils.isEmpty(g6Var.f3079c)) || Objects.equals(this.f3079c, g6Var.f3079c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f3077a != g6Var.f3077a || this.f3078b != g6Var.f3078b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3077a), Boolean.valueOf(this.f3078b), this.f3079c);
    }
}
