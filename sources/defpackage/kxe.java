package defpackage;

import java.util.Arrays;
public final class kxe {
    public final Float a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kxe)) {
            return false;
        }
        kxe kxeVar = (kxe) obj;
        if (cqe.a(null, null) && cqe.a(this.a, kxeVar.a) && cqe.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.a, null});
    }
}
