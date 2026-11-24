package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
public final class tz9 {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && tz9.class == obj.getClass()) {
                tz9 tz9Var = (tz9) obj;
                if ((TextUtils.isEmpty(this.c) && TextUtils.isEmpty(tz9Var.c)) || Objects.equals(this.c, tz9Var.c)) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.a != tz9Var.a || this.b != tz9Var.b || !z) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c);
    }
}
