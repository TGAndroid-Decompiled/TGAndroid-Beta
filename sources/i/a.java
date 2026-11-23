package i;

import android.graphics.drawable.Animatable;
import c8.k0;
public final class a extends k0 {
    public final int f15874a;
    public final Animatable f15875b;

    public a(Animatable animatable, int i7) {
        this.f15874a = i7;
        this.f15875b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f15874a) {
            case 0:
                this.f15875b.start();
                return;
            default:
                ((a5.e) this.f15875b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f15874a) {
            case 0:
                this.f15875b.stop();
                return;
            default:
                ((a5.e) this.f15875b).stop();
                return;
        }
    }
}
