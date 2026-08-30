package k5;

import b6.m;
import java.util.Arrays;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f9749c;
    public final boolean f9750a;
    public final String f9751b;

    static {
        f7.b bVar = new f7.b((char) 0, 20);
        bVar.f6012b = Boolean.FALSE;
        f9749c = new b(bVar);
    }

    public b(f7.b bVar) {
        this.f9750a = ((Boolean) bVar.f6012b).booleanValue();
        this.f9751b = (String) bVar.f6013c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.l(null, null) && this.f9750a == bVar.f9750a && m.l(this.f9751b, bVar.f9751b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f9750a), this.f9751b});
    }
}
