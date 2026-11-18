package fi;

import android.text.TextUtils;
import j$.util.Objects;
public final class m4 {
    public boolean f12267a = true;
    public boolean f12268b;
    public String f12269c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && m4.class == obj.getClass()) {
                m4 m4Var = (m4) obj;
                if ((TextUtils.isEmpty(this.f12269c) && TextUtils.isEmpty(m4Var.f12269c)) || Objects.equals(this.f12269c, m4Var.f12269c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f12267a != m4Var.f12267a || this.f12268b != m4Var.f12268b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f12267a), Boolean.valueOf(this.f12268b), this.f12269c);
    }
}
