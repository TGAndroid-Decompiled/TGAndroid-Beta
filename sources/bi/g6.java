package bi;

import android.text.TextUtils;
import j$.util.Objects;
public final class g6 {
    public boolean f3081a = true;
    public boolean f3082b;
    public String f3083c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && g6.class == obj.getClass()) {
                g6 g6Var = (g6) obj;
                if ((TextUtils.isEmpty(this.f3083c) && TextUtils.isEmpty(g6Var.f3083c)) || Objects.equals(this.f3083c, g6Var.f3083c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f3081a != g6Var.f3081a || this.f3082b != g6Var.f3082b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3081a), Boolean.valueOf(this.f3082b), this.f3083c);
    }
}
