package defpackage;

import android.view.DisplayCutout;
public final class cp3 {
    public final DisplayCutout a;

    public cp3(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cp3.class == obj.getClass()) {
            return this.a.equals(((cp3) obj).a);
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
