package di;

import org.telegram.ui.Components.oy0;
public final class d6 {
    public final float f8405a;
    public final oy0 f8406b;
    public final oy0 f8407c;

    public d6(float f10, String str, CharSequence charSequence) {
        this.f8406b = new oy0(str, 12.0f, null);
        this.f8407c = new oy0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.f8405a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.f8406b.i(), this.f8407c.i());
    }
}
