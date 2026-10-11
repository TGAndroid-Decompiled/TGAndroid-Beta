package i;

import android.graphics.drawable.Animatable;
import v7.b8;
public final class a extends b8 {
    public final int f11530a;
    public final Animatable f11531b;

    public a(Animatable animatable, int i10) {
        this.f11530a = i10;
        this.f11531b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f11530a) {
            case 0:
                this.f11531b.start();
                return;
            default:
                ((x4.d) this.f11531b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f11530a) {
            case 0:
                this.f11531b.stop();
                return;
            default:
                ((x4.d) this.f11531b).stop();
                return;
        }
    }
}
