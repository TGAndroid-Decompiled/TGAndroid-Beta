package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i11;
public final class m7 {
    public final float f1814a;
    public final i11 f1815b;
    public final i11 f1816c;

    public m7(float f7, String str, CharSequence charSequence) {
        this.f1815b = new i11(str, 12.0f, null);
        this.f1816c = new i11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f1814a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f1815b.j(), this.f1816c.j());
    }
}
