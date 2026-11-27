package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;
public class e2d extends d2d {
    public e2d(l2d l2dVar, WindowInsets windowInsets) {
        super(l2dVar, windowInsets);
    }

    @Override
    public l2d a() {
        return l2d.h(null, this.c.consumeDisplayCutout());
    }

    @Override
    public cp3 e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new cp3(displayCutout);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2d)) {
            return false;
        }
        e2d e2dVar = (e2d) obj;
        if (Objects.equals(this.c, e2dVar.c) && Objects.equals(this.g, e2dVar.g) && c2d.B(this.h, e2dVar.h)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode();
    }
}
