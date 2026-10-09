package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f10951a;
    public final Resources.Theme f10952b;

    public i(Resources resources, Resources.Theme theme) {
        this.f10951a = resources;
        this.f10952b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f10951a.equals(iVar.f10951a) && Objects.equals(this.f10952b, iVar.f10952b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10951a, this.f10952b);
    }
}
