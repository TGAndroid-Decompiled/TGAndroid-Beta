package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f14027a;
    public final Resources.Theme f14028b;

    public i(Resources resources, Resources.Theme theme) {
        this.f14027a = resources;
        this.f14028b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f14027a.equals(iVar.f14027a) && Objects.equals(this.f14028b, iVar.f14028b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14027a, this.f14028b);
    }
}
