package i;

import android.graphics.drawable.Animatable;
import j7.y7;
public final class a extends y7 {
    public final int f7712a;
    public final Animatable f7713b;

    public a(Animatable animatable, int i10) {
        this.f7712a = i10;
        this.f7713b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f7712a) {
            case 0:
                this.f7713b.start();
                return;
            default:
                ((k2.d) this.f7713b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f7712a) {
            case 0:
                this.f7713b.stop();
                return;
            default:
                ((k2.d) this.f7713b).stop();
                return;
        }
    }
}
