package i;

import android.graphics.drawable.Animatable;
import c8.k0;
public final class a extends k0 {
    public final int f15871a;
    public final Animatable f15872b;

    public a(Animatable animatable, int i7) {
        this.f15871a = i7;
        this.f15872b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f15871a) {
            case 0:
                this.f15872b.start();
                return;
            default:
                ((a5.e) this.f15872b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f15871a) {
            case 0:
                this.f15872b.stop();
                return;
            default:
                ((a5.e) this.f15872b).stop();
                return;
        }
    }
}
