package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class c0 {
    public final String f15115a;
    public final int f15116b;
    public final int f15117c;

    public c0(String str, int i10, int i11) {
        this.f15115a = str;
        this.f15116b = i10;
        this.f15117c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i10 = c0Var.f15117c;
        String str = c0Var.f15115a;
        int i11 = c0Var.f15116b;
        int i12 = this.f15117c;
        String str2 = this.f15115a;
        int i13 = this.f15116b;
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
        return Objects.hash(this.f15115a, Integer.valueOf(this.f15117c));
    }
}
