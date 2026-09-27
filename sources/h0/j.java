package h0;

import android.content.res.Resources;
import j$.util.Objects;
public final class j {
    public final Resources f10053a;
    public final Resources.Theme f10054b;

    public j(Resources resources, Resources.Theme theme) {
        this.f10053a = resources;
        this.f10054b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f10053a.equals(jVar.f10053a) && Objects.equals(this.f10054b, jVar.f10054b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10053a, this.f10054b);
    }
}
