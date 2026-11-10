package di;

import android.text.TextUtils;
import j$.util.Objects;
public final class x4 {
    public boolean f9931a = true;
    public boolean f9932b;
    public String f9933c;

    public final boolean equals(Object obj) {
        boolean z9;
        if (this != obj) {
            if (obj != null && x4.class == obj.getClass()) {
                x4 x4Var = (x4) obj;
                if ((TextUtils.isEmpty(this.f9933c) && TextUtils.isEmpty(x4Var.f9933c)) || Objects.equals(this.f9933c, x4Var.f9933c)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.f9931a != x4Var.f9931a || this.f9932b != x4Var.f9932b || !z9) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f9931a), Boolean.valueOf(this.f9932b), this.f9933c);
    }
}
