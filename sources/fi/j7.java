package fi;

import org.telegram.ui.Components.cp;
public final class j7 extends cp {
    public final int f12241i = 0;

    public j7(float f10, float f11, int i7) {
        super(f10, f11, i7);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f12241i) {
            case 0:
                return org.telegram.messenger.g0.L(26.0f);
            default:
                return (int) ((this.f32726b * 2.0f) + this.f32725a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f12241i) {
            case 0:
                return org.telegram.messenger.g0.L(26.0f);
            default:
                return (int) ((this.f32726b * 2.0f) + this.f32725a);
        }
    }

    public j7(int i7) {
        super(i7);
    }
}
