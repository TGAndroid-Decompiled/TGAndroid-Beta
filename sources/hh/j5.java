package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pz0;

public final class j5 {

    public final float f9527a;

    public final pz0 f9528b;

    public final pz0 f9529c;

    public j5(float f10, String str, CharSequence charSequence) {
        this.f9528b = new pz0(str, 12.0f, null);
        this.f9529c = new pz0(charSequence, 12.0f, AndroidUtilities.bold());
        this.f9527a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.f9528b.j(), this.f9529c.j());
    }
}
