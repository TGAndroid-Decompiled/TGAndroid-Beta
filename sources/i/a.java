package i;

import android.graphics.drawable.Animatable;
import v7.w7;
public final class a extends w7 {
    public final int f10848a;
    public final Animatable f10849b;

    public a(Animatable animatable, int i10) {
        this.f10848a = i10;
        this.f10849b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f10848a) {
            case 0:
                this.f10849b.start();
                return;
            default:
                ((x4.d) this.f10849b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f10848a) {
            case 0:
                this.f10849b.stop();
                return;
            default:
                ((x4.d) this.f10849b).stop();
                return;
        }
    }
}
