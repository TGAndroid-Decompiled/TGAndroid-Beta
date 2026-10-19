package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f11603a;
    public final Resources.Theme f11604b;

    public i(Resources resources, Resources.Theme theme) {
        this.f11603a = resources;
        this.f11604b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f11603a.equals(iVar.f11603a) && Objects.equals(this.f11604b, iVar.f11604b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f11603a, this.f11604b);
    }
}
