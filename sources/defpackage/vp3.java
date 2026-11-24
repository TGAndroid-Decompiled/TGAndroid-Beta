package defpackage;

import android.view.DisplayCutout;
public final class vp3 {
    public final DisplayCutout a;

    public vp3(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vp3.class == obj.getClass()) {
            return this.a.equals(((vp3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
