package hi;

import org.telegram.ui.Components.up;
public final class h7 extends up {
    public final int f14759i = 0;

    public h7(float f10, float f11, int i7) {
        super(f10, f11, i7);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f14759i) {
            case 0:
                return org.telegram.messenger.g0.L(26.0f);
            default:
                return (int) ((this.f40542b * 2.0f) + this.f40541a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f14759i) {
            case 0:
                return org.telegram.messenger.g0.L(26.0f);
            default:
                return (int) ((this.f40542b * 2.0f) + this.f40541a);
        }
    }

    public h7(int i7) {
        super(i7);
    }
}
