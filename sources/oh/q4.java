package oh;

import android.text.TextUtils;
import j$.util.Objects;
public final class q4 {
    public boolean f17655a = true;
    public boolean f17656b;
    public String f17657c;

    public final boolean equals(Object obj) {
        boolean z4;
        if (this != obj) {
            if (obj != null && q4.class == obj.getClass()) {
                q4 q4Var = (q4) obj;
                if ((TextUtils.isEmpty(this.f17657c) && TextUtils.isEmpty(q4Var.f17657c)) || Objects.equals(this.f17657c, q4Var.f17657c)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f17655a != q4Var.f17655a || this.f17656b != q4Var.f17656b || !z4) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f17655a), Boolean.valueOf(this.f17656b), this.f17657c);
    }
}
