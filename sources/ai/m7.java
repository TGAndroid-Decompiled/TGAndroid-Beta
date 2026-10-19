package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e11;
public final class m7 {
    public final float f1819a;
    public final e11 f1820b;
    public final e11 f1821c;

    public m7(float f7, String str, CharSequence charSequence) {
        this.f1820b = new e11(str, 12.0f, null);
        this.f1821c = new e11(charSequence, 12.0f, AndroidUtilities.bold());
        this.f1819a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f1820b.j(), this.f1821c.j());
    }
}
