package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f7556a;
    public final Resources.Theme f7557b;

    public i(Resources resources, Resources.Theme theme) {
        this.f7556a = resources;
        this.f7557b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f7556a.equals(iVar.f7556a) && Objects.equals(this.f7557b, iVar.f7557b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7556a, this.f7557b);
    }
}
