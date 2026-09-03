package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k01;
public final class h5 {
    public final float f14170a;
    public final k01 f14171b;
    public final k01 f14172c;

    public h5(float f10, String str, CharSequence charSequence) {
        this.f14171b = new k01(str, 12.0f, null);
        this.f14172c = new k01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f14170a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.f14171b.j(), this.f14172c.j());
    }
}
