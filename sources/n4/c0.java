package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class c0 {
    public final String f15159a;
    public final int f15160b;
    public final int f15161c;

    public c0(String str, int i10, int i11) {
        this.f15159a = str;
        this.f15160b = i10;
        this.f15161c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i10 = c0Var.f15161c;
        String str = c0Var.f15159a;
        int i11 = c0Var.f15160b;
        int i12 = this.f15161c;
        String str2 = this.f15159a;
        int i13 = this.f15160b;
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
        return Objects.hash(this.f15159a, Integer.valueOf(this.f15161c));
    }
}
