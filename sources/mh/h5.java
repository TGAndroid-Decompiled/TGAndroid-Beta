package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l01;
public final class h5 {
    public final float f14168a;
    public final l01 f14169b;
    public final l01 f14170c;

    public h5(float f10, String str, CharSequence charSequence) {
        this.f14169b = new l01(str, 12.0f, null);
        this.f14170c = new l01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f14168a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.f14169b.j(), this.f14170c.j());
    }
}
