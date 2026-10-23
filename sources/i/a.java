package i;

import android.graphics.drawable.Animatable;
import v7.w7;
public final class a extends w7 {
    public final int f12275a;
    public final Animatable f12276b;

    public a(Animatable animatable, int i10) {
        this.f12275a = i10;
        this.f12276b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f12275a) {
            case 0:
                this.f12276b.start();
                return;
            default:
                ((x4.d) this.f12276b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f12275a) {
            case 0:
                this.f12276b.stop();
                return;
            default:
                ((x4.d) this.f12276b).stop();
                return;
        }
    }
}
