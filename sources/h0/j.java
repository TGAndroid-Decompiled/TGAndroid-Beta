package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f6871a;
    public final Resources.Theme f6872b;

    public j(Resources resources, Resources.Theme theme) {
        this.f6871a = resources;
        this.f6872b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f6871a.equals(jVar.f6871a) && Objects.equals(this.f6872b, jVar.f6872b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6871a, this.f6872b);
    }
}
