package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class c0 {
    public final String f16426a;
    public final int f16427b;
    public final int f16428c;

    public c0(String str, int i10, int i11) {
        this.f16426a = str;
        this.f16427b = i10;
        this.f16428c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i10 = c0Var.f16428c;
        String str = c0Var.f16426a;
        int i11 = c0Var.f16427b;
        int i12 = this.f16428c;
        String str2 = this.f16426a;
        int i13 = this.f16427b;
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
        return Objects.hash(this.f16426a, Integer.valueOf(this.f16428c));
    }
}
