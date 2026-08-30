package j8;

import java.util.Arrays;
public final class o implements com.google.android.gms.common.api.b {
    public final int f9291a;

    public o(c5.c cVar) {
        this.f9291a = cVar.f2081a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && b6.m.l(Integer.valueOf(this.f9291a), Integer.valueOf(((o) obj).f9291a)) && b6.m.l(1, 1) && b6.m.l(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (b6.m.l(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9291a), 1, null, Boolean.TRUE});
    }
}
