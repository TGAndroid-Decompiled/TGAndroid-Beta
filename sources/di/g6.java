package di;

import org.telegram.ui.Components.xy0;
public final class g6 {
    public final float f8891a;
    public final xy0 f8892b;
    public final xy0 f8893c;

    public g6(float f10, String str, CharSequence charSequence) {
        this.f8892b = new xy0(str, 12.0f, null);
        this.f8893c = new xy0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.f8891a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.f8892b.i(), this.f8893c.i());
    }
}
