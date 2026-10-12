package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f10295a;
    public final Resources.Theme f10296b;

    public i(Resources resources, Resources.Theme theme) {
        this.f10295a = resources;
        this.f10296b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f10295a.equals(iVar.f10295a) && Objects.equals(this.f10296b, iVar.f10296b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10295a, this.f10296b);
    }
}
