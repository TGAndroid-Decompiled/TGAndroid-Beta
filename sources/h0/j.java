package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f10047a;
    public final Resources.Theme f10048b;

    public j(Resources resources, Resources.Theme theme) {
        this.f10047a = resources;
        this.f10048b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f10047a.equals(jVar.f10047a) && Objects.equals(this.f10048b, jVar.f10048b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10047a, this.f10048b);
    }
}
