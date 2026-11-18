package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f13700a;
    public final Resources.Theme f13701b;

    public i(Resources resources, Resources.Theme theme) {
        this.f13700a = resources;
        this.f13701b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f13700a.equals(iVar.f13700a) && Objects.equals(this.f13701b, iVar.f13701b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13700a, this.f13701b);
    }
}
