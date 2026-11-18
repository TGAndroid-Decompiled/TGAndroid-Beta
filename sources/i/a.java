package i;

import android.graphics.drawable.Animatable;
import c8.k0;
public final class a extends k0 {
    public final int f15849a;
    public final Animatable f15850b;

    public a(Animatable animatable, int i7) {
        this.f15849a = i7;
        this.f15850b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f15849a) {
            case 0:
                this.f15850b.start();
                return;
            default:
                ((a5.e) this.f15850b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f15849a) {
            case 0:
                this.f15850b.stop();
                return;
            default:
                ((a5.e) this.f15850b).stop();
                return;
        }
    }
}
