package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k01;
public final class h5 {
    public final float f12530a;
    public final k01 f12531b;
    public final k01 f12532c;

    public h5(float f10, String str, CharSequence charSequence) {
        this.f12531b = new k01(str, 12.0f, null);
        this.f12532c = new k01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f12530a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.f12531b.j(), this.f12532c.j());
    }
}
