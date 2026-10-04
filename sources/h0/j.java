package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f10945a;
    public final Resources.Theme f10946b;

    public j(Resources resources, Resources.Theme theme) {
        this.f10945a = resources;
        this.f10946b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f10945a.equals(jVar.f10945a) && Objects.equals(this.f10946b, jVar.f10946b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10945a, this.f10946b);
    }
}
