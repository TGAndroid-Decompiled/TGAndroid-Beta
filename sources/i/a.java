package i;

import android.graphics.drawable.Animatable;
import v7.f8;
public final class a extends f8 {
    public final int f11381a;
    public final Animatable f11382b;

    public a(Animatable animatable, int i10) {
        this.f11381a = i10;
        this.f11382b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f11381a) {
            case 0:
                this.f11382b.start();
                return;
            default:
                ((x4.d) this.f11382b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f11381a) {
            case 0:
                this.f11382b.stop();
                return;
            default:
                ((x4.d) this.f11382b).stop();
                return;
        }
    }
}
