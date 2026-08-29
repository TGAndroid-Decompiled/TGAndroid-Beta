package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zz0;
public final class i5 {
    public final float f12249a;
    public final zz0 f12250b;
    public final zz0 f12251c;

    public i5(float f9, String str, CharSequence charSequence) {
        this.f12250b = new zz0(str, 12.0f, null);
        this.f12251c = new zz0(charSequence, 12.0f, AndroidUtilities.bold());
        this.f12249a = (a() / 2.0f) + f9;
    }

    public final float a() {
        return Math.max(this.f12250b.j(), this.f12251c.j());
    }
}
