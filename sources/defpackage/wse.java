package defpackage;

import java.util.Arrays;
public final class wse {
    public final mse a;
    public final Integer b;

    public wse(xab xabVar) {
        this.a = (mse) xabVar.b;
        this.b = (Integer) xabVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wse)) {
            return false;
        }
        wse wseVar = (wse) obj;
        if (fse.a(this.a, wseVar.a) && fse.a(this.b, wseVar.b) && fse.a(null, null) && fse.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
