package i;

import android.graphics.drawable.Animatable;
import h7.b8;
public final class a extends b8 {
    public final int f8143a;
    public final Animatable f8144b;

    public a(Animatable animatable, int i10) {
        this.f8143a = i10;
        this.f8144b = animatable;
    }

    @Override
    public final void c() {
        switch (this.f8143a) {
            case 0:
                this.f8144b.start();
                return;
            default:
                ((k2.d) this.f8144b).start();
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.f8143a) {
            case 0:
                this.f8144b.stop();
                return;
            default:
                ((k2.d) this.f8144b).stop();
                return;
        }
    }
}
