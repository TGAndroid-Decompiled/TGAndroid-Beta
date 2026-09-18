package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f10065a;
    public final Resources.Theme f10066b;

    public j(Resources resources, Resources.Theme theme) {
        this.f10065a = resources;
        this.f10066b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f10065a.equals(jVar.f10065a) && Objects.equals(this.f10066b, jVar.f10066b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10065a, this.f10066b);
    }
}
