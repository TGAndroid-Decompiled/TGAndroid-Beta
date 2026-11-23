package di;

import org.telegram.ui.Components.wy0;
public final class g6 {
    public final float f8855a;
    public final wy0 f8856b;
    public final wy0 f8857c;

    public g6(float f10, String str, CharSequence charSequence) {
        this.f8856b = new wy0(str, 12.0f, null);
        this.f8857c = new wy0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.f8855a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.f8856b.i(), this.f8857c.i());
    }
}
