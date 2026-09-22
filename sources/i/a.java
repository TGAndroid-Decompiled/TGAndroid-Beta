package i;

import android.graphics.drawable.Animatable;
import v7.f8;
public final class a extends f8 {
    public final int f10548a;
    public final Animatable f10549b;

    public a(Animatable animatable, int i10) {
        this.f10548a = i10;
        this.f10549b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f10548a) {
            case 0:
                this.f10549b.start();
                return;
            default:
                ((x4.d) this.f10549b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f10548a) {
            case 0:
                this.f10549b.stop();
                return;
            default:
                ((x4.d) this.f10549b).stop();
                return;
        }
    }
}
