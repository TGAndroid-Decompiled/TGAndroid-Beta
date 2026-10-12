package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f10949a;
    public final Resources.Theme f10950b;

    public i(Resources resources, Resources.Theme theme) {
        this.f10949a = resources;
        this.f10950b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f10949a.equals(iVar.f10949a) && Objects.equals(this.f10950b, iVar.f10950b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10949a, this.f10950b);
    }
}
