package fi;

import android.text.TextUtils;
import j$.util.Objects;
public final class m4 {
    public boolean f12259a = true;
    public boolean f12260b;
    public String f12261c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && m4.class == obj.getClass()) {
                m4 m4Var = (m4) obj;
                if ((TextUtils.isEmpty(this.f12261c) && TextUtils.isEmpty(m4Var.f12261c)) || Objects.equals(this.f12261c, m4Var.f12261c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f12259a != m4Var.f12259a || this.f12260b != m4Var.f12260b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f12259a), Boolean.valueOf(this.f12260b), this.f12261c);
    }
}
