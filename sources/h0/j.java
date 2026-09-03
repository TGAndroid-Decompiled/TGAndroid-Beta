package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f6858a;
    public final Resources.Theme f6859b;

    public j(Resources resources, Resources.Theme theme) {
        this.f6858a = resources;
        this.f6859b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f6858a.equals(jVar.f6858a) && Objects.equals(this.f6859b, jVar.f6859b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6858a, this.f6859b);
    }
}
