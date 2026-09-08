package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f10842a;
    public final Resources.Theme f10843b;

    public j(Resources resources, Resources.Theme theme) {
        this.f10842a = resources;
        this.f10843b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f10842a.equals(jVar.f10842a) && Objects.equals(this.f10843b, jVar.f10843b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10842a, this.f10843b);
    }
}
