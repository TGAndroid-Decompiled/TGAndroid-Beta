package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class b0 {
    public final String f16547a;
    public final int f16548b;
    public final int f16549c;

    public b0(String str, int i10, int i11) {
        this.f16547a = str;
        this.f16548b = i10;
        this.f16549c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        int i10 = b0Var.f16549c;
        String str = b0Var.f16547a;
        int i11 = b0Var.f16548b;
        int i12 = this.f16549c;
        String str2 = this.f16547a;
        int i13 = this.f16548b;
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
        return Objects.hash(this.f16547a, Integer.valueOf(this.f16549c));
    }
}
