package defpackage;

import java.util.Arrays;
public final class frd {
    public final bve a;
    public final Boolean b;
    public final mze c;

    public frd(uqd uqdVar) {
        this.a = (bve) uqdVar.b;
        this.b = (Boolean) uqdVar.c;
        this.c = (mze) uqdVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof frd)) {
            return false;
        }
        frd frdVar = (frd) obj;
        if (fse.a(this.a, frdVar.a) && fse.a(this.b, frdVar.b) && fse.a(null, null) && fse.a(this.c, frdVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
