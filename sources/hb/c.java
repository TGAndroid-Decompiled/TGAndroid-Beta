package hb;

import java.util.Arrays;
import z5.l;
public abstract class c {
    public final float f7985a;

    public c(ib.a aVar) {
        this.f7985a = aVar.f8824a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f7985a, cVar.f7985a) == 0 && l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f7985a), null});
    }
}
