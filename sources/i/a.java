package i;

import android.graphics.drawable.Animatable;
import v7.w7;
public final class a extends w7 {
    public final int f12243a;
    public final Animatable f12244b;

    public a(Animatable animatable, int i10) {
        this.f12243a = i10;
        this.f12244b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f12243a) {
            case 0:
                this.f12244b.start();
                return;
            default:
                ((x4.d) this.f12244b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f12243a) {
            case 0:
                this.f12244b.stop();
                return;
            default:
                ((x4.d) this.f12244b).stop();
                return;
        }
    }
}
