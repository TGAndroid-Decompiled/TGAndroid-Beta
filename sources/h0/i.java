package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f11630a;
    public final Resources.Theme f11631b;

    public i(Resources resources, Resources.Theme theme) {
        this.f11630a = resources;
        this.f11631b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f11630a.equals(iVar.f11630a) && Objects.equals(this.f11631b, iVar.f11631b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f11630a, this.f11631b);
    }
}
