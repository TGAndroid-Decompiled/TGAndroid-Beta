package i;

import android.graphics.drawable.Animatable;
import v7.f8;
public final class a extends f8 {
    public final int f11407a;
    public final Animatable f11408b;

    public a(Animatable animatable, int i10) {
        this.f11407a = i10;
        this.f11408b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f11407a) {
            case 0:
                this.f11408b.start();
                return;
            default:
                ((x4.d) this.f11408b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f11407a) {
            case 0:
                this.f11408b.stop();
                return;
            default:
                ((x4.d) this.f11408b).stop();
                return;
        }
    }
}
