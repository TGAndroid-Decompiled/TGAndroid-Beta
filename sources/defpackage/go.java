package defpackage;

import java.util.Arrays;
public final class go {
    public final int a;
    public final yn b;
    public final vn c;
    public final String d;

    public go(yn ynVar, vn vnVar, String str) {
        this.b = ynVar;
        this.c = vnVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{ynVar, vnVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        if (!cqe.a(this.b, goVar.b) || !cqe.a(this.c, goVar.c) || !cqe.a(this.d, goVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
