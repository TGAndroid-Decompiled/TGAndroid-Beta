package i;

import android.graphics.drawable.Animatable;
import v7.b8;
public final class a extends b8 {
    public final int f11531a;
    public final Animatable f11532b;

    public a(Animatable animatable, int i10) {
        this.f11531a = i10;
        this.f11532b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f11531a) {
            case 0:
                this.f11532b.start();
                return;
            default:
                ((x4.d) this.f11532b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f11531a) {
            case 0:
                this.f11532b.stop();
                return;
            default:
                ((x4.d) this.f11532b).stop();
                return;
        }
    }
}
