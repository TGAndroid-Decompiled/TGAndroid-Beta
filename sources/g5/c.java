package g5;

import java.util.Arrays;
import y5.l;

public final class c implements com.google.android.gms.common.api.b {

    public static final c f6391c;

    public final boolean f6392a;

    public final String f6393b;

    static {
        b bVar = new b(0);
        bVar.f6389b = Boolean.FALSE;
        f6391c = new c(bVar);
    }

    public c(b bVar) {
        this.f6392a = ((Boolean) bVar.f6389b).booleanValue();
        this.f6393b = (String) bVar.f6390c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.l(null, null) && this.f6392a == cVar.f6392a && l.l(this.f6393b, cVar.f6393b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f6392a), this.f6393b});
    }
}
