package gb;

import java.util.Arrays;
import y5.l;

public abstract class c {

    public final float f6838a;

    public c(hb.a aVar) {
        this.f6838a = aVar.f8860a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return getClass().equals(cVar.getClass()) && Float.compare(this.f6838a, cVar.f6838a) == 0 && l.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f6838a), null});
    }
}
