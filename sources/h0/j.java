package h0;

import android.content.res.Resources;
import j$.util.Objects;

public final class j {

    public final Resources f7726a;

    public final Resources.Theme f7727b;

    public j(Resources resources, Resources.Theme theme) {
        this.f7726a = resources;
        this.f7727b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f7726a.equals(jVar.f7726a) && Objects.equals(this.f7727b, jVar.f7727b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7726a, this.f7727b);
    }
}
