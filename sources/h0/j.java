package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f7488a;
    public final Resources.Theme f7489b;

    public j(Resources resources, Resources.Theme theme) {
        this.f7488a = resources;
        this.f7489b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f7488a.equals(jVar.f7488a) && Objects.equals(this.f7489b, jVar.f7489b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7488a, this.f7489b);
    }
}
