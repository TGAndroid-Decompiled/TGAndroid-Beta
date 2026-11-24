package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;
public class pzc extends ozc {
    public pzc(wzc wzcVar, WindowInsets windowInsets) {
        super(wzcVar, windowInsets);
    }

    @Override
    public wzc a() {
        return wzc.h(null, this.c.consumeDisplayCutout());
    }

    @Override
    public vp3 e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new vp3(displayCutout);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzc)) {
            return false;
        }
        pzc pzcVar = (pzc) obj;
        if (Objects.equals(this.c, pzcVar.c) && Objects.equals(this.g, pzcVar.g) && nzc.B(this.h, pzcVar.h)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode();
    }
}
