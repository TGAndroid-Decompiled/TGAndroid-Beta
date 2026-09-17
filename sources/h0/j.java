package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f10066a;
    public final Resources.Theme f10067b;

    public j(Resources resources, Resources.Theme theme) {
        this.f10066a = resources;
        this.f10067b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f10066a.equals(jVar.f10066a) && Objects.equals(this.f10067b, jVar.f10067b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10066a, this.f10067b);
    }
}
