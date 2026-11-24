package defpackage;

import java.util.Arrays;
public final class lud {
    public final o7f a;
    public final Boolean b;
    public final pef c;

    public lud(uqd uqdVar) {
        this.a = (o7f) uqdVar.b;
        this.b = (Boolean) uqdVar.c;
        this.c = (pef) uqdVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lud)) {
            return false;
        }
        lud ludVar = (lud) obj;
        if (fse.a(this.a, ludVar.a) && fse.a(this.b, ludVar.b) && fse.a(null, null) && fse.a(this.c, ludVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
