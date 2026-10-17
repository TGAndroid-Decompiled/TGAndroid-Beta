package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d11;
public final class l7 {
    public final float f1773a;
    public final d11 f1774b;
    public final d11 f1775c;

    public l7(float f7, String str, CharSequence charSequence) {
        this.f1774b = new d11(str, 12.0f, null);
        this.f1775c = new d11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f1773a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f1774b.j(), this.f1775c.j());
    }
}
