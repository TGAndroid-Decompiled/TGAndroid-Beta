package jb;

import b6.m;
import java.util.Arrays;
public abstract class c {
    public final float f9358a;

    public c(kb.a aVar) {
        this.f9358a = aVar.f10279a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f9358a, cVar.f9358a) == 0 && m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f9358a), null});
    }
}
