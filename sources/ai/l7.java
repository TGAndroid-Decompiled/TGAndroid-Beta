package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d11;
public final class l7 {
    public final float f1766a;
    public final d11 f1767b;
    public final d11 f1768c;

    public l7(float f7, String str, CharSequence charSequence) {
        this.f1767b = new d11(str, 12.0f, null);
        this.f1768c = new d11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f1766a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f1767b.j(), this.f1768c.j());
    }
}
