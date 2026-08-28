package fb;

import java.util.Arrays;
import x5.l;
public abstract class c {
    public final float f6038a;

    public c(gb.a aVar) {
        this.f6038a = aVar.f7689a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f6038a, cVar.f6038a) == 0 && l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f6038a), null});
    }
}
