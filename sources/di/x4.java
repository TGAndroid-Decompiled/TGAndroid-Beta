package di;

import android.text.TextUtils;
import j$.util.Objects;
public final class x4 {
    public boolean f9926a = true;
    public boolean f9927b;
    public String f9928c;

    public final boolean equals(Object obj) {
        boolean z9;
        if (this != obj) {
            if (obj != null && x4.class == obj.getClass()) {
                x4 x4Var = (x4) obj;
                if ((TextUtils.isEmpty(this.f9928c) && TextUtils.isEmpty(x4Var.f9928c)) || Objects.equals(this.f9928c, x4Var.f9928c)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.f9926a != x4Var.f9926a || this.f9927b != x4Var.f9927b || !z9) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f9926a), Boolean.valueOf(this.f9927b), this.f9928c);
    }
}
