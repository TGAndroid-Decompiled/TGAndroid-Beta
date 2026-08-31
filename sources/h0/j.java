package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f7167a;
    public final Resources.Theme f7168b;

    public j(Resources resources, Resources.Theme theme) {
        this.f7167a = resources;
        this.f7168b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f7167a.equals(jVar.f7167a) && Objects.equals(this.f7168b, jVar.f7168b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7167a, this.f7168b);
    }
}
