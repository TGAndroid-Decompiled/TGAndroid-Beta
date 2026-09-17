package i;

import android.graphics.drawable.Animatable;
import v7.f8;
public final class a extends f8 {
    public final int f10551a;
    public final Animatable f10552b;

    public a(Animatable animatable, int i10) {
        this.f10551a = i10;
        this.f10552b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f10551a) {
            case 0:
                this.f10552b.start();
                return;
            default:
                ((x4.d) this.f10552b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f10551a) {
            case 0:
                this.f10552b.stop();
                return;
            default:
                ((x4.d) this.f10552b).stop();
                return;
        }
    }
}
