package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
public class uy6 {
    public final String a;
    public final int b;
    public final int c;

    public uy6(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy6)) {
            return false;
        }
        uy6 uy6Var = (uy6) obj;
        int i = uy6Var.c;
        String str = uy6Var.a;
        int i2 = uy6Var.b;
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
