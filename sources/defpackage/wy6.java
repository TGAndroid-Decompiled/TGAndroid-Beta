package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
public class wy6 {
    public final String a;
    public final int b;
    public final int c;

    public wy6(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy6)) {
            return false;
        }
        wy6 wy6Var = (wy6) obj;
        int i = wy6Var.c;
        String str = wy6Var.a;
        int i2 = wy6Var.b;
        int i3 = this.c;
        String str2 = this.a;
        int i4 = this.b;
        if (i4 >= 0 && i2 >= 0) {
            if (TextUtils.equals(str2, str) && i4 == i2 && i3 == i) {
                return true;
            }
            return false;
        } else if (TextUtils.equals(str2, str) && i3 == i) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
