package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f14080a;
    public final Resources.Theme f14081b;

    public i(Resources resources, Resources.Theme theme) {
        this.f14080a = resources;
        this.f14081b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f14080a.equals(iVar.f14080a) && Objects.equals(this.f14081b, iVar.f14081b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14080a, this.f14081b);
    }
}
