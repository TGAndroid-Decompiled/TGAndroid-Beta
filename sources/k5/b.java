package k5;

import b6.m;
import java.util.Arrays;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f10470c;
    public final boolean f10471a;
    public final String f10472b;

    static {
        f7.b bVar = new f7.b((char) 0, 20);
        bVar.f6120b = Boolean.FALSE;
        f10470c = new b(bVar);
    }

    public b(f7.b bVar) {
        this.f10471a = ((Boolean) bVar.f6120b).booleanValue();
        this.f10472b = (String) bVar.f6121c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.l(null, null) && this.f10471a == bVar.f10471a && m.l(this.f10472b, bVar.f10472b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f10471a), this.f10472b});
    }
}
