package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f12540a;
    public final Resources.Theme f12541b;

    public i(Resources resources, Resources.Theme theme) {
        this.f12540a = resources;
        this.f12541b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f12540a.equals(iVar.f12540a) && Objects.equals(this.f12541b, iVar.f12541b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12540a, this.f12541b);
    }
}
