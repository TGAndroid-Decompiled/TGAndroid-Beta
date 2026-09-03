package oh;

import android.text.TextUtils;
import j$.util.Objects;
public final class q4 {
    public boolean f17657a = true;
    public boolean f17658b;
    public String f17659c;

    public final boolean equals(Object obj) {
        boolean z4;
        if (this != obj) {
            if (obj != null && q4.class == obj.getClass()) {
                q4 q4Var = (q4) obj;
                if ((TextUtils.isEmpty(this.f17659c) && TextUtils.isEmpty(q4Var.f17659c)) || Objects.equals(this.f17659c, q4Var.f17659c)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f17657a != q4Var.f17657a || this.f17658b != q4Var.f17658b || !z4) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f17657a), Boolean.valueOf(this.f17658b), this.f17659c);
    }
}
