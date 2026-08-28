package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nz0;
public final class l5 {
    public final float f8491a;
    public final nz0 f8492b;
    public final nz0 f8493c;

    public l5(float f10, String str, CharSequence charSequence) {
        this.f8492b = new nz0(str, 12.0f, null);
        this.f8493c = new nz0(charSequence, 12.0f, AndroidUtilities.bold());
        this.f8491a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.f8492b.j(), this.f8493c.j());
    }
}
