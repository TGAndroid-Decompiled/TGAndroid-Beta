package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class b0 {
    public final String f16625a;
    public final int f16626b;
    public final int f16627c;

    public b0(String str, int i10, int i11) {
        this.f16625a = str;
        this.f16626b = i10;
        this.f16627c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        int i10 = b0Var.f16627c;
        String str = b0Var.f16625a;
        int i11 = b0Var.f16626b;
        int i12 = this.f16627c;
        String str2 = this.f16625a;
        int i13 = this.f16626b;
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
        return Objects.hash(this.f16625a, Integer.valueOf(this.f16627c));
    }
}
