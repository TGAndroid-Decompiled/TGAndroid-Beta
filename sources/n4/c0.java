package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class c0 {
    public final String f15167a;
    public final int f15168b;
    public final int f15169c;

    public c0(String str, int i10, int i11) {
        this.f15167a = str;
        this.f15168b = i10;
        this.f15169c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i10 = c0Var.f15169c;
        String str = c0Var.f15167a;
        int i11 = c0Var.f15168b;
        int i12 = this.f15169c;
        String str2 = this.f15167a;
        int i13 = this.f15168b;
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
        return Objects.hash(this.f15167a, Integer.valueOf(this.f15169c));
    }
}
