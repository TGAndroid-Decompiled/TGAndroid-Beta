package i;

import android.graphics.drawable.Animatable;
import j7.y7;
public final class a extends y7 {
    public final int f7154a;
    public final Animatable f7155b;

    public a(Animatable animatable, int i10) {
        this.f7154a = i10;
        this.f7155b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f7154a) {
            case 0:
                this.f7155b.start();
                return;
            default:
                ((k2.d) this.f7155b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f7154a) {
            case 0:
                this.f7155b.stop();
                return;
            default:
                ((k2.d) this.f7155b).stop();
                return;
        }
    }
}
