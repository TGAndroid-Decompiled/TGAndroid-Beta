package i;

import android.graphics.drawable.Animatable;
import j7.x7;
public final class a extends x7 {
    public final int f7171a;
    public final Animatable f7172b;

    public a(Animatable animatable, int i10) {
        this.f7171a = i10;
        this.f7172b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f7171a) {
            case 0:
                this.f7172b.start();
                return;
            default:
                ((k2.d) this.f7172b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f7171a) {
            case 0:
                this.f7172b.stop();
                return;
            default:
                ((k2.d) this.f7172b).stop();
                return;
        }
    }
}
