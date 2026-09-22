package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f10062a;
    public final Resources.Theme f10063b;

    public j(Resources resources, Resources.Theme theme) {
        this.f10062a = resources;
        this.f10063b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f10062a.equals(jVar.f10062a) && Objects.equals(this.f10063b, jVar.f10063b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10062a, this.f10063b);
    }
}
