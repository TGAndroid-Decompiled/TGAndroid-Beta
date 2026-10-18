package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d11;
public final class l7 {
    public final float f1764a;
    public final d11 f1765b;
    public final d11 f1766c;

    public l7(float f7, String str, CharSequence charSequence) {
        this.f1765b = new d11(str, 12.0f, null);
        this.f1766c = new d11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f1764a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f1765b.j(), this.f1766c.j());
    }
}
