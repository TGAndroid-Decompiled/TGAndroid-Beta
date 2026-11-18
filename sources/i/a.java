package i;

import android.graphics.drawable.Animatable;
import c8.k0;
public final class a extends k0 {
    public final int f15846a;
    public final Animatable f15847b;

    public a(Animatable animatable, int i7) {
        this.f15846a = i7;
        this.f15847b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f15846a) {
            case 0:
                this.f15847b.start();
                return;
            default:
                ((a5.e) this.f15847b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f15846a) {
            case 0:
                this.f15847b.stop();
                return;
            default:
                ((a5.e) this.f15847b).stop();
                return;
        }
    }
}
