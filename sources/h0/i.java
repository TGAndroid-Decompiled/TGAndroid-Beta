package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f11605a;
    public final Resources.Theme f11606b;

    public i(Resources resources, Resources.Theme theme) {
        this.f11605a = resources;
        this.f11606b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f11605a.equals(iVar.f11605a) && Objects.equals(this.f11606b, iVar.f11606b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f11605a, this.f11606b);
    }
}
