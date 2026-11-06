package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f14025a;
    public final Resources.Theme f14026b;

    public i(Resources resources, Resources.Theme theme) {
        this.f14025a = resources;
        this.f14026b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f14025a.equals(iVar.f14025a) && Objects.equals(this.f14026b, iVar.f14026b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14025a, this.f14026b);
    }
}
