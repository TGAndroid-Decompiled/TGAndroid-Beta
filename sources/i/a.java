package i;

import android.graphics.drawable.Animatable;
import v7.f8;
public final class a extends f8 {
    public final int f11482a;
    public final Animatable f11483b;

    public a(Animatable animatable, int i10) {
        this.f11482a = i10;
        this.f11483b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f11482a) {
            case 0:
                this.f11483b.start();
                return;
            default:
                ((x4.d) this.f11483b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f11482a) {
            case 0:
                this.f11483b.stop();
                return;
            default:
                ((x4.d) this.f11483b).stop();
                return;
        }
    }
}
