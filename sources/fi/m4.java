package fi;

import android.text.TextUtils;
import j$.util.Objects;
public final class m4 {
    public boolean f12264a = true;
    public boolean f12265b;
    public String f12266c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && m4.class == obj.getClass()) {
                m4 m4Var = (m4) obj;
                if ((TextUtils.isEmpty(this.f12266c) && TextUtils.isEmpty(m4Var.f12266c)) || Objects.equals(this.f12266c, m4Var.f12266c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f12264a != m4Var.f12264a || this.f12265b != m4Var.f12265b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f12264a), Boolean.valueOf(this.f12265b), this.f12266c);
    }
}
