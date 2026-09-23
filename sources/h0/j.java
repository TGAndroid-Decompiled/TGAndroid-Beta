package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f10048a;
    public final Resources.Theme f10049b;

    public j(Resources resources, Resources.Theme theme) {
        this.f10048a = resources;
        this.f10049b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f10048a.equals(jVar.f10048a) && Objects.equals(this.f10049b, jVar.f10049b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10048a, this.f10049b);
    }
}
