package i;

import android.graphics.drawable.Animatable;
import v7.w7;
public final class a extends w7 {
    public final int f12245a;
    public final Animatable f12246b;

    public a(Animatable animatable, int i10) {
        this.f12245a = i10;
        this.f12246b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f12245a) {
            case 0:
                this.f12246b.start();
                return;
            default:
                ((x4.d) this.f12246b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f12245a) {
            case 0:
                this.f12246b.stop();
                return;
            default:
                ((x4.d) this.f12246b).stop();
                return;
        }
    }
}
