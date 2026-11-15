package hi;

import org.telegram.ui.Components.lp;
public final class i7 extends lp {
    public final int f14428i = 0;

    public i7(float f10, float f11, int i7) {
        super(f10, f11, i7);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f14428i) {
            case 0:
                return org.telegram.messenger.g0.L(26.0f);
            default:
                return (int) ((this.f36869b * 2.0f) + this.f36868a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f14428i) {
            case 0:
                return org.telegram.messenger.g0.L(26.0f);
            default:
                return (int) ((this.f36869b * 2.0f) + this.f36868a);
        }
    }

    public i7(int i7) {
        super(i7);
    }
}
