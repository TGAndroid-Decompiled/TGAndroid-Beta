package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
public final class n3a {
    public boolean a = true;
    public boolean b;
    public String c;

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && n3a.class == obj.getClass()) {
                n3a n3aVar = (n3a) obj;
                if ((TextUtils.isEmpty(this.c) && TextUtils.isEmpty(n3aVar.c)) || Objects.equals(this.c, n3aVar.c)) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.a != n3aVar.a || this.b != n3aVar.b || !z) {
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
