package i;

import android.graphics.drawable.Animatable;
import c8.l0;
public final class a extends l0 {
    public final int f15840a;
    public final Animatable f15841b;

    public a(Animatable animatable, int i7) {
        this.f15840a = i7;
        this.f15841b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f15840a) {
            case 0:
                this.f15841b.start();
                return;
            default:
                ((a5.e) this.f15841b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f15840a) {
            case 0:
                this.f15841b.stop();
                return;
            default:
                ((a5.e) this.f15841b).stop();
                return;
        }
    }
}
