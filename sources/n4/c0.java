package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class c0 {
    public final String f15143a;
    public final int f15144b;
    public final int f15145c;

    public c0(String str, int i10, int i11) {
        this.f15143a = str;
        this.f15144b = i10;
        this.f15145c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i10 = c0Var.f15145c;
        String str = c0Var.f15143a;
        int i11 = c0Var.f15144b;
        int i12 = this.f15145c;
        String str2 = this.f15143a;
        int i13 = this.f15144b;
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
        return Objects.hash(this.f15143a, Integer.valueOf(this.f15145c));
    }
}
