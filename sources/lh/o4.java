package lh;

import android.text.TextUtils;
import j$.util.Objects;
public final class o4 {
    public boolean f16017a = true;
    public boolean f16018b;
    public String f16019c;

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && o4.class == obj.getClass()) {
                o4 o4Var = (o4) obj;
                if ((TextUtils.isEmpty(this.f16019c) && TextUtils.isEmpty(o4Var.f16019c)) || Objects.equals(this.f16019c, o4Var.f16019c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f16017a != o4Var.f16017a || this.f16018b != o4Var.f16018b || !z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f16017a), Boolean.valueOf(this.f16018b), this.f16019c);
    }
}
