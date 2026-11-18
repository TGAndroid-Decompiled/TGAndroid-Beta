package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f13697a;
    public final Resources.Theme f13698b;

    public i(Resources resources, Resources.Theme theme) {
        this.f13697a = resources;
        this.f13698b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f13697a.equals(iVar.f13697a) && Objects.equals(this.f13698b, iVar.f13698b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13697a, this.f13698b);
    }
}
