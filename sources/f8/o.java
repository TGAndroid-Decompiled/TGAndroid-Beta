package f8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f5966a;

    public o(com.google.android.gms.internal.cast.a aVar) {
        this.f5966a = aVar.f2981a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && x5.l.l(Integer.valueOf(this.f5966a), Integer.valueOf(((o) obj).f5966a)) && x5.l.l(1, 1) && x5.l.l(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (x5.l.l(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5966a), 1, null, Boolean.TRUE});
    }
}
