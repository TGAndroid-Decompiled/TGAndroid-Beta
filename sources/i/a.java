package i;

import android.graphics.drawable.Animatable;
import c8.l0;
public final class a extends l0 {
    public final int f15935a;
    public final Animatable f15936b;

    public a(Animatable animatable, int i7) {
        this.f15935a = i7;
        this.f15936b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f15935a) {
            case 0:
                this.f15936b.start();
                return;
            default:
                ((a5.e) this.f15936b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f15935a) {
            case 0:
                this.f15936b.stop();
                return;
            default:
                ((a5.e) this.f15936b).stop();
                return;
        }
    }
}
