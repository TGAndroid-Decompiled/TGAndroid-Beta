package ci;

import org.telegram.ui.Components.ly0;
public final class m6 {
    public final float f5542a;
    public final ly0 f5543b;
    public final ly0 f5544c;

    public m6(float f10, String str, CharSequence charSequence) {
        this.f5543b = new ly0(str, 12.0f, null);
        this.f5544c = new ly0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.f5542a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.f5543b.i(), this.f5544c.i());
    }
}
