package i;

import android.graphics.drawable.Animatable;
import c8.h0;
public final class a extends h0 {
    public final int f15079a;
    public final Animatable f15080b;

    public a(Animatable animatable, int i7) {
        this.f15079a = i7;
        this.f15080b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f15079a) {
            case 0:
                this.f15080b.start();
                return;
            default:
                ((a5.e) this.f15080b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f15079a) {
            case 0:
                this.f15080b.stop();
                return;
            default:
                ((a5.e) this.f15080b).stop();
                return;
        }
    }
}
