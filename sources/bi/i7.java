package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r11;
public final class i7 {
    public final float f4829a;
    public final r11 f4830b;
    public final r11 f4831c;

    public i7(float f7, String str, CharSequence charSequence) {
        this.f4830b = new r11(str, 12.0f, null);
        this.f4831c = new r11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f4829a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f4830b.j(), this.f4831c.j());
    }
}
