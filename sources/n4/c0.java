package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class c0 {
    public final String f16570a;
    public final int f16571b;
    public final int f16572c;

    public c0(String str, int i10, int i11) {
        this.f16570a = str;
        this.f16571b = i10;
        this.f16572c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i10 = c0Var.f16572c;
        String str = c0Var.f16570a;
        int i11 = c0Var.f16571b;
        int i12 = this.f16572c;
        String str2 = this.f16570a;
        int i13 = this.f16571b;
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
        return Objects.hash(this.f16570a, Integer.valueOf(this.f16572c));
    }
}
