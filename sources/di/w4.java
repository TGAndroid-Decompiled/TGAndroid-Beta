package di;

import android.text.TextUtils;
import j$.util.Objects;
public final class w4 {
    public boolean f9901a = true;
    public boolean f9902b;
    public String f9903c;

    public final boolean equals(Object obj) {
        boolean z9;
        if (this != obj) {
            if (obj != null && w4.class == obj.getClass()) {
                w4 w4Var = (w4) obj;
                if ((TextUtils.isEmpty(this.f9903c) && TextUtils.isEmpty(w4Var.f9903c)) || Objects.equals(this.f9903c, w4Var.f9903c)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.f9901a != w4Var.f9901a || this.f9902b != w4Var.f9902b || !z9) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f9901a), Boolean.valueOf(this.f9902b), this.f9903c);
    }
}
