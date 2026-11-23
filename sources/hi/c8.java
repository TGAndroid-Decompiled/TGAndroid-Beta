package hi;

import org.telegram.ui.Components.rp;
public final class c8 extends rp {
    public final int f14277i = 0;

    public c8(float f10, float f11, int i7) {
        super(f10, f11, i7);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f14277i) {
            case 0:
                return org.telegram.messenger.g0.L(26.0f);
            default:
                return (int) ((this.f39372b * 2.0f) + this.f39371a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f14277i) {
            case 0:
                return org.telegram.messenger.g0.L(26.0f);
            default:
                return (int) ((this.f39372b * 2.0f) + this.f39371a);
        }
    }

    public c8(int i7) {
        super(i7);
    }
}
