package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class c0 {
    public final String f13760a;
    public final int f13761b;
    public final int f13762c;

    public c0(String str, int i10, int i11) {
        this.f13760a = str;
        this.f13761b = i10;
        this.f13762c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i10 = c0Var.f13762c;
        String str = c0Var.f13760a;
        int i11 = c0Var.f13761b;
        int i12 = this.f13762c;
        String str2 = this.f13760a;
        int i13 = this.f13761b;
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
        return Objects.hash(this.f13760a, Integer.valueOf(this.f13762c));
    }
}
