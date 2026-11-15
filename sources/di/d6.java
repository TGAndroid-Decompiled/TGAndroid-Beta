package di;

import org.telegram.ui.Components.oy0;
public final class d6 {
    public final float f8397a;
    public final oy0 f8398b;
    public final oy0 f8399c;

    public d6(float f10, String str, CharSequence charSequence) {
        this.f8398b = new oy0(str, 12.0f, null);
        this.f8399c = new oy0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.f8397a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.f8398b.i(), this.f8399c.i());
    }
}
