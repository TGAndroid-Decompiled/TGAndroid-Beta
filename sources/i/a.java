package i;

import android.graphics.drawable.Animatable;
import c8.h0;
public final class a extends h0 {
    public final int f15074a;
    public final Animatable f15075b;

    public a(Animatable animatable, int i7) {
        this.f15074a = i7;
        this.f15075b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f15074a) {
            case 0:
                this.f15075b.start();
                return;
            default:
                ((a5.e) this.f15075b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f15074a) {
            case 0:
                this.f15075b.stop();
                return;
            default:
                ((a5.e) this.f15075b).stop();
                return;
        }
    }
}
