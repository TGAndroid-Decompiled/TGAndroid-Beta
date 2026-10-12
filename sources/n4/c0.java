package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class c0 {
    public final String f16292a;
    public final int f16293b;
    public final int f16294c;

    public c0(String str, int i10, int i11) {
        this.f16292a = str;
        this.f16293b = i10;
        this.f16294c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i10 = c0Var.f16294c;
        String str = c0Var.f16292a;
        int i11 = c0Var.f16293b;
        int i12 = this.f16294c;
        String str2 = this.f16292a;
        int i13 = this.f16293b;
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
        return Objects.hash(this.f16292a, Integer.valueOf(this.f16294c));
    }
}
