package i;

import android.graphics.drawable.Animatable;
import v7.b8;
public final class a extends b8 {
    public final int f11529a;
    public final Animatable f11530b;

    public a(Animatable animatable, int i10) {
        this.f11529a = i10;
        this.f11530b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f11529a) {
            case 0:
                this.f11530b.start();
                return;
            default:
                ((x4.d) this.f11530b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f11529a) {
            case 0:
                this.f11530b.stop();
                return;
            default:
                ((x4.d) this.f11530b).stop();
                return;
        }
    }
}
