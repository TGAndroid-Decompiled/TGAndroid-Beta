package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class c0 {
    public final String f16453a;
    public final int f16454b;
    public final int f16455c;

    public c0(String str, int i10, int i11) {
        this.f16453a = str;
        this.f16454b = i10;
        this.f16455c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i10 = c0Var.f16455c;
        String str = c0Var.f16453a;
        int i11 = c0Var.f16454b;
        int i12 = this.f16455c;
        String str2 = this.f16453a;
        int i13 = this.f16454b;
        if (i13 >= 0 && i11 >= 0) {
            if (TextUtils.equals(str2, str) && i13 == i11 && i12 == i10) {
                return true;
            }
            return false;
        } else if (TextUtils.equals(str2, str) && i12 == i10) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f16453a, Integer.valueOf(this.f16455c));
    }
}
