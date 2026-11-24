package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;
public class oxc extends nxc {
    public oxc(vxc vxcVar, WindowInsets windowInsets) {
        super(vxcVar, windowInsets);
    }

    @Override
    public vxc a() {
        return vxc.h(null, this.c.consumeDisplayCutout());
    }

    @Override
    public lo3 e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new lo3(displayCutout);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxc)) {
            return false;
        }
        oxc oxcVar = (oxc) obj;
        if (Objects.equals(this.c, oxcVar.c) && Objects.equals(this.g, oxcVar.g) && mxc.B(this.h, oxcVar.h)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode();
    }
}
