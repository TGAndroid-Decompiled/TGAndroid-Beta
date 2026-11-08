package i;

import android.graphics.drawable.Animatable;
import c8.h0;
public final class a extends h0 {
    public final int f15077a;
    public final Animatable f15078b;

    public a(Animatable animatable, int i7) {
        this.f15077a = i7;
        this.f15078b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f15077a) {
            case 0:
                this.f15078b.start();
                return;
            default:
                ((a5.e) this.f15078b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f15077a) {
            case 0:
                this.f15078b.stop();
                return;
            default:
                ((a5.e) this.f15078b).stop();
                return;
        }
    }
}
