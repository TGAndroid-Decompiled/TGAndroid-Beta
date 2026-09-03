package j8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f9273a;

    public o(c5.c cVar) {
        this.f9273a = cVar.f2104a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && b6.m.l(Integer.valueOf(this.f9273a), Integer.valueOf(((o) obj).f9273a)) && b6.m.l(1, 1) && b6.m.l(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (b6.m.l(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9273a), 1, null, Boolean.TRUE});
    }
}
