package bi;

import org.telegram.ui.Components.ny0;
public final class l7 {
    public final float f4269a;
    public final ny0 f4270b;
    public final ny0 f4271c;

    public l7(float f10, String str, CharSequence charSequence) {
        this.f4270b = new ny0(str, 12.0f, null);
        this.f4271c = new ny0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.f4269a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.f4270b.i(), this.f4271c.i());
    }
}
