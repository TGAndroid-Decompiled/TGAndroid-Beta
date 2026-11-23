package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f13729a;
    public final Resources.Theme f13730b;

    public i(Resources resources, Resources.Theme theme) {
        this.f13729a = resources;
        this.f13730b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f13729a.equals(iVar.f13729a) && Objects.equals(this.f13730b, iVar.f13730b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13729a, this.f13730b);
    }
}
