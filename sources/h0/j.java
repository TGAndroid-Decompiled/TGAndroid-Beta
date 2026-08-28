package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f9294a;
    public final Resources.Theme f9295b;

    public j(Resources resources, Resources.Theme theme) {
        this.f9294a = resources;
        this.f9295b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f9294a.equals(jVar.f9294a) && Objects.equals(this.f9295b, jVar.f9295b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9294a, this.f9295b);
    }
}
