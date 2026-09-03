package k5;

import b6.m;
import java.util.Arrays;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f9730c;
    public final boolean f9731a;
    public final String f9732b;

    static {
        f7.b bVar = new f7.b((char) 0, 20);
        bVar.f6001b = Boolean.FALSE;
        f9730c = new b(bVar);
    }

    public b(f7.b bVar) {
        this.f9731a = ((Boolean) bVar.f6001b).booleanValue();
        this.f9732b = (String) bVar.f6002c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.l(null, null) && this.f9731a == bVar.f9731a && m.l(this.f9732b, bVar.f9732b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f9731a), this.f9732b});
    }
}
