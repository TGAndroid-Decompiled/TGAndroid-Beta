package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e11;
public final class l7 {
    public final float f1760a;
    public final e11 f1761b;
    public final e11 f1762c;

    public l7(float f7, String str, CharSequence charSequence) {
        this.f1761b = new e11(str, 12.0f, null);
        this.f1762c = new e11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f1760a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f1761b.j(), this.f1762c.j());
    }
}
