package defpackage;

import android.content.res.Resources;
import j$.util.Objects;
public final class jc9 {
    public final Resources a;
    public final Resources.Theme b;

    public jc9(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jc9.class == obj.getClass()) {
            jc9 jc9Var = (jc9) obj;
            if (this.a.equals(jc9Var.a) && Objects.equals(this.b, jc9Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
