package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f13726a;
    public final Resources.Theme f13727b;

    public i(Resources resources, Resources.Theme theme) {
        this.f13726a = resources;
        this.f13727b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f13726a.equals(iVar.f13726a) && Objects.equals(this.f13727b, iVar.f13727b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13726a, this.f13727b);
    }
}
