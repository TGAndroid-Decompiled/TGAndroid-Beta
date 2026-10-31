package ag;

import org.telegram.ui.Components.kp;
public final class s1 extends kp {
    public final int f704i = 1;

    public s1(float f7, float f10, int i10) {
        super(f7, f10, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f704i) {
            case 0:
                return (int) ((this.f27862b * 2.0f) + this.f27861a);
            default:
                return org.telegram.messenger.i0.L(26.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f704i) {
            case 0:
                return (int) ((this.f27862b * 2.0f) + this.f27861a);
            default:
                return org.telegram.messenger.i0.L(26.0f);
        }
    }

    public s1(int i10) {
        super(i10);
    }
}
