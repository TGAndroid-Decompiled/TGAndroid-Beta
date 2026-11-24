package defpackage;

import android.view.DisplayCutout;
public final class lo3 {
    public final DisplayCutout a;

    public lo3(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lo3.class == obj.getClass()) {
            return this.a.equals(((lo3) obj).a);
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
