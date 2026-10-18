package ci;

import android.text.TextUtils;
import j$.util.Objects;
public final class e5 {
    public boolean f5286a = true;
    public boolean f5287b;
    public String f5288c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && e5.class == obj.getClass()) {
                e5 e5Var = (e5) obj;
                if ((TextUtils.isEmpty(this.f5288c) && TextUtils.isEmpty(e5Var.f5288c)) || Objects.equals(this.f5288c, e5Var.f5288c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f5286a != e5Var.f5286a || this.f5287b != e5Var.f5287b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f5286a), Boolean.valueOf(this.f5287b), this.f5288c);
    }
}
