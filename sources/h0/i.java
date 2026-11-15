package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f13385a;
    public final Resources.Theme f13386b;

    public i(Resources resources, Resources.Theme theme) {
        this.f13385a = resources;
        this.f13386b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f13385a.equals(iVar.f13385a) && Objects.equals(this.f13386b, iVar.f13386b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13385a, this.f13386b);
    }
}
