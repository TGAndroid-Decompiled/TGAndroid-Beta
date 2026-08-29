package h8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f7914a;

    public o(a5.c cVar) {
        this.f7914a = cVar.f161a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && z5.l.l(Integer.valueOf(this.f7914a), Integer.valueOf(((o) obj).f7914a)) && z5.l.l(1, 1) && z5.l.l(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (z5.l.l(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7914a), 1, null, Boolean.TRUE});
    }
}
