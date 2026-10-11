package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f10950a;
    public final Resources.Theme f10951b;

    public i(Resources resources, Resources.Theme theme) {
        this.f10950a = resources;
        this.f10951b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f10950a.equals(iVar.f10950a) && Objects.equals(this.f10951b, iVar.f10951b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10950a, this.f10951b);
    }
}
