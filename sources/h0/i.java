package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f10299a;
    public final Resources.Theme f10300b;

    public i(Resources resources, Resources.Theme theme) {
        this.f10299a = resources;
        this.f10300b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f10299a.equals(iVar.f10299a) && Objects.equals(this.f10300b, iVar.f10300b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10299a, this.f10300b);
    }
}
