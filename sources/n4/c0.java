package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class c0 {
    public final String f15193a;
    public final int f15194b;
    public final int f15195c;

    public c0(String str, int i10, int i11) {
        this.f15193a = str;
        this.f15194b = i10;
        this.f15195c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i10 = c0Var.f15195c;
        String str = c0Var.f15193a;
        int i11 = c0Var.f15194b;
        int i12 = this.f15195c;
        String str2 = this.f15193a;
        int i13 = this.f15194b;
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
        return Objects.hash(this.f15193a, Integer.valueOf(this.f15195c));
    }
}
