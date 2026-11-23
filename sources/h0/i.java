package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f13692a;
    public final Resources.Theme f13693b;

    public i(Resources resources, Resources.Theme theme) {
        this.f13692a = resources;
        this.f13693b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f13692a.equals(iVar.f13692a) && Objects.equals(this.f13693b, iVar.f13693b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13692a, this.f13693b);
    }
}
