package g5;

import java.util.Arrays;
import x5.l;
public final class c implements com.google.android.gms.common.api.b {
    public static final c f7113c;
    public final boolean f7114a;
    public final String f7115b;

    static {
        b bVar = new b(0);
        bVar.f7111b = Boolean.FALSE;
        f7113c = new c(bVar);
    }

    public c(b bVar) {
        this.f7114a = ((Boolean) bVar.f7111b).booleanValue();
        this.f7115b = (String) bVar.f7112c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (l.l(null, null) && this.f7114a == cVar.f7114a && l.l(this.f7115b, cVar.f7115b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f7114a), this.f7115b});
    }
}
