package i;

import android.graphics.drawable.Animatable;
import f7.h8;
public final class a extends h8 {
    public final int f10805a;
    public final Animatable f10806b;

    public a(Animatable animatable, int i9) {
        this.f10805a = i9;
        this.f10806b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f10805a) {
            case 0:
                this.f10806b.start();
                return;
            default:
                ((k2.d) this.f10806b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f10805a) {
            case 0:
                this.f10806b.stop();
                return;
            default:
                ((k2.d) this.f10806b).stop();
                return;
        }
    }
}
