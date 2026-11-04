package gi;

import org.telegram.ui.Components.cp;
public final class j7 extends cp {
    public final int f13016i = 0;

    public j7(float f10, float f11, int i3) {
        super(f10, f11, i3);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f13016i) {
            case 0:
                return org.telegram.messenger.g0.L(26.0f);
            default:
                return (int) ((this.f32787b * 2.0f) + this.f32786a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f13016i) {
            case 0:
                return org.telegram.messenger.g0.L(26.0f);
            default:
                return (int) ((this.f32787b * 2.0f) + this.f32786a);
        }
    }

    public j7(int i3) {
        super(i3);
    }
}
