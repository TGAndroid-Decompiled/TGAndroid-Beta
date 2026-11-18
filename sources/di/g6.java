package di;

import org.telegram.ui.Components.vy0;
public final class g6 {
    public final float f8861a;
    public final vy0 f8862b;
    public final vy0 f8863c;

    public g6(float f10, String str, CharSequence charSequence) {
        this.f8862b = new vy0(str, 12.0f, null);
        this.f8863c = new vy0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.f8861a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.f8862b.i(), this.f8863c.i());
    }
}
