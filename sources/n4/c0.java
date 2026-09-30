package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class c0 {
    public final String f15174a;
    public final int f15175b;
    public final int f15176c;

    public c0(String str, int i10, int i11) {
        this.f15174a = str;
        this.f15175b = i10;
        this.f15176c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i10 = c0Var.f15176c;
        String str = c0Var.f15174a;
        int i11 = c0Var.f15175b;
        int i12 = this.f15176c;
        String str2 = this.f15174a;
        int i13 = this.f15175b;
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
        return Objects.hash(this.f15174a, Integer.valueOf(this.f15176c));
    }
}
