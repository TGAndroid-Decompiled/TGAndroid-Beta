package g8;

import java.util.Arrays;

public final class o implements com.google.android.gms.common.api.b {

    public final int f6767a;

    public o(com.google.android.gms.internal.cast.a aVar) {
        this.f6767a = aVar.f3426a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o) || !y5.l.l(Integer.valueOf(this.f6767a), Integer.valueOf(((o) obj).f6767a)) || !y5.l.l(1, 1) || !y5.l.l(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return y5.l.l(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6767a), 1, null, Boolean.TRUE});
    }
}
