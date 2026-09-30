package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f10061a;
    public final Resources.Theme f10062b;

    public j(Resources resources, Resources.Theme theme) {
        this.f10061a = resources;
        this.f10062b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f10061a.equals(jVar.f10061a) && Objects.equals(this.f10062b, jVar.f10062b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10061a, this.f10062b);
    }
}
