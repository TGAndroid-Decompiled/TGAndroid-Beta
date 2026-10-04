package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f10946a;
    public final Resources.Theme f10947b;

    public j(Resources resources, Resources.Theme theme) {
        this.f10946a = resources;
        this.f10947b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f10946a.equals(jVar.f10946a) && Objects.equals(this.f10947b, jVar.f10947b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10946a, this.f10947b);
    }
}
