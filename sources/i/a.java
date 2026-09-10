package i;

import android.graphics.drawable.Animatable;
import v7.i8;
public final class a extends i8 {
    public final int f10033a;
    public final Animatable f10034b;

    public a(Animatable animatable, int i10) {
        this.f10033a = i10;
        this.f10034b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f10033a) {
            case 0:
                this.f10034b.start();
                return;
            default:
                ((x4.d) this.f10034b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f10033a) {
            case 0:
                this.f10034b.stop();
                return;
            default:
                ((x4.d) this.f10034b).stop();
                return;
        }
    }
}
