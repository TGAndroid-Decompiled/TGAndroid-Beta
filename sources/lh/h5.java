package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k01;
public final class h5 {
    public final float f12546a;
    public final k01 f12547b;
    public final k01 f12548c;

    public h5(float f10, String str, CharSequence charSequence) {
        this.f12547b = new k01(str, 12.0f, null);
        this.f12548c = new k01(charSequence, 12.0f, AndroidUtilities.bold());
        this.f12546a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.f12547b.j(), this.f12548c.j());
    }
}
