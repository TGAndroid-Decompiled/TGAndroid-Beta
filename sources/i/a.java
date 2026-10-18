package i;

import android.graphics.drawable.Animatable;
import v7.w7;
public final class a extends w7 {
    public final int f12246a;
    public final Animatable f12247b;

    public a(Animatable animatable, int i10) {
        this.f12246a = i10;
        this.f12247b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f12246a) {
            case 0:
                this.f12247b.start();
                return;
            default:
                ((x4.d) this.f12247b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f12246a) {
            case 0:
                this.f12247b.stop();
                return;
            default:
                ((x4.d) this.f12247b).stop();
                return;
        }
    }
}
