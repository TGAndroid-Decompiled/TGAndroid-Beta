package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f11606a;
    public final Resources.Theme f11607b;

    public i(Resources resources, Resources.Theme theme) {
        this.f11606a = resources;
        this.f11607b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f11606a.equals(iVar.f11606a) && Objects.equals(this.f11607b, iVar.f11607b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f11606a, this.f11607b);
    }
}
