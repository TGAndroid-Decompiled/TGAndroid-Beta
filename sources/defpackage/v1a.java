package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
public final class v1a {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && v1a.class == obj.getClass()) {
                v1a v1aVar = (v1a) obj;
                if ((TextUtils.isEmpty(this.c) && TextUtils.isEmpty(v1aVar.c)) || Objects.equals(this.c, v1aVar.c)) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.a != v1aVar.a || this.b != v1aVar.b || !z) {
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
