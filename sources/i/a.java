package i;

import android.graphics.drawable.Animatable;
import c8.i0;
public final class a extends i0 {
    public final int f15530a;
    public final Animatable f15531b;

    public a(Animatable animatable, int i7) {
        this.f15530a = i7;
        this.f15531b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f15530a) {
            case 0:
                this.f15531b.start();
                return;
            default:
                ((a5.e) this.f15531b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f15530a) {
            case 0:
                this.f15531b.stop();
                return;
            default:
                ((a5.e) this.f15531b).stop();
                return;
        }
    }
}
