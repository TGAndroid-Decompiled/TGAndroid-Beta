package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f9179a;
    public final Resources.Theme f9180b;

    public j(Resources resources, Resources.Theme theme) {
        this.f9179a = resources;
        this.f9180b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f9179a.equals(jVar.f9179a) && Objects.equals(this.f9180b, jVar.f9180b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9179a, this.f9180b);
    }
}
