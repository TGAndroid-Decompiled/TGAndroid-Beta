package i;

import android.graphics.drawable.Animatable;
import v7.w7;
public final class a extends w7 {
    public final int f12244a;
    public final Animatable f12245b;

    public a(Animatable animatable, int i10) {
        this.f12244a = i10;
        this.f12245b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f12244a) {
            case 0:
                this.f12245b.start();
                return;
            default:
                ((x4.d) this.f12245b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f12244a) {
            case 0:
                this.f12245b.stop();
                return;
            default:
                ((x4.d) this.f12245b).stop();
                return;
        }
    }
}
