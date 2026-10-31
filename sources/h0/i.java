package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f7555a;
    public final Resources.Theme f7556b;

    public i(Resources resources, Resources.Theme theme) {
        this.f7555a = resources;
        this.f7556b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f7555a.equals(iVar.f7555a) && Objects.equals(this.f7556b, iVar.f7556b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7555a, this.f7556b);
    }
}
