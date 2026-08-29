package i5;

import g9.l;
import java.util.Arrays;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f8250c;
    public final boolean f8251a;
    public final String f8252b;

    static {
        l lVar = new l(7, (byte) 0);
        lVar.f7168b = Boolean.FALSE;
        f8250c = new b(lVar);
    }

    public b(l lVar) {
        this.f8251a = ((Boolean) lVar.f7168b).booleanValue();
        this.f8252b = (String) lVar.f7169c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (z5.l.l(null, null) && this.f8251a == bVar.f8251a && z5.l.l(this.f8252b, bVar.f8252b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f8251a), this.f8252b});
    }
}
