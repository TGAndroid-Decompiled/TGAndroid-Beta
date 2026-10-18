package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f11604a;
    public final Resources.Theme f11605b;

    public i(Resources resources, Resources.Theme theme) {
        this.f11604a = resources;
        this.f11605b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f11604a.equals(iVar.f11604a) && Objects.equals(this.f11605b, iVar.f11605b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f11604a, this.f11605b);
    }
}
