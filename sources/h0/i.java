package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class i {
    public final Resources f12541a;
    public final Resources.Theme f12542b;

    public i(Resources resources, Resources.Theme theme) {
        this.f12541a = resources;
        this.f12542b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f12541a.equals(iVar.f12541a) && Objects.equals(this.f12542b, iVar.f12542b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12541a, this.f12542b);
    }
}
