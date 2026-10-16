package i;

import android.graphics.drawable.Animatable;
import v7.w7;
public final class a extends w7 {
    public final int f10852a;
    public final Animatable f10853b;

    public a(Animatable animatable, int i10) {
        this.f10852a = i10;
        this.f10853b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f10852a) {
            case 0:
                this.f10853b.start();
                return;
            default:
                ((x4.d) this.f10853b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f10852a) {
            case 0:
                this.f10853b.stop();
                return;
            default:
                ((x4.d) this.f10853b).stop();
                return;
        }
    }
}
