package i;

import android.graphics.drawable.Animatable;
import v7.g8;
public final class a extends g8 {
    public final int f10539a;
    public final Animatable f10540b;

    public a(Animatable animatable, int i10) {
        this.f10539a = i10;
        this.f10540b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f10539a) {
            case 0:
                this.f10540b.start();
                return;
            default:
                ((x4.d) this.f10540b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f10539a) {
            case 0:
                this.f10540b.stop();
                return;
            default:
                ((x4.d) this.f10540b).stop();
                return;
        }
    }
}
