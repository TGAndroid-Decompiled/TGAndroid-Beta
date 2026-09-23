package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class c0 {
    public final String f14905a;
    public final int f14906b;
    public final int f14907c;

    public c0(String str, int i10, int i11) {
        this.f14905a = str;
        this.f14906b = i10;
        this.f14907c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i10 = c0Var.f14907c;
        String str = c0Var.f14905a;
        int i11 = c0Var.f14906b;
        int i12 = this.f14907c;
        String str2 = this.f14905a;
        int i13 = this.f14906b;
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
        return Objects.hash(this.f14905a, Integer.valueOf(this.f14907c));
    }
}
