package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f10814a;
    public final Resources.Theme f10815b;

    public j(Resources resources, Resources.Theme theme) {
        this.f10814a = resources;
        this.f10815b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f10814a.equals(jVar.f10814a) && Objects.equals(this.f10815b, jVar.f10815b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10814a, this.f10815b);
    }
}
